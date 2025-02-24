package edu.iu.p446.prime.service.services;

import java.io.IOException;

import edu.iu.p446.prime.service.model.Customer;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;

    boolean login(String username, String password) throws IOException;
}
