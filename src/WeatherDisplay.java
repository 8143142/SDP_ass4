public class WeatherDisplay implements WeatherObserver {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }
    @Override
    public void update(WeatherData data) {
        System.out.println(name + " received an update: " + data);
    }
}
