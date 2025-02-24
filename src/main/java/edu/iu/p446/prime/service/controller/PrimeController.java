package edu.iu.p446.prime.service.controller;

import edu.iu.p446.prime.service.services.IPrimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimeController {

    IPrimeService primesService;

    public PrimeController(IPrimeService primesService) {
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }
}
