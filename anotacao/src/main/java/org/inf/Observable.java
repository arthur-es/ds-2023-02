package org.inf;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private String identificador;
    private List<Object> observers = new ArrayList<>();

    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void addObserver(Object observer) {
        if (observer.getClass().isAnnotationPresent(Observer.class)) {
            Observer observerAnnotation = observer.getClass().getAnnotation(Observer.class);
            if (observerAnnotation.observado().equals(this.identificador)) {
                this.observers.add(observer);
            }
        }
    }

    public void notifyObservers() {
        for (Object observer : this.observers) {
            System.out.println(observer + " foi notificado!");
        }
    }
}
