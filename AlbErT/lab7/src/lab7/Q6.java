package lab7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
abstract class Animal {
    public abstract void sound();
    
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The Dog barks.");
    }
}

class Cat extends Animal {
   
    public void sound() {
        System.out.println("The Cat meows.");
    }
}

public class Q6 {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();

      
        myDog.sound();   
        myDog.sleep();   

        myCat.sound();  
        myCat.sleep();  
    }
}
