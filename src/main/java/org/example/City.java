package org.example;

public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * It is constructor
     * @param city
     *           city name
     * @param province
     *           province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Getter for city name
     * @return cityName
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Getter for city name
     * @return ProvinceName
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     *It compares two city names
     * @param city the object to be compared.
     * @return +1 or 0  or -1
     */

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
