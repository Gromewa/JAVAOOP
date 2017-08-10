package vertex.lesson1.classwork;

/**
 * Created by qw-user on 10.08.2017.
 */
public class Service {
    private Database database = new Database();

    public String[] getAll() {
        return database.getMas();
    }

    public String getFirst() {
        return database.getMas()[0];
    }

    public String getLast() {

    }


    public String[] getByName(String name) {
        String[] mas = database.getMas();
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].startsWith(name)) {
                count++;
            }
        }
        String[] byNames = new String[count];
            count = 0;
            for (int i1 = 0; i1 < mas.length; i1++) {
                if (mas[i1].startsWith(name)) {
                    byNames[count]=mas[i1];
                    count++;
                }

            }
            return byNames;
    }

    public String[] getBySurname(String name) {
        String[] mas = database.getMas();
        int count=0;
        for (int i = 0; i < mas.length ; i++) {
            if (mas[i].endsWith(name)) {
                count++;
            }
        }
        String[] bySurname = new String[count];
        count = 0;
        for (int i2 = 0; i2 < mas.length; i2++) {
            if (mas[i2].endsWith(name)) {
                bySurname[count]=mas[i2];
                count++;
            }

        }
        return bySurname;
    }

}
