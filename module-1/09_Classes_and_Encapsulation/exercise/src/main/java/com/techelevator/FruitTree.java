package com.techelevator;

public class FruitTree {
    //Instance Variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;
    private int startingPiecesOfFruit;


    //Constructor
    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;

    }
    // Getters / Setters
    public String getTypeOfFruit(){
        return this.typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
        return this.piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft < numberOfPiecesToRemove){
            return true;
        } else {
            return false;
        }

    }


}
