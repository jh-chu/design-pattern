package chapter02;

public class CurrentConditionDisplay implements DisplayElement, Observer {
	
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
	}

}
