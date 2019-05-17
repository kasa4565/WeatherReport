package services;

import models.WeatherReport;

import java.util.ArrayList;

public class HtmlBuilder {

    private ArrayList<WeatherReport> weatherReportList;

    public HtmlBuilder() {
        WeatherReportService weatherReportService = new WeatherReportService();
        weatherReportList = weatherReportService.getWeatherReportList();
    }

    public String buildWeatherReportTable(){

        String table = "<table class=\"table\">";

        for (WeatherReport weatherReport : weatherReportList) {
            table += buildRow(weatherReport);
        }

        table += "</table>";

        return table;
    }

    private String buildRow(WeatherReport weatherReport){

        String row = "<tr>";

        row += "<td>" + weatherReport.getCity().getName() + "</td>";

        row += "<td>Clouds: " + weatherReport.getWeather().getClouds().getAll() + " %<br>";
        row += "Temperature: " + weatherReport.getWeather().getMain().getTemp() + " C<br>";
        row += "Pressure: " + weatherReport.getWeather().getMain().getPressure() + " hPa<br>";
        row += "Wind speed: " + weatherReport.getWeather().getWind().getSpeed() + " m/s</td>";

        return row + "</tr>";
    }


}
