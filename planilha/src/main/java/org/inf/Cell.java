package org.inf;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String cellName);
}

class Cell implements Observer {
    private String name;
    private int value;
    private List<Cell> observers; // Cells watching for changes

    public Cell(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addObserver(Cell cell) {
        observers.add(cell);
        for (Cell currentCell : observers) {
            System.out.println("-" + currentCell.getName());
        }
    }

    public void notifyObservers() {
        for (Cell cell : observers) {
            cell.update(this.name);
        }
    }

    @Override
    public void update(String cellName) {
        System.out.println("Reavaliar " + this.getName() + " por mudança ocorrida em " + cellName);
        notifyObservers();
    }
}