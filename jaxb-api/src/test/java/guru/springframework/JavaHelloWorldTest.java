package guru.springframework;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldTest {
    @Test
    public void getHello() {
        System.out.println("##################################");
        System.out.println(System.getProperty("TEST_HOST"));
    }
}
