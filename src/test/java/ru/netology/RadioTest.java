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
    public void setNumberOfStationWithInvalidValueLessThanMin() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getNumberOfStation());
        radio.setNumberOfStation(-1);
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
    public void methodNextChangesStateUpBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodNextChangesStateLowBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodNextChangesStateAcrossBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(9);
        radio.next();
        int expected = 0;
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
    public void methodPrevChangesStateUpBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodPrevChangesStateLowBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void methodPrevChangesStateAcrossBoundary() {
        Radio radio = new Radio();
        radio.setNumberOfStation(0);
        radio.prev();
        int expected = 9;
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

    @Test
    public void testIncreaseVolumeUpBoundary() {
        Radio radio = new Radio();
        for (int i = 0; i < 99; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeLowBoundary() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeUpThanMax() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        for (int i = 0; i < 68; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        int expected = 67;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeUpBoundary() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeLowBoundary() {
        Radio radio = new Radio();
        for (int i = 0; i < 1; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeLowThanMin() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
