package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {

    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        boolean b = office.add(citizen);
        assertThat(b).isTrue();
        assertThat(office.getSize()).isEqualTo(1);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    void whenCitizenNotAdded() {
        Citizen citizen1 = new Citizen("9007a", "Oleg Komissarov");
        Citizen citizen2 = new Citizen("9007a", "Komissarov Oleg");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        office.add(citizen2);
        assertThat(office.add(citizen2)).isFalse();
        assertThat(office.getSize()).isEqualTo(1);
        Citizen citizen = office.get(citizen1.getPassport());
        assertThat(citizen.getUsername()).isEqualTo("Oleg Komissarov");
    }

    @Test
    void whenNoCitizen() {
        PassportOffice office = new PassportOffice();
        assertThat(office.getSize()).isEqualTo(0);
        assertThat(office.get("9007a")).isNull();
    }
}