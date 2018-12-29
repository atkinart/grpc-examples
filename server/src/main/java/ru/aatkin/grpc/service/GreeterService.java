package ru.aatkin.grpc.service;

import ext.maps.booking.partner.v2.BookingServiceGrpc;
import ext.maps.booking.partner.v2.BookingServiceOuterClass;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class GreeterService extends BookingServiceGrpc.BookingServiceImplBase {
    @Override
    public void checkAvailability(BookingServiceOuterClass.CheckAvailabilityRequest request, StreamObserver<BookingServiceOuterClass.CheckAvailabilityResponse> responseObserver) {
        super.checkAvailability(request, responseObserver);
    }
}
