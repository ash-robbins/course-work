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
        public String getTypeOfFruit() {
            return this.getTypeOfFruit();
        }
        public int getPiecesOfFruitLeft() {
            return this.piecesOfFruitLeft;
        }
        //Method
        public boolean pickFruit(int numberOfPiecesToRemove) {
          int piecesOfFruitLeft = - numberOfPiecesToRemove;
          if(piecesOfFruitLeft > 0){
              return true;
          } else {
              return false;
          }

        }


}
