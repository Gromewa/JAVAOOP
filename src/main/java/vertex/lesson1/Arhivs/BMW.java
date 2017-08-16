package vertex.lesson1.Arhivs;

import java.util.Scanner;

public class BMW {
    public static void main(String[] args) {
        Automobile auto = new Automobile();

        System.out.println("Завести машину! Y/N -");
        Scanner scan = new Scanner(System.in);
        String choose = scan.nextLine();
        if (choose.toUpperCase().equals("Y")) {
            auto.setEngineOn();
        }else
            return;

        System.out.println((auto.isDrive())? "Машина едет" : "Машина не едет");
        System.out.println();
        System.out.println("До какой скорости разогнать машину? ");
        double wishSpeed = scan.nextDouble();
        do {
            if (wishSpeed > 60) {
                System.out.println("Превышен лимит скорости. Введите другое значение!");
                wishSpeed = scan.nextDouble();
            }
        }
        while (wishSpeed > (double) 60);
        for (int speed = 0; speed <= wishSpeed;speed++) {
            auto.setSpeed(speed);
        }
        System.out.println();
        System.out.println("Скорость автомобиля -" + auto.getSpeed());
        System.out.println((auto.isDrive())? "Машина едет" : "Машина не едет");
        System.out.println("Когда пожелаете остановиться, введите STOP");

        String tormoz ="";
        do {
            tormoz = scan.nextLine();
        } while (!tormoz.toUpperCase().equals("STOP"));

        while (auto.getSpeed() != 0.0) {
            auto.setSpeed(auto.getSpeed() - 1);
        }

        System.out.println();
        System.out.println("Скорость машины - " + auto.getSpeed());
        System.out.println((auto.isDrive())? "Машина едет" : "Машина не едет");
        System.out.println("Если пожелаете заглушить двигатель, введите OFF ");

        choose = "";
        do {
            choose = scan.nextLine();
        }while (!choose.toUpperCase().equals("OFF"));
        auto.setEngineOff();
        System.out.println();
        System.out.println("Finish!");

        scan.close();
    }

}
