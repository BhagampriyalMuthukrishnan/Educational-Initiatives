import java.util.*;

// Define the Vehicle interface
interface SpaceVehicle {
    void launch();

    String getType();
}

// Concrete classes implementing the SpaceVehicle interface
class Spaceship implements SpaceVehicle {
    @Override
    public void launch() {
        System.out.println("Launching the Spaceship.");
    }

    @Override
    public String getType() {
        return "Spaceship";
    }
}

class Satellite implements SpaceVehicle {
    @Override
    public void launch() {
        System.out.println("Launching the Satellite.");
    }

    @Override
    public String getType() {
        return "Satellite";
    }
}

class Rover implements SpaceVehicle {
    @Override
    public void launch() {
        System.out.println("Launching the Rover.");
    }

    @Override
    public String getType() {
        return "Rover";
    }
}

// Define the VehicleFactory interface
interface VehicleFactory {
    SpaceVehicle createVehicle();
}

// Concrete factories for creating specific types of space vehicles
class SpaceshipFactory implements VehicleFactory {
    @Override
    public SpaceVehicle createVehicle() {
        return new Spaceship();
    }
}

class SatelliteFactory implements VehicleFactory {
    @Override
    public SpaceVehicle createVehicle() {
        return new Satellite();
    }
}

class RoverFactory implements VehicleFactory {
    @Override
    public SpaceVehicle createVehicle() {
        return new Rover();
    }
}

// Main class to demonstrate the Factory Method pattern
public class Factory {
    public static void main(String[] args) {
        // Create factories
        VehicleFactory spaceshipFactory = new SpaceshipFactory();
        VehicleFactory satelliteFactory = new SatelliteFactory();
        VehicleFactory roverFactory = new RoverFactory();

        // Create a list to hold the space vehicles
        List<SpaceVehicle> vehicles = new ArrayList<>();
        vehicles.add(spaceshipFactory.createVehicle());
        vehicles.add(satelliteFactory.createVehicle());
        vehicles.add(roverFactory.createVehicle());

        // Launch each vehicle and display its type
        for (SpaceVehicle vehicle : vehicles) {
            vehicle.launch();
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println(); // Blank line for readability
        }
    }
}
