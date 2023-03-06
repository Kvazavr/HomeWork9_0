package ru.netology;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberOfStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(8);
        int expected = 8;
        int actual = 8;
    }
}
