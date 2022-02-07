package day44_Abstraction.animalTask;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    } //no abstract because I wanna be able to do objects out of this Dog class.
    //if parent have constructor, we call constructor here (it was on red)

    public void bark(){
        System.out.println(getName()+ " is barking");
    }


    public void eat(){
        System.out.println(getName() + "eats pizza");
    }





}
