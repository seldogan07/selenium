package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    @Test
    public void javaFaker(){
        //1st Step: Create Faker ob
        Faker faker= new Faker();
        //2nd Step
        String firstName =faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String firstname2=Faker.instance().name().firstName();
        System.out.println("firstname2 = " + firstname2);

        String fullName=faker.name().fullName();
        System.out.println("fullName = " + fullName);

        System.out.println(faker.name().username());

        System.out.println(faker.address().city());

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().zipCode());
        System.out.println(faker.number().numberBetween(1,100));
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.funnyName().name());
        System.out.println(faker.date().birthday());
    }
}
