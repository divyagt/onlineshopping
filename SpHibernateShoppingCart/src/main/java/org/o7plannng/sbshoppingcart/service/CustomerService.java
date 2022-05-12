package org.o7plannng.sbshoppingcart.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.o7plannng.sbshoppingcart.model.Customer;
import org.o7plannng.sbshoppingcart.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {
		private List<Customer> customers=new ArrayList<>(Arrays.asList(new Customer("divya1","divya1@gmail.com","divya123"),
				new Customer("sandy","sandy1@gmail.com","sandy123")));
		
		public List<Customer> insert()
		{
			return customers;
		}
	}

