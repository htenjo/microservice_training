package co.zero.mstraining.web.controller.impl;

import co.zero.mstraining.web.controller.PassengerController;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class DefaultPassengerController implements PassengerController {
    @Override
    public CompletableFuture<String> registerPassenger() {
        return CompletableFuture.completedFuture("Registered");
    }
    
    @Override
    public CompletableFuture<String> getPassengerUserDetails(String passengerId) {
        return CompletableFuture.completedFuture("User details");
    }
    
    @Override
    public CompletableFuture<String> getRecentDestinations(String passengerId) {
        return CompletableFuture.completedFuture("Recent Destinations");
    }
}