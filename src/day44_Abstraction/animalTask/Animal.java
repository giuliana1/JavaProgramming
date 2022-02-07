package day44_Abstraction.animalTask;

public abstract class Animal { //PARENT CLASS PROVIDES METHODS

    private String name;   //INSTANCE VARIABLES
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreathe; //TO SET THIS STATIC VARIABLE WE MUST USE BLOCK OR YOU CAN DO = TRUE;
                                            //IT'S THE SAME THING
    static{
        canBreathe = true; //BLOCK MUST BE INITATED
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) { //CREATE CONTSTRUCTOR
        setName(name);                                     //IF YOU HAVE FINAL INSTANCE VARIABLES, YOU CREATE CONSTRUCTOR. TAMBIEN PARA LOS OTROS VARIABLES
        this.breed = breed;                                 //BETTER TO USE SETTER IF THERE'S A CONDITION FOR NAME
        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender); //for the ones that don't have a setter and getter,
        }                                                           //you can add conditions within the constructor
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }  //AFTER THE VARIABLES & BLOCK- GET SETTER AND GETTERS

    public void setName(String name) {  ////BETTER TO USE SETTER IF THERE'S A CONDITION FOR AGE, SIZE
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){   //METHODS FOR ALL-COMMON ACTION- "INSTANCE METHOD", FINAL SO IMPLEMENTATION DOESN'T CHANGE
        System.out.println(name + "is drinking");}    //PUBLIC AND FINAL, PUBLIC SO EVERYBODY HAVE ACCES & FINAL SO SOUT(IMPLEMENTATION DOESN'T CHANGE)

    public  abstract void eat(); //TO OVERRIDE

    public String toString() { //ALWAYS TO PRINT
        return getClass().getSimpleName()+"{" +  //ANTES ERA "return Animal" pero puedes usar method getClass.getSimpleName()
                "name='" + name + '\'' +            //para que imprima el nombre de DOG, CAT, etc. get class simple pq asi no incluye package
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)
			Encapsulate all the fields
			Add a constructor that can set all the fields
			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
				canBreath= true---> static boolean
 */