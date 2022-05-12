package org.o7plannng.sbshoppingcart.controller;

import java.util.List;

import org.o7plannng.sbshoppingcart.model.Customer;
import org.o7plannng.sbshoppingcart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	 @Autowired
		CustomerService ps;
	    
	  @GetMapping("/cust")
	 //@RequestMapping("/cust")
	    public List<Customer> custlist()
	    {
	    	return ps.insert();
	    }
}
