public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver observer1 = new WeatherDisplay("Observer 1");
        WeatherObserver observer2 = new WeatherDisplay("Observer 2");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        WeatherDataFactory dataFactory = new SimpleWeatherDataFactory();

        WeatherData data1 = dataFactory.createWeatherData(25.5, 60.0, 1013.2);
        WeatherData data2 = dataFactory.createWeatherData(30.0, 55.5, 1010.0);

        weatherStation.updateWeatherData(data1);
        weatherStation.updateWeatherData(data2);
    }
}