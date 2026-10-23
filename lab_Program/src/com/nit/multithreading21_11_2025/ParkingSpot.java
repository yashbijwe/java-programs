package com.nit.multithreading21_11_2025;


class Parking {
    private boolean isOccupied = false;
    
    public synchronized void enter(String carName) {
        while (isOccupied) {
            System.out.println(carName + " waiting outside.....");
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOccupied = true;
        System.out.println(carName + " parked…");
    }
    
    public synchronized void leave(String carName) {
        isOccupied = false;
        System.out.println(carName + " left the parking spot…");
        notify(); 
    }
}
class Car extends Thread {
    private Parking parking;
    private String name;

    public Car(Parking parking, String name) {
        this.parking = parking;
        this.name = name;
    }
    @Override
    public void run() {
    	parking.enter(name);

       
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parking.leave(name);
    }
}
public class ParkingSpot {
    public static void main(String[] args) {
    	Parking parking = new Parking();

        Car car1 = new Car(parking, "Car A");
        Car car2 = new Car(parking, "Car B");

        car1.start();
        car2.start();
    }
}