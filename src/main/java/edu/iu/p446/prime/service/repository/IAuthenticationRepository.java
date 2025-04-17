package edu.iu.p446.prime.service.repository;

import java.io.IOException;

import edu.iu.p446.prime.service.model.Customer;

public interface IAuthenticationRepository {

    boolean save(Customer customer) throws IOException;

    Customer findByUsername(String username) throws IOException;
}
