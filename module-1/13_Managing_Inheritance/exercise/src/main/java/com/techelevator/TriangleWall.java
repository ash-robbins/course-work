package com.techelevator;

public class TriangleWall extends Wall{

    private int base;
    private int height;

    public TriangleWall(String name, String color, int base, int height){
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public int getBase(){
        return this.base;
    }
    public int getHeight(){
        return this.base;
    }

    @Override
    public int getArea(){
        int area = (base * height) / 2;
        return area;
    }
}
