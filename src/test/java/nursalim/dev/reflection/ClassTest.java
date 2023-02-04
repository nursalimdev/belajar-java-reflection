package nursalim.dev.reflection;

import nursalim.dev.reflection.data.Person;
import org.junit.jupiter.api.Test;

public class ClassTest {
    @Test
    void testCreateClass() throws ClassNotFoundException {
        Class<Person> personClass1 = Person.class;
        Class<?> personClass2 = Class.forName("nursalim.dev.reflection.data.Person");

        Person person = new Person();
        Class<? extends Person> personClass3 = person.getClass();
        



    }
}
