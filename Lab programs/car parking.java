class ParkingSystem {
    int big;
    int medium;
    int small;

    ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        }

        if (carType == 2 && medium > 0) {
            medium--;
            return true;
        }

        if (carType == 3 && small > 0) {
            small--;
            return true;
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingSystem parking = new ParkingSystem(1, 1, 0);

        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(3));
        System.out.println(parking.addCar(1));
    }
}




true
true
false
false
