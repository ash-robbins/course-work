package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<String>(3);

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }


    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies() {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    public void setVaccinations() {
        this.vaccinations = vaccinations;
    }

//    public String listVaccination(List<String> vaccinations) {
//        for (String vax : vaccinations) {
//            getVaccinations().add(0, "Rabies");
//            getVaccinations().add(1, "Distemper");
//            getVaccinations().add(2, "Parvo");
//        } return vaccinations.toString();
//    }

    public String listVaccinations(){
        String result = "";
        for (int i = 0; i < vaccinations.size(); i++){
            if (vaccinations.size() - 1 == i){
                result += vaccinations.get(i);
                return result;
            } result+= vaccinations.get(i) + ", ";
        } return result;
    }
}
