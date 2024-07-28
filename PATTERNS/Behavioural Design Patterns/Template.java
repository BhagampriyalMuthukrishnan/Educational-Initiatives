// Abstract class Fan implementing the Template Method design pattern
abstract class Fan {
    // Template method defining the skeleton of the operation
    public final void operate() {
        turnOn();
        adjustSettings();
        run();
        turnOff();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void adjustSettings();

    protected abstract void run();

    // Concrete methods common to all subclasses
    private void turnOn() {
        System.out.println("Turning the fan on.");
    }

    private void turnOff() {
        System.out.println("Turning the fan off.");
    }
}

// Concrete class implementing the abstract methods of Fan
class BasicElectricFan extends Fan {
    @Override
    protected void adjustSettings() {
        System.out.println("Adjusting fan speed manually.");
    }

    @Override
    protected void run() {
        System.out.println("Running the fan at constant speed.");
    }
}

// Another concrete class implementing the abstract methods of Fan
class SmartFan extends Fan {
    @Override
    protected void adjustSettings() {
        System.out.println("Adjusting fan speed automatically based on temperature.");
    }

    @Override
    protected void run() {
        System.out.println("Running the fan in smart mode with oscillation.");
    }
}

// Main class to demonstrate the Template Method pattern
public class Template {
    public static void main(String[] args) {
        Fan basicFan = new BasicElectricFan(); // Creating an instance of BasicElectricFan
        basicFan.operate(); // Calling the template method
        System.out.println();
        Fan smartFan = new SmartFan(); // Creating an instance of SmartFan
        smartFan.operate(); // Calling the template method
    }
}
