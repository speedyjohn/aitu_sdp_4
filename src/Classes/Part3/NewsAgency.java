package Classes.Part3;

import Interfaces.Part3.Observable;
import Interfaces.Part3.Observer;

import java.util.ArrayList;
import java.util.List;
// Part 3
public class NewsAgency implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String latestHeadline;

    public void setHeadline(String headline) {
        this.latestHeadline = headline;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestHeadline);
        }
    }
}