package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void selectNumberOfStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(7);
        int newNumberOfStation = 7;
        int expected = 7;
        int actual = newNumberOfStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchNextStation() {
        Radio radio = new Radio();
        radio.next();
        int numberOfStation = 8;
        int expected = 9;
        int actual = radio.numberOfStation;
        Assertions.assertEquals(expected, actual);
    }
}
