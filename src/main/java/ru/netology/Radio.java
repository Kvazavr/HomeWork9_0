package ru.netology;

public class Radio {
    public int numberOfStation;
    public int stationCount = 10;
    public int currentVolume;
    public int maxVolume = 100;
    public int minVolume = 0;

    public void setNumberOfStation(int newNumberOfStation) {

        if (newNumberOfStation > 9) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }

    public void next() {
        numberOfStation++;
        if (numberOfStation > stationCount - 1) {
            numberOfStation = 0;
        }

    }

    public void prev() {
        numberOfStation--;
        if (numberOfStation < 0) {
            numberOfStation = stationCount - 1;
        }
    }

    public void increaseVolume() {
        currentVolume++;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        currentVolume--;
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }
}
