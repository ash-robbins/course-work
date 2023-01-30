package com.techelevator;

public class Television {

    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public Television(){
        this.isOn = false;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }
    public boolean isOn(){
        return true;
    }

    public boolean getIsOn(){
        return this.isOn;
    }
    public int getCurrentChannel(){
        return this.currentChannel;
    }
    public int getCurrentVolume(){
        return this.currentVolume;
    }

    public void turnOff() {
        if (isOn){
            isOn = false;
        }
    }
    public void turnOn(){
        if (isOn == false){
            isOn = true;
        }
    }
    public void changeChannel(int newChannel){
        if (isOn && newChannel > 3 && newChannel < 18){
            currentChannel = newChannel;
        }
    }
    public void channelUp(){
if (isOn){
    currentChannel = currentChannel + 1;
} if (currentChannel > 18)
    currentChannel = 3;
}

    public void channelDown(){
        if (isOn){
            currentChannel = currentChannel - 1;
        } if (currentChannel < 3){
            currentChannel = 18;
        }
    }
    public void raiseVolume(){
        if (isOn && currentVolume < 10){
            currentVolume = currentVolume + 1;
        }
    }
    public void lowerVolume(){
        if (isOn && currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
    }



}
