package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Beginning test");
    }

    @After
    public void after(){
        System.out.println("End test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> lista = new ArrayList<>();
        //oddNumbersExterminator.exterminate(lista);
        System.out.println("Testing empty list");

        Assert.assertTrue(oddNumbersExterminator.exterminate(lista) instanceof List);


    }

    @Test
    public void testOddNumbersExterminatorNormalList () {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            lista.add(rand.nextInt(20)+1);
        }
        System.out.println("Testing filled list");

        Assert.assertTrue(oddNumbersExterminator.exterminate(lista) instanceof List);


    }
}
