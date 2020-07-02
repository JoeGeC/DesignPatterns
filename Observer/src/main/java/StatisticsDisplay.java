import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final Subject weatherData;
    private ArrayList<Float> temperatureStats = new ArrayList<>();
    private float averageTemperature;
    private float maxTemperature;
    private float minTemperature;

    StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatureStats.add(temperature);
        averageTemperature = getAverageTemperature();
        maxTemperature = getMaxTemperature();
        minTemperature = getMinTemperature();
        display();
    }

    private float getMinTemperature() {
        float result = temperatureStats.get(0);
        for (float temperature : temperatureStats)
            if(temperature < result) result = temperature;
        return result;
    }

    private float getMaxTemperature() {
        float result = 0;
        for (float temperature : temperatureStats)
            if(temperature > result) result = temperature;
        return result;
    }

    private float getAverageTemperature() {
        float total = 0;
        for (float temperature : temperatureStats)
            total += temperature;
        return total / temperatureStats.size();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature: " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
