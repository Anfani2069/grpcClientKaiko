package com.grpcproject.grpc.client;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class InitClient {
    @Autowired
    private KaikoClient kaikoClient;

    @PostConstruct
    public void initKaikoClient() throws IOException {
        kaikoClient.initClient();
    }
}
