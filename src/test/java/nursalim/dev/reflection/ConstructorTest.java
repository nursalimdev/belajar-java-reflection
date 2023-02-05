package nursalim.dev.reflection;

import nursalim.dev.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConstructorTest {

    @Test
    void testGetConstructor(){
        Class<Person> personClass = Person.class;
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            System.out.println(Arrays.toString(declaredConstructor.getParameterTypes()));
            System.out.println(declaredConstructor.getParameterCount());

//            Parameter[] parameters = declaredConstructor.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName());
//                System.out.println(parameter.getType());
//            }

            System.out.println("============================");
        }
    }

    @Test
    void testCreateObjectUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();

        Constructor<Person> constructorWithParameter = personClass.getConstructor(String.class, String.class);

        Person person1 = constructor.newInstance();
        Person person2 = constructorWithParameter.newInstance("Nursalim", "Al Farizi");

        System.out.println(person1);
        System.out.println(person2);



    }
}
