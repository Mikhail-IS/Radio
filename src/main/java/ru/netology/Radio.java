package ru.netology;

public class Radio {
    public int maxRadioStations = 9;
    public int minRadioStations = 0;
    public int radioStations = maxRadioStations;

    public int maxSoundVolume = 100;
    public int minSoundVolume = 0;
    public int soundVolume;

    public Radio(int generateNewStation){
        this.radioStations = generateNewStation;
        maxRadioStations = generateNewStation - 1;
    }

    public Radio(){
        radioStations = maxRadioStations - 1;
    }

    public int getRadioStations(){
        return radioStations;
    }

    public int getMaxRadioStations(){
        return maxRadioStations;
    }

    public int getMinRadioStations(){
        return minRadioStations;
    }

    public void nextRadioStations(int nextRadioStations){
        if (nextRadioStations < maxRadioStations){
            nextRadioStations = nextRadioStations + 1;
        } else {
            nextRadioStations = minRadioStations;
        }

        radioStations = nextRadioStations;
    }

    public void prevRadioStations(int prevRadioStations){
        if (prevRadioStations > minRadioStations){
            prevRadioStations = prevRadioStations - 1;
        } else {
            prevRadioStations = maxRadioStations;
        }

        radioStations = prevRadioStations;
    }

    public void enteringNumberRadioStations(int enteringNumberRadioStations){
        if (enteringNumberRadioStations >= minRadioStations && enteringNumberRadioStations <= maxRadioStations){
            enteringNumberRadioStations = enteringNumberRadioStations;
        } else {
            enteringNumberRadioStations = minRadioStations;
        }
        radioStations = enteringNumberRadioStations;
    }

    public int getSoundVolume(){
        return soundVolume;
    }

    public void increaseVolume(int increaseVolume) {
        if (increaseVolume >= minSoundVolume && increaseVolume < maxSoundVolume) {
            increaseVolume = increaseVolume + 1;
        } else {
            increaseVolume = 100;
        }
        soundVolume = increaseVolume;
    }

    public void reductionVolume(int reductionVolume) {
        if (reductionVolume > minSoundVolume && reductionVolume <= maxSoundVolume) {
            reductionVolume = reductionVolume - 1;
        } else {
            reductionVolume = 0;
        }
        soundVolume = reductionVolume;
    }


}
