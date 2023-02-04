package nursalim.dev.reflection;

import nursalim.dev.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void testGetFields(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field field: declaredFields){
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Nursalim", "Al Farizi");
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Object fieldValue = firstName.get(person);
        System.out.println(fieldValue);

    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Nursalim", "Al Farizi");
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        firstName.set(person, "Abdullah"); //person.setFirstName("Abdullah")
        System.out.println(firstName.get(person));

    }
}
