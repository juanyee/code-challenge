package com.example.codechallenge.codechallenges;

/**
 * @author juan.yee
 */
public class CodeChallenge23 {
    public static void main(String[] args) {
        int carType = 0;
        int carMileage = 0;
        if (carType == 0){
            Car wagonR = new WagonR(carMileage);
            wagonR.printCar("WagonR");
        }

        if(carType == 1){
            Car hondaCity = new HondaCity(carMileage);
            hondaCity.printCar("HondaCity");
        }

        if(carType == 2){
            Car innovaCrysta = new InnovaCrysta(carMileage);
            innovaCrysta.printCar("InnovaCrysta");
        }
    }
}

abstract class Car {
    protected boolean isSedan;
    protected String seats;

    public Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean getIsSedan() {
        return this.isSedan;
    }

    public String getSeats() {
        return this.seats;
    }

    abstract public String getMileage();

    public void printCar(String name) {
        System.out.println(
                "A " + name + " is " + (this.getIsSedan() ? "" : "not ")
                        + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
                        + this.getMileage() + ".");
    }
}

/**
 *   WagonR class
 **/
class WagonR extends Car {
    String mileage = "";
    public WagonR(int mileage) {
        super(false, "4");
        this.mileage = mileage + " kmpl";
    }

    @Override
    public String getMileage() {
        return mileage;
    }
}

/**
 *   HondaCity class
 **/
class HondaCity extends Car {
    String mileage = "";
    public HondaCity(int mileage) {
        super(true, "4");
        this.mileage = mileage + " kmpl";
    }

    @Override
    public String getMileage() {
        return mileage;
    }
}

/**
 *   InnovaCrysta class
 **/
class InnovaCrysta extends Car {
    String mileage = "";
    public InnovaCrysta(int mileage) {
        super(false, "6");
        this.mileage = mileage + " kmpl";
    }

    @Override
    public String getMileage() {
        return mileage;
    }
}
