package services;

import clients.*;
import models.*;

import java.util.ArrayList;

public class WeatherReportService {

    private ArrayList<WeatherReport> weatherReportList;

    public WeatherReportService() {
        weatherReportList = createWeatherReportList();
    }

    public void setWeatherReportList(ArrayList<WeatherReport> weatherReportList) {
        this.weatherReportList = weatherReportList;
    }

    public ArrayList<WeatherReport> getWeatherReportList() {
        return weatherReportList;
    }

    private ArrayList<WeatherReport> createWeatherReportList(){

        WeatherClient weatherClient = new WeatherClient();
        ArrayList<WeatherReport> weatherReportList = new ArrayList<WeatherReport>();

        for (CityWeatherURL cityWeatherURL : CityWeatherURL.values()) {

            Weather weather = weatherClient.get(cityWeatherURL);
            City city = new City(cityWeatherURL.getCityName());
            WeatherReport weatherReport = new WeatherReport(city, weather);
            weatherReportList.add(weatherReport);
        }

        return weatherReportList;
    }

}
