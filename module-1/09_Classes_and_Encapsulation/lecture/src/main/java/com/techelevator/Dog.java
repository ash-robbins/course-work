package com.techelevator;

public class Dog {

    //class variables - static
    public static final String ANCESTOR = "Wolf";
    public static int dogCount;


    //instance variables / .this refers to instance variables
    private String name;
    private int age;
    private String breed;
    private String owner;
    private String microChipId;


    //constructor
    public Dog() {
        this.age = 1;
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    dogCount++;

    }
// getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public int setAge(int age) {
        if (age < 1) {
            age = 1;
        }

    public String getBreed() {
        return this.breed;
    }
    public String setBreed(){
        this.breed = breed;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
        public String getMicroChipId(){
            return  this.microChipId;
        }
        public String setMicroChipId(){
            this.microChipId = microChipId;
        }

}
public String bark(){
    return "woof...woof"

}
