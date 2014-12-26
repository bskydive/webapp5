package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Link;

import java.lang.reflect.Field;

/**
 * GKislin
 * 26.12.2014.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Contact c = new Contact(ContactType.PHONE, "1234556");
        ContactType c2 = ContactType.ICQ;
        System.out.println(ContactType.ICQ == c2);

        Field f = Link.class.getDeclaredField("url");
        f.setAccessible(true);
        Link l = new Link("fghfh", "URL");
        System.out.println(f.get(l));
        System.out.println(l.getUrl());
    }
}
