package com.think.core.java.mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by esha on 27/05/16.
 */
public class PersonSort{
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person tannu= new Person(1,"Tanishq","Bisht","Not Working");
        Person esha = new Person(28,"Esha","Gusain","Lecturer");
        Person viru= new Person(31,"Virendra","Singh","Engineer");
        personList.add(tannu);
        personList.add(esha);
        personList.add(viru);

        System.out.println("UnSorted"+personList);

        Collections.sort(personList);

        System.out.println("Sorted Natural by First Name: "+personList);

        //sort by occupation
       /* Collections.sort(personList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person)o1).getOccupation().compareTo(((Person)o2).getOccupation());
            }
        });*/

        Collections.sort(personList, (o1, o2) -> ((Person) o1).getOccupation().compareTo(((Person) o2).getOccupation()));
        System.out.println("Sorted By Ocuupation: "+personList);

    }

}

class Person implements Comparable{
    private int age;
    private String name;
    private String lastName;
    private String occupation;

    public Person(int age, String name, String lastName, String occupation) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;

        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        if (!lastName.equals(person.lastName)) return false;
        return occupation != null ? occupation.equals(person.occupation) : person.occupation == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Person p =(Person) o;
        return this.name.compareTo(p.getName());
    }
}
