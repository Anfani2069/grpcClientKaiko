package com.grpcproject.grpc.client;

import com.grpcproject.grpc.stubs.DataManagementGrpc;
import com.grpcproject.grpc.stubs.Kaiko;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


@Service
@Slf4j
public class KaikoClient extends DataManagementGrpc.DataManagementImplBase{

    @Override
    public void initClient() throws IOException {

        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        DataManagementGrpc.DataManagementStub asynStub = DataManagementGrpc.newStub(managedChannel);
        Kaiko.IncomingData request = Kaiko.IncomingData.newBuilder()
                .setInstrumentClass("Exemple Instrument")
                .setCode("12345")
                .setIncludeUnvettedPrice(true)
                .setInterval(Kaiko.Interval.newBuilder()
                        .setStartTime("12345")
                        .setEndTime("26778")
                )
                .build();

        asynStub.streamData(request, new StreamObserver<Kaiko.ResponseData>() {
            @Override
            public void onNext(Kaiko.ResponseData responseData) {
                try {
                    writeDataToFile(responseData);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(responseData);


            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming terminé !");

            }
        });

        System.in.read();
    }

    private static void writeDataToFile(Kaiko.ResponseData responseData) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true))){

            writer.write(responseData.toString());
        }
    }


}