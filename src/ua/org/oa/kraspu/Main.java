package ua.org.oa.kraspu;

/**
 * @author kraspu [Pavlo Krasovskyi]
 * 23 nov 2018
 */
public class Main {
    public static void main(String[] args) {
        Train t1 = new Train("Киев", "Днепр", 750, 12, 9., 19.5, 4);
        Train t2 = new Train("Днепр", "Харьков", 550, 10, 3., 13.5, 5);

        t1.info();
        System.out.println("----------------------------------");
        t2.info();

    }
}
