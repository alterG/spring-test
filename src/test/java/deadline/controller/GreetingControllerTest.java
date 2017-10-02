package deadline.controller;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;


/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingControllerTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    public void contextLoad() {
        assertThat(greetingController).isNotNull();
    }
}