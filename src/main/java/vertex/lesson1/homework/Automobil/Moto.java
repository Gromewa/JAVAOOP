package vertex.lesson1.homework.Automobil;

public class Moto extends Vehicle {

        public Moto(String color, String model) {
            super(color, model);
        }

        @Override
        public void drive() {
            System.out.println("Мотоцикл стартует");
        }

        @Override
        public void stop() {
            System.out.println("Мотоцикл останавливается");
        }

        @Override
        public void park() {
            System.out.println("Мотоцикл припаркован");
        }

    }
