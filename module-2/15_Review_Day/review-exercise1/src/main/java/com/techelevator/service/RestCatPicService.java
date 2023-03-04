package com.techelevator.service;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatPicService implements CatPicService {

	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatPic getPic() {
		// TODO Auto-generated method stub
		restTemplate.getForObject("https://cat-data.netlify.app/api/pictures/random", CatPic.class);
		return getPic();
	}

}	
