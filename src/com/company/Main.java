package com.company;

public class Main {

    public static void main(String[] args){
        Laptop laptop = new Laptop();
        laptop.setRam(128.2);
        laptop.setCpu(2000);
        laptop.setStorage(22);
        laptop.setScreenDiagonal(14);
        System.out.println(laptop.getRam() + laptop.getCpu() + laptop.getStorage() + laptop.getScreenDiagonal());
    }
}
