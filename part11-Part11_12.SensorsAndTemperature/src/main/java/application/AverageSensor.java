/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author basil
 */
public class AverageSensor implements Sensor {

    private List<Sensor> mySensorList = new ArrayList<>();
    private List<Integer> readingHistory = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        mySensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        int cnt = (int) mySensorList.stream().filter(s -> s.isOn()).count();

        return (cnt == mySensorList.size());
    }

    @Override
    public void setOn() {
        mySensorList.stream().forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        mySensorList.stream().forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        List<Integer> myIntList = new ArrayList<>();
//        int arr[] = new int[mySensorList.size()];
        mySensorList.stream().forEach(s -> myIntList.add(s.read()));
        int avg = (int)myIntList.stream().mapToInt(i -> i).average().getAsDouble();
        readingHistory.add(avg);
        return avg;
    }
    public List<Integer> readings() {
        return readingHistory;
    }

}
