public class SimpleWeatherDataFactory implements WeatherDataFactory {
    @Override
    public WeatherData createWeatherData(double temperature, double humidity, double pressure) {
        return new WeatherData(temperature, humidity, pressure);
    }
}
