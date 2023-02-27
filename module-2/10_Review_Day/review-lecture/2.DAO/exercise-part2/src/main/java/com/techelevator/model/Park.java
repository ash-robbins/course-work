package com.techelevator.model;

import java.time.LocalDate;

public class Park {

    private String name;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEstablished_date(LocalDate established_date) {
        this.established_date = established_date;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVisitors(int visitors) {
        this.visitors = visitors;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private LocalDate established_date;
    private int area;
    private int id;
    private int visitors;
    private String description;

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", established_date=" + established_date +
                ", area=" + area +
                ", visitors=" + visitors +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }



    //Override toString(), equals() and hashcode()



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getEstablished_date() {
        return established_date;
    }

    public int getArea() {
        return area;
    }

    public int getVisitors() {
        return visitors;
    }

    public String getDescription() {
        return description;
    }

    //Override toString(), equals() and hashcode()
}
