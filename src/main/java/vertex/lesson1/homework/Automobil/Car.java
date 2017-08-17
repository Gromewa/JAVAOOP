package vertex.lesson1.homework.Automobil;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Car extends Vehicle {

        private int doorse;

        public Car(String color, String model, int doors) {
            super(color, model);
            this.doorse = doors;
        }

        @Override
        public void drive() {
            System.out.println("Машина едет");
        }

        @Override
        public void stop() {
            System.out.println("Машина стоит");
        }

        @Override
        public void park() {
            System.out.println("Машина припаркована");
        }

    }
