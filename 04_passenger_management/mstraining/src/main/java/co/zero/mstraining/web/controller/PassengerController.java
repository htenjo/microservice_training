package co.zero.mstraining.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@RequestMapping(PassengerController.PASSENGER_PATH)
public interface PassengerController {
    String PASSENGER_PATH = "/passenger";
    
    @PostMapping
    CompletableFuture<String> registerPassenger();
    
    @GetMapping("/{passengerId}")
    CompletableFuture<String> getPassengerUserDetails(@PathVariable String passengerId);
    
    @GetMapping("/{passengerId}/recent-destinations")
    CompletableFuture<String> getRecentDestinations(@PathVariable String passengerId);
}
