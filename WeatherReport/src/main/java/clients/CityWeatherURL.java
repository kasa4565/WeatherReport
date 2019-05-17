package clients;

public enum CityWeatherURL {

    WARSZAWA("Warszawa"),
    GDANSK("Gdansk"),
    KRAKOW("Krakow"),
    WROCLAW("Wroclaw"),
    POZNAN("Poznan"),
    LODZ("Lodz"),
    KATOWICE("Katowice");

    private String URL;
    private String cityName;

    CityWeatherURL(String cityName) {
        this.URL = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + ",PL&units=metric&APPID=da419eb711d3884a630172a3d6b96973";
        this.cityName = cityName;
    }

    public String getURL()
    {
        return URL;
    }
    public String getCityName() { return cityName; }

}
