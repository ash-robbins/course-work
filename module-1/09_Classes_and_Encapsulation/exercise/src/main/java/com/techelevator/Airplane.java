package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableFirstClassSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }
    public String getPlaneNumber(){
        return this.planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return this.totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats(){
        return this.bookedFirstClassSeats;
    }
    public int getTotalCoachSeats(){
        return this.totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return this.bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){
        return this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
       if(forFirstClass){
           bookedFirstClassSeats = totalFirstClassSeats + bookedFirstClassSeats;
       } else{
           bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
       }
       if(availableFirstClassSeats > bookedFirstClassSeats){
           return true;
       } else {
           return false;
       }
    }

}
