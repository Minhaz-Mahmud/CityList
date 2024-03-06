package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    @Test
    void testDelete(){
        City city1 = new City("Jorhat","Assam");
        City city2 = new City("Ara"," Bihar");
        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.delete(city2);
        assertEquals(1, cityList.count());
    }

    @Test
    void testDeleteException(){
        City city1 = new City("Jorhat","Assam");
        City city2 = new City("Ara"," Bihar");
        City city3 = new City("Candigarh","Candigarh");
        City city4 = new City("New Delhi","Delhi");
        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city4);
        });
    }

    @Test
    void testCount(){
        City city1 = new City("Panaji","Goa");
        City city2 = new City("New Delhi","Delhi");
        City city3 = new City("Candigarh","Candigarh");
        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);

        assertEquals(3, cityList.count());
    }

    @Test
    void testSort(){
        City city1 = new City("Panaji","Goa");
        City city2 = new City("New Delhi","Delhi");
        City city3 = new City("Candigarh","Candigarh");
        City city4 = new City("Ara"," Bihar");

        CityList cityList = new CityList();
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);

        assertEquals("Ara", cityList.getCities().get(0).getCityName());
        assertEquals("Candigarh", cityList.getCities().get(1).getCityName());
        assertEquals("New Delhi", cityList.getCities().get(2).getCityName());
        assertEquals("Panaji", cityList.getCities().get(3).getCityName());
    }
}