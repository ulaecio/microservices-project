package com.ulasoftware.humanresourcepayroll.services;

import org.springframework.stereotype.Service;

import com.ulasoftware.humanresourcepayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}


}
