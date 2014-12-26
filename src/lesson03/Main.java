package lesson03;

import ru.javawebinar.webapp.model.Contact;
import ru.javawebinar.webapp.model.ContactType;

/**
 * GKislin
 * 26.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Contact c = new Contact(ContactType.PHONE, "1234556");
        ContactType c2 = ContactType.ICQ;
        System.out.println(ContactType.ICQ==c2);
    }
}
