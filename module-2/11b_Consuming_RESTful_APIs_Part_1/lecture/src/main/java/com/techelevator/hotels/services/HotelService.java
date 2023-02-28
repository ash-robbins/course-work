package com.techelevator.hotels.services;

import com.techelevator.hotels.model.City;
import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
        return hotels;
    }

    public Review[] listReviews() {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
        return reviews;
    }

    public Hotel getHotelById(int id) {
        Hotel hotels = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
        return hotels;
    }

    public Review[] getReviewsByHotelId(int hotelId) {
        return null;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return null;
    }

    public City getWithCustomQuery(){
        return null;
    }

}
