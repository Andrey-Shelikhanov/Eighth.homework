package ru.netology.qa.pack;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void setCurrentStationValidValueSetStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationInvalidValueNotSetStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void increaseVolumeValidValueIncreaseVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMaxVolumeNoIncreaseVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeValidValueDecreaseVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMinVolumeNoDecreaseVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextStationCurrentStationIsNotLastNextStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationCurrentStationIsLastFirstStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStationCurrentStationIsNotFirstPrevStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void prevStationCurrentStationIsFirstLastStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeValidValueSetVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeInvalidValueNoSetVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(200);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeNegativeValueNoSetVolume() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentVolume(-50);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentStationValidValueInRangeSetStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationValueLessThanZeroNoSetStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationValueGreaterThanNineNoSetStation() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void newRadioInstanceCreatedCurrentStationIsZero() {
        ru.netology.qa.pack.Radio radio = new ru.netology.qa.pack.Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

}
