package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setNumberOfStationWithValidValue() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getNumberOfStation());
        radio.setNumberOfStation(7);
        int expected = 7;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfStationWithBoundaryMaxValue() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getNumberOfStation());
        radio.setNumberOfStation(9);
        int expected = 9;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfStationWithBoundaryMinValue() {
        Radio radio = new Radio();
        radio.setNumberOfStation(4);
        Assertions.assertEquals(4, radio.getNumberOfStation());
        radio.setNumberOfStation(0);
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfStationWithInvalidValueMoreThanMax() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getNumberOfStation());
        radio.setNumberOfStation(10);
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodNextChangesState() {
        Radio radio = new Radio();
        radio.setNumberOfStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodPrevChangesState() {
        Radio radio = new Radio();
        radio.setNumberOfStation(3);
        radio.prev();
        int expected = 2;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        int a = radio.getCurrentVolume();
        radio.increaseVolume();
        int expected = a + 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
