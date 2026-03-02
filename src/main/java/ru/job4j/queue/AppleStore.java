package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer customer = null;
        for (int index = 0; index < count && !queue.isEmpty(); index++) {
            customer = queue.poll();
        }
        return customer != null ? customer.name() : "The queue is empty";
    }

    public String getFirstUpsetCustomer() {
        for (int index = 0; index < count && !queue.isEmpty(); index++) {
            queue.poll();
        }
        Customer customer = queue.poll();
        return customer != null ? customer.name() : "There are no upset customers today";
    }
}
