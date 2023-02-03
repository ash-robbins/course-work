package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }

    public String getSpecies(){
        return this.species;
    }

    public String setSpecies(){
        return this.species = species;
    }

    public List<String> getVaccinations(){
        return vaccinations;
    }

    public void setVaccinations(){
        this.vaccinations = vaccinations;
    }

    public String ListVaccination(){
        for(String vax : vaccinations) {
            return ListVaccination();
        }

    }
}
