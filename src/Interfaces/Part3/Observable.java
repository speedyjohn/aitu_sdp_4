package Interfaces.Part3;

import Interfaces.Part3.Observer;

// Part 3
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
