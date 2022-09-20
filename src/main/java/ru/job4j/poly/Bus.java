package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество пассажиров " + passengers);
    }

    @Override
    public int fill(int fuel) {
        int price = 10;
        return fuel * price;
    }
}
