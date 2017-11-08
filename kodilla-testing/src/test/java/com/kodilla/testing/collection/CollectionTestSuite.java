package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
private   OddNumbersExterminator oddNumbersExterminator;
    @Before
    public void before() {
        oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Beginning test");
    }

    @After
    public void after(){
        System.out.println("End test");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){

        ArrayList<Integer> lista = new ArrayList<>();
        //oddNumbersExterminator.exterminate(lista);
        System.out.println("Testing empty list");

        //lepiej sprawdzić coś bardziej sensownego, czy nie jest nullem, i czy jest pusta, itp
        Assert.assertTrue(oddNumbersExterminator.exterminate(lista) instanceof List);


    }

    @Test
    public void testOddNumbersExterminatorNormalList () {

        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            //rand to nie jest dobry pomysł
            lista.add(rand.nextInt(20)+1);
        }
        System.out.println("Testing filled list");

        //Po co sprawdzasz jakiego jest typu skoro to jest ustawione w definicji metody?
        //Skoro to test pozytywnego przyapdku to powinieneś sprawdzać czy zostały usunięte odpowiedznie liczby,
        //tzn stworzyć kolekcje z usuniętymi i porównać z tym co zwróci metoda
        Assert.assertTrue(oddNumbersExterminator.exterminate(lista) instanceof List);


    }

    //zaimplementuj pod ten przypadek testowy
    //i dokończ assercje
    @Test
    public void testNull() throws Exception {
        oddNumbersExterminator.exterminate(null);
    }
}
