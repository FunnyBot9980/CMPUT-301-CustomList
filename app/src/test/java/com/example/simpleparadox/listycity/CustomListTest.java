package com.example.simpleparadox.listycity;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());

    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assert list.hasCity(city);
    }

    @Test
    public void deleteCityTest() {
        list.addCity(new City("Edmonton", "Alberta"));
        int listSize = list.getCount();
        list.deleteCity(0);
        assertEquals(listSize - 1, list.getCount());
    }

    @Test
    public void countCityTest() {
        list.addCity(new City("Edmonton", "Alberta"));
        list.addCity(new City("Ridgeway", "Ontario"));
        int listSize = list.getCount();
        assertEquals(list.countCities(), list.getCount());
    }

}
