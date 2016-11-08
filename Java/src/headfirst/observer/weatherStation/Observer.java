package src.headfirst.observer.weatherStation;


public interface Observer {

    public void update(float temperature, float humidity, float pressure);

}
