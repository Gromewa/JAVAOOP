package vertex.lesson1.homework.Automobil;

public class AutoMain {

        public static void main(String[] args) {
                
            Car sportsCar = new Car("White","McLaren",2);
            sportsCar.drive();
            sportsCar.stop();
            sportsCar.park();
            sportsCar.horn();


            Moto sports = new Moto("Green","Suzuki");
            sports.drive();
            sports.park();
            sports.stop();
            sports.horn();
        }

    }
