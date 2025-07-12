package Week3;

public class CompositionGetterSetterToStringExample{
    public static void main(String[] args){
        Engine myEngine = new Engine(400.5);
        Stereo myStereo = new Stereo("Panasonic");
        Car myCar = new Car(myEngine, myStereo, "Ford" , "Black");
        Car myCar2 = new Car ();
        myCar2.setEngine(new Engine(450.5)); //need to reference to object
        myCar2.setStereo(new Stereo("Unknown"));
        myCar2.setModel("Unknown");
        myCar2.setColor("White");

        //if instance variables are public:
        //System.out.println(myCar.engine.horsePower + myCar.stereo.brand + myCar.model + myCar.color);
        //for getter method://
        System.out.println("The car has " + myCar.getEngine().getHorsePower() + " with stereo " +
                        "brand of " + myCar.getStereo().getBrand() + " and " + myCar.getColor() + " "+ myCar.getModel());
                //for toString method://
        System.out.println(myCar);
        System.out.println(myCar2);
    }
}

class Engine {
    private double horsePower;

    public Engine(double horsePower) {
        this.horsePower = horsePower;
    }

    //getter//
    public double getHorsePower() {
        return horsePower;
    }

    //setter//
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    //toString //
    @Override
    public String toString() {
        return "Engine power is " + horsePower;
    }
}
class Stereo{
    private String brand;
    public Stereo(String brand){
        this.brand = brand;
    }
        //getter//
    public String getBrand() {
        return brand;
    }
        //setter//
    public void setBrand(String brand) {
        this.brand = brand;
    }
        //toString//
        @Override
        public String toString() {
            return "Car's stero brand is " + brand;
        }
}

class Car {
    private Engine engine;
    private Stereo stereo;
    private String model;
    private String color;

    public Car(Engine engine, Stereo stereo, String model, String color) {
        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.color = color;
    }
    public Car() {
    }

    public Engine getEngine () {
            return engine;
    }
    public void setEngine ( Engine power){
            engine = power;
    }

    public Stereo getStereo () {
        return stereo;
    }
    public void setStereo (Stereo stereo){
        this.stereo = stereo;
    }
    public String getModel () {
        return model;
    }
    public void setModel (String model){
        this.model = model;
    }

    public String getColor () {
            return color;
    }

    public void setColor (String color){
        this.color = color;
        }

        //to String//
        @Override
        public String toString () {
            return "The car model " + model + " colored " + color + " has stereo brand of "
                    + stereo + " and engine power of " + engine;

        }


    }
