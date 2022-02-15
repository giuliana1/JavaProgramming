package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a =a;
    }
    */

    /*
    static{
        b = 100;
    }
    */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */

    static void method2(){
        System.out.println("Static method");
    }

    void method3();

    default void method4(){
        System.out.println("Default method");
    }

}


/*
we can't have encapsulation in interface. Interface is PUBLIC, not private variables or methods. No intance method or variable
befenit because abrstarct has not implementation as Interface/ Before Java7 no there was not interface
Abstract method odoesn't have body
Interface- you can use default method. it has a body
extra: instance you call from class
static is one copy shared by all object
Static method in interface are part of the interface class can’t implement
or override it whereas class can override the default method.  -from google
static method- if the method doesn't need instance variable
there is no instance variable in interface ONLY STATIC AND VARIABLE
* we create Default method in interface because default can have a body.  Abstract method doesn't have a body. save space & overrides
static call thr ----------------
instance thr object
why we need interface? one class can extend one class ONLY/ only. class can implements multiple interfaces
 */


