package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.nextRadioStations(2);

        int expected = 3;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextMaxRadioStations() {
        Radio radio = new Radio();

        radio.nextRadioStations(9);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinRadioStations() {
        Radio radio = new Radio();

        radio.prevRadioStations(-1);

        int expected = 9;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.prevRadioStations(2);

        int expected = 1;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void enteringNumberRadioStations(){
        Radio radio = new Radio();

        radio.enteringNumberRadioStations(0);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeRadioStations(){
        Radio radio = new Radio();

        radio.increaseVolume(5);

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionVolumeRadioStations(){
        Radio radio = new Radio();

        radio.reductionVolume(10);

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void enteringNumberRadioStationsMax(){
        Radio radio = new Radio();

        radio.enteringNumberRadioStations(10);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolumeRadioStations(){
        Radio radio = new Radio();

        radio.increaseVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolumeRadioStations(){
        Radio radio = new Radio();

        radio.reductionVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void GenerateNewRadioStations(){
        Radio radio = new Radio(20);

        Assertions.assertEquals(0, radio.minRadioStations);
        Assertions.assertEquals(19, radio.maxRadioStations);
        Assertions.assertEquals(20, radio.radioStations);

    }
}
