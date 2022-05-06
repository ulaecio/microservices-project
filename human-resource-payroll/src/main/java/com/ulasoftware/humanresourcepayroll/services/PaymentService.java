package com.ulasoftware.humanresourcepayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ulasoftware.humanresourcepayroll.entities.Payment;
import com.ulasoftware.humanresourcepayroll.entities.Worker;

@Service
public class PaymentService {
	
	//declaração do host como uma propriedade do projeto
	@Value("${hr-worker.host}")
	private String workerHost;
	
	//Injeção do RestTemplate automática
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		
		//Requisição API esterna com o restTemplate
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}


}
