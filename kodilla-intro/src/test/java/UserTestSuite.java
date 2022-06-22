import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {
    User user = new User("Aga", 12);

    @Test
    public void shouldReturnName(){
        String name = user.getName();
        Assertions.assertEquals("Aga", name);
    }

    @Test
    public void shouldReturnAge(){
        int age = user.getAge();
        Assertions.assertEquals(12, age);
    }

}