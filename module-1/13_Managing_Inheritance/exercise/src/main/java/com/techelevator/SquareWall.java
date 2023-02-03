package com.techelevator;

public class SquareWall extends RectangleWall {

    private int sideLength;
    private String name;
    private String color;

    public SquareWall(String name, String color, int sideLength) {
          //super(name, color);
          this.name = name;
          this.color = color;
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


