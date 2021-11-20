package DefiningClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Constructors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 1){
                Car car = new Car(tokens[0]);
                cars.add(car);
            } else {
                Car car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
                cars.add(car);
            }
        }

        for (Car car: cars) {
            System.out.println(car.carInfo());
        }
    }

    public static class Car {
        private String brand;
        private String model;
        private int horsePower;


        public Car(String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }

        public Car(String brand, String model) {
            this(brand, model, -1);
        }

        public Car(String brand, int horsePower){
            this(brand, "unknown", horsePower);
        }

        public Car(String brand) {
            this(brand, "unknown", -1);
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String carInfo() {
            return (String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower));
        }

        @Override
        public String toString() {
            return (String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower));
        }
    }
}
