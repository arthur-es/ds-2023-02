package org.inf;

public class Main {
    public static void main(String[] args) {
        Observable carObservable = new Observable("carro");
        CarObserver carObserver = new CarObserver();
        carObservable.addObserver(carObserver);
        carObservable.notifyObservers();
    }
}