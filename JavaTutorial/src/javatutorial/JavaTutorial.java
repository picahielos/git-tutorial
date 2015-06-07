package javatutorial;

import neri.loves.Person;

public class JavaTutorial {
    /**
     * This is the first method that will be executed.
     * @param args 
     */
    public static void main(String[] args) {
        // this is a comment
        System.out.println("Hola Neri!");
        System.out.println("Hola Toni!");
        Person person1 = new Person("Toni", 27, 8.8);
        Person person2 = new Person("Neri", 24, 6.0);
        person1.grow(5.0);
        System.out.println(person1.getSize());
        

    }
}