package ru.netology;

public class Radio {
    private int numberOfStation;
    private int stationCount = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setNumberOfStation(int newNumberOfStation) {

        if (newNumberOfStation > stationCount - 1 || newNumberOfStation < 0) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
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

    public int getCurrentVolume() {
        return currentVolume;
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
