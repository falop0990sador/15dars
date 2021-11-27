package com.company;

import javax.swing.*;

public class Laptop {
    private double Ram;
    private int Cpu;
     private int Storage;
    private int ScreenDiagonal;

    public double getRam() {
        return Ram;
    }

    public void setRam(double ram) {
        Ram = ram;
    }

    public int getCpu() {
        return Cpu;
    }

    public void setCpu(int cpu) {
        Cpu = cpu;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    public int getScreenDiagonal() {
        return ScreenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        ScreenDiagonal = screenDiagonal;
    }
}
