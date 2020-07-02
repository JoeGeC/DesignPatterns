public class ForecastDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private float previousPressure = 0;
    private float pressure = 0;
    private String forecast;

    ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        previousPressure = this.pressure;
        this.pressure = pressure;
        forecast = getForecast();
        display();
    }

    private String getForecast() {
        if(pressure < previousPressure)
            return "Watch out for cooler, rainy weather.";
        else if(pressure == previousPressure)
            return "More of the same.";
        else
            return "Improving weather on the way.";
    }

    @Override
    public void display() {
        System.out.println(forecast);
    }
}
