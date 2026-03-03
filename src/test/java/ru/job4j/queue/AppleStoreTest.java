package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppleStoreTest {

    @Test
    void whenGetLastHappy() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        customers.add(new Customer("Alexei", 900));
        customers.add(new Customer("Iryna", 1250));
        customers.add(new Customer("Elena", 750));
        customers.add(new Customer("Rail", 950));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertThat(customer).isEqualTo("Alexei");
    }

    @Test
    void whenQueueIsEmpty() {
        Queue<Customer> customers = new LinkedList<>();
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertThat(customers).isEmpty();
        assertThat(customer).isEqualTo("The queue is empty");
    }

    @Test
    void whenGetFirstUpset() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        customers.add(new Customer("Alexei", 900));
        customers.add(new Customer("Iryna", 1250));
        customers.add(new Customer("Elena", 750));
        customers.add(new Customer("Rail", 950));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertThat(customer).isEqualTo("Iryna");
    }

    @Test
    void whenCountMoreThanQueueThenUpsetDoestExist() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        int count = 5;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertThat(customer).isEqualTo("There are no upset customers today");
    }

    @Test
    void whenCount0QueueExistsThenUpset() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        int count = 0;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertThat(customer).isEqualTo("Petr");
    }
}