package org.inf;

public class Main {
    public static void main(String[] args) {
        Cell cellA1 = new Cell("A1");
        Cell cellA2 = new Cell("A2");
        Cell cellA3 = new Cell("A3");

        cellA3.addObserver(cellA1);
        cellA3.addObserver(cellA2);

        cellA3.update("TESTE");
    }
}