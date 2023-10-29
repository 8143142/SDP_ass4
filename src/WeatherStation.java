import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private WeatherData currentData;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void updateWeatherData(WeatherData data) {
        currentData = data;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(currentData);
        }
    }
}
