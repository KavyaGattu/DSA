class Vehicle {
    String licensePlate;
    Vehicle next;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.next = null;
    }
}

class ParkingLot {
    private Vehicle top;

    public ParkingLot() {
        this.top = null;
    }

    // Method to park a vehicle
    public void parkVehicle(String licensePlate) {
        Vehicle newVehicle = new Vehicle(licensePlate);
        if (top == null) {
            top = newVehicle;
        } else {
            newVehicle.next = top;
            top = newVehicle;
        }
        System.out.println("Vehicle " + licensePlate + " parked.");
    }

    // Method to remove a vehicle
    public void removeVehicle() {
        if (top == null) {
            System.out.println("No vehicles to remove.");
            return;
        }
        System.out.println("Vehicle " + top.licensePlate + " removed.");
        top = top.next;
    }

    // Method to view the current status of the parking lot
    public void viewParkingLotStatus() {
        if (top == null) {
            System.out.println("No vehicles parked.");
            return;
        }
        Vehicle current = top;
        System.out.println("Current vehicles in the parking lot:");
        while (current != null) {
            System.out.println(current.licensePlate);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.parkVehicle("ABC123");
        parkingLot.parkVehicle("XYZ789");
        parkingLot.viewParkingLotStatus();
        parkingLot.removeVehicle();
        parkingLot.viewParkingLotStatus();
        parkingLot.removeVehicle();
        parkingLot.viewParkingLotStatus();
    }
}
