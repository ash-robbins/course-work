package com.techelevator;

public class SquareWall extends Wall {

    private int sideLength;

    public SquareWall(String name, String color, int sideLength) {
          super(name, color);
          this.sideLength = sideLength;
    }

        public int getSideLength(){
            return this.sideLength;
        }

    public int getArea(){
        int area = sideLength * sideLength;
        return area;
    }
    public String toString(){
        return super.getName() + " (" + sideLength + "x" + sideLength + ") " + "square";
    }

    }


