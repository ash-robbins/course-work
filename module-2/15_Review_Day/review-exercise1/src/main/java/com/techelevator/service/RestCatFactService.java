package com.techelevator.service;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {


	// add rest template
	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatFact getFact() {
		// TODO Auto-generated method stub
		restTemplate.getForObject("https://cat-data.netlify.app/api/facts/random", CatFact.class);
		return getFact();

	}

}
