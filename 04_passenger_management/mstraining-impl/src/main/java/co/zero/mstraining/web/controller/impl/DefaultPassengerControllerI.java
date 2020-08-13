package co.zero.mstraining.web.controller.impl;

import co.zero.mstraining.web.api.PassengerApi;
import co.zero.mstraining.web.dto.Passenger;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class DefaultPassengerControllerI implements PassengerApi {
//    @Override
//    public CompletableFuture<String> registerPassenger() {
//        return CompletableFuture.completedFuture("Registered");
//    }
//
//    @Override
//    public CompletableFuture<String> getPassengerUserDetails(String passengerId) {
//        return CompletableFuture.completedFuture("User details");
//    }
//
//    @Override
//    public CompletableFuture<String> getRecentDestinations(String passengerId) {
//        return CompletableFuture.completedFuture("Recent Destinations");
//    }
    
    
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }
    
    @Override
    public CompletableFuture<ResponseEntity<Passenger>> getPassengerUserDetails(Long passengerId) {
        return CompletableFuture.completedFuture(new ResponseEntity(null));
    }
}