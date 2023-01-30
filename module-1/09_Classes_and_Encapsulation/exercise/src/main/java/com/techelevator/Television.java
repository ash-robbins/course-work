package com.techelevator;

public class Television {

    private boolean isOn = false;
    public int currentChannel = 3;
    public int currentVolume = 2;

    public boolean getIsOn(){
        return this.isOn;
    }
    public int getCurrentChannel(){
        return this.currentChannel;
    }
    public int getCurrentVolume(){
        return this.currentVolume;
    }
    public boolean turnOn(){
        if (isOn == false){
            isOn = true;
    }
    public void turnOff(){
        if (isOn){
            isOn = false;
        }
    }


}
