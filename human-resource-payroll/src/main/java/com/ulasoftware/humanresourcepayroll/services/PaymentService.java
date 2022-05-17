package com.ulasoftware.humanresourcepayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulasoftware.humanresourcepayroll.entities.Payment;
import com.ulasoftware.humanresourcepayroll.entities.Worker;
import com.ulasoftware.humanresourcepayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
				
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}


}
