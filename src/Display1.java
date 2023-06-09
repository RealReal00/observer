public class Display1 implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public Display1(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
