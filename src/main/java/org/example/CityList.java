package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
    public List<City> getCities() {
        List<City> cityList = cities;
        Collections.sort(cityList);
        return cityList;
    }

    /**
     * This deletes  city
     * @param city
     *       Removes city
     */
    void delete(City city){
        boolean found = false;
        for (Iterator<City> iterator = cities.iterator(); iterator.hasNext();) {
            City i = iterator.next();
            if (i.getCityName().equals(city.getCityName())) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("City not found");
        }
    }

    /**
     * this function counts the number of cities
     * @return
     *      The count of city-list
     */
    int  count(){
        int cnt = 0 ;
        for(City i : cities){
            cnt++ ;
        }
        return cnt ;
    }
}