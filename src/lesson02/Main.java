package lesson02;

import ru.javawebinar.webapp.model.Link;

/**
 * GKislin
 * 19.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        int i= 5;
        Link l1 = new Link("JavaWebinar", "javawebinar.ru");
        Link l2 = l1;
        Link l3 = new Link(l1);
        System.out.println(l1.getClass());
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
}
