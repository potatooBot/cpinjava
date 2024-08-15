package DSA;

class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println("Car is Moving");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


class Ferrari extends Car {
    private int numberOfDoors;

    public Ferrari(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Ferrari is honking...");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

// Child class 2
class FerrariDual extends Ferrari {
    private boolean hasNitro;

    public FerrariDual(String brand, String model, int numberOfDoors, boolean hasNitro) {
        super(brand, model, numberOfDoors);
        this.hasNitro = hasNitro;
    }

    public boolean hasNitro() {
        return hasNitro;
    }

    public void setHasNitro(boolean hasNitro) {
        this.hasNitro = hasNitro;
    }
}

 class inheritance {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla");
        Ferrari myFerrari = new Ferrari("Ferrari", "F40", 2);
        FerrariDual myFerrariDual = new FerrariDual("Ferrari", "F430", 2, true);


        myCar.drive();
        myCar.stop();
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Model: " + myCar.getModel());

        System.out.println();
        myFerrari.drive();
        myFerrari.stop();
        System.out.println("Car Brand: " + myFerrari.getBrand());
        System.out.println("Car Model: " + myFerrari.getModel());
        System.out.println("Number of doors: " + myFerrari.getNumberOfDoors());
        myFerrari.honk();

        System.out.println();

        // Calling methods from FerrariDual class
        myFerrariDual.drive();
        myFerrariDual.stop();
        System.out.println("Car Brand: " + myFerrariDual.getBrand());
        System.out.println("Car Model: " + myFerrariDual.getModel());
        System.out.println("Number of doors: " + myFerrariDual.getNumberOfDoors());
        System.out.println("Has Nitro: " + myFerrariDual.hasNitro());
    }
}
