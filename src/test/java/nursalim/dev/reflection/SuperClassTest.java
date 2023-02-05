package nursalim.dev.reflection;

import nursalim.dev.reflection.data.Person;
import org.junit.jupiter.api.Test;

public class SuperClassTest {
    @Test
    void testGetSuperClass(){
        Class<Person> personClass = Person.class;
        Class<? super Person> objectClass = personClass.getSuperclass();
        System.out.println(objectClass);

        Class<? super Person> nullClass = objectClass.getSuperclass();
        System.out.println(nullClass);



    }
}
