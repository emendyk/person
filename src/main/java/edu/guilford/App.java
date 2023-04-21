package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        // attributes
        String name = "John";
        int age = 21;
        double gpa = 2.2;
        boolean isMale = true;

        //constructors
        Person person1 = new Person(name, age, gpa, isMale);
        Random rand = new Random();
        //a single statement that instantiates one object with values for all attributes
        Person person2 = new Person("Jane", rand.nextInt(100), rand.nextDouble(), false);
        
        //methods

        

        //getters and setters
        person1.setName("John");
        person1.setAge(21);
        person1.setGpa(2.2);
        person1.setMale(true);


        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGpa());
        System.out.println(person1.isMale());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGpa());
        System.out.println(person2.isMale());

        //toString
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        //helper methods
        System.out.println(person1.isTeen());
        System.out.println(person2.isTeen());

        //array list that will store Person objects
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);

        //loop that instantiates at least five objects and adds them to the array list
        for (int i = 0; i < 5; i++) {
            people.add(new Person("Person " + i, rand.nextInt(100), rand.nextDouble(), rand.nextBoolean()));
        }
        //loop that prints out the toString() value of each object in the array list
        for (Person person : people) {
            System.out.println(person.toString());
        }
        //analysis of the objects in the array list
        int teenCount = 0;
        int maleCount = 0;
        int femaleCount = 0;
        double gpaSum = 0;
        for (Person person : people) {
            if ((boolean) person.isTeen()) {
                teenCount++;
            }
            if ((boolean) person.isMale()) {
                maleCount++;
            } else {
                femaleCount++;
            }
            gpaSum = person.getGpa();
        }



        

        

    }
}
