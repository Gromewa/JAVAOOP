package vertex.lesson1.classwork;

import java.util.Arrays;

/**
 * Created by qw-user on 10.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        String[] all = service.getAll();
        System.out.println(Arrays.toString(all));

        System.out.println(Arrays.toString(service.getByName("Alex")));
        System.out.println(Arrays.toString(service.getBySurname("Holy")));
        System.out.println(service.getFirst());

    }
}
