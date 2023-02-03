package com.techelevator;

public class RectangleWall extends Wall {

    private int length;
    private int height;
    private String name;
    private String color;


    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public int getArea() {
        int area = length * height;
        return area;
    }

    public String toString(){
        return super.getName() + " (" + length + "x" + height + ") " + "rectangle";
        }
    }

