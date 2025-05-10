package ru.netology;

public class Radio {
    public int radioStations;
    public int soundVolume;

    public int getRadioStations(){
        return radioStations;
    }

    public void nextRadioStations(int nextRadioStations){
        if (nextRadioStations < 9){
            nextRadioStations = nextRadioStations + 1;
        } else {
            nextRadioStations = 0;
        }

        radioStations = nextRadioStations;
    }

    public void prevRadioStations(int prevRadioStations){
        if (prevRadioStations > 0){
            prevRadioStations = prevRadioStations - 1;
        } else {
            prevRadioStations = 9;
        }

        radioStations = prevRadioStations;
    }

    public void enteringNumberRadioStations(int enteringNumberRadioStations){
        if (enteringNumberRadioStations >= 0 && enteringNumberRadioStations <= 9){
            enteringNumberRadioStations = enteringNumberRadioStations;
        } else {
            return;
        }
        radioStations = enteringNumberRadioStations;
    }

    public int getSoundVolume(){
        return soundVolume;
    }

    public void increaseVolume(int increaseVolume) {
        if (increaseVolume >= 0 && increaseVolume < 100) {
            increaseVolume = increaseVolume + 1;
        } else {
            increaseVolume = 100;
        }
        soundVolume = increaseVolume;
    }

    public void reductionVolume(int reductionVolume) {
        if (reductionVolume > 0 && reductionVolume <= 100) {
            reductionVolume = reductionVolume - 1;
        } else {
            reductionVolume = 0;
        }
        soundVolume = reductionVolume;
    }


}
