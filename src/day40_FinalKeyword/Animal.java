package day40_FinalKeyword;

public class Animal {

    public String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }
}
