package src.headfirst.observer.weatherStation;


public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temprature, float humidity, float pressure) {
        this.tempSum += temprature;
        this.numReadings++;

        if (temprature > maxTemp) {
            maxTemp = temprature;
        }

        if (temprature < minTemp) {
            minTemp = temprature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
