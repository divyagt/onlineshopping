package org.o7plannng.sbshoppingcart.repo;

import java.util.List;

import org.o7plannng.sbshoppingcart.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
