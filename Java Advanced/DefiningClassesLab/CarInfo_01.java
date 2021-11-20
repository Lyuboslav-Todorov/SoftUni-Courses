package DefiningClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car = new Car();
            car.setBrand(tokens[0]);
            car.setModel(tokens[1]);
            car.setHorsePower(Integer.parseInt(tokens[2]));
            cars.add(car);
        }

        for (Car currentCar: cars) {
            System.out.println(currentCar.carInfo());
        }
    }

    public static class Car {
        private String brand;
        private String model;
        private int horsePower;

        public String getBrand(){
            return this.brand;
        }

        public void setBrand(String brand){
            this.brand = brand;
        }

        public String getModel(){
            return this.model;
        }

        public void setModel(String model){
            this.model = model;
        }

        public int getHorsePower(){
            return this.horsePower;
        }

        public void setHorsePower(int horsePower){
            this.horsePower = horsePower;
        }

        public String carInfo (){
            return (String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower));
        }

        @Override
        public String toString(){
            return (String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower));
        }
    }
}
