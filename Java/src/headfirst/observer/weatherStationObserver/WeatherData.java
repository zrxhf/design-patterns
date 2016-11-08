package src.headfirst.observer.weatherStationObserver;
	
import java.util.Observable;
import java.util.Observer;

/**
 * 使用JAVA 内置的Observable类, 对比之前自己实现的Subject接口
 * Observable类 违反了 “多用组合，少用继承” 的原则
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

    /**
     * 构造器不需要为了记住观察者而及那里数据结构了
     */
	public WeatherData() { }

    /**
     * 注意：没有调用notifyObservers()传送数据
     * 表示我们采用的做法是“拉”
     */
    public void measurementsChanged() {
		setChanged(); // 表示状态已改变
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
