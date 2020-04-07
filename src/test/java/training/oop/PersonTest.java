package training.oop;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class PersonTest {
    @Test
    public void should_person_introduce_as_expect() {
        Person person = new Person("Tom", 21);
        String answer = "My name is Tom. I am 21 years old.\n";

        assertThat(person.Introduce().equals(answer));
    }
}
