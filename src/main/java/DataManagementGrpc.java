import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: kaiko.proto")
public final class DataManagementGrpc {

  private DataManagementGrpc() {}

  public static final String SERVICE_NAME = "DataManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Kaiko.IncomingData,
      Kaiko.ResponseData> getStreamDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamData",
      requestType = Kaiko.IncomingData.class,
      responseType = Kaiko.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Kaiko.IncomingData,
      Kaiko.ResponseData> getStreamDataMethod() {
    io.grpc.MethodDescriptor<Kaiko.IncomingData, Kaiko.ResponseData> getStreamDataMethod;
    if ((getStreamDataMethod = DataManagementGrpc.getStreamDataMethod) == null) {
      synchronized (DataManagementGrpc.class) {
        if ((getStreamDataMethod = DataManagementGrpc.getStreamDataMethod) == null) {
          DataManagementGrpc.getStreamDataMethod = getStreamDataMethod = 
              io.grpc.MethodDescriptor.<Kaiko.IncomingData, Kaiko.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "DataManagement", "StreamData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Kaiko.IncomingData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Kaiko.ResponseData.getDefaultInstance()))
                  .setSchemaDescriptor(new DataManagementMethodDescriptorSupplier("StreamData"))
                  .build();
          }
        }
     }
     return getStreamDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataManagementStub newStub(io.grpc.Channel channel) {
    return new DataManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class DataManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void streamData(Kaiko.IncomingData request,
        io.grpc.stub.StreamObserver<Kaiko.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Kaiko.IncomingData,
                Kaiko.ResponseData>(
                  this, METHODID_STREAM_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class DataManagementStub extends io.grpc.stub.AbstractStub<DataManagementStub> {
    private DataManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataManagementStub(channel, callOptions);
    }

    /**
     */
    public void streamData(Kaiko.IncomingData request,
        io.grpc.stub.StreamObserver<Kaiko.ResponseData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataManagementBlockingStub extends io.grpc.stub.AbstractStub<DataManagementBlockingStub> {
    private DataManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Kaiko.ResponseData> streamData(
        Kaiko.IncomingData request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataManagementFutureStub extends io.grpc.stub.AbstractStub<DataManagementFutureStub> {
    private DataManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataManagementFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_DATA:
          serviceImpl.streamData((Kaiko.IncomingData) request,
              (io.grpc.stub.StreamObserver<Kaiko.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Kaiko.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataManagement");
    }
  }

  private static final class DataManagementFileDescriptorSupplier
      extends DataManagementBaseDescriptorSupplier {
    DataManagementFileDescriptorSupplier() {}
  }

  private static final class DataManagementMethodDescriptorSupplier
      extends DataManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataManagementFileDescriptorSupplier())
              .addMethod(getStreamDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
