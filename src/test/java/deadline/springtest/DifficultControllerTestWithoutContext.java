package deadline.springtest;

import deadline.controller.DifficultController;
import deadline.service.DifficultService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@RunWith(SpringRunner.class)
@WebMvcTest(DifficultController.class)
public class DifficultControllerTestWithoutContext {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DifficultService difficultService;

    @Test
    public void controllerTest() throws Exception {
        when(difficultService.say()).thenReturn("ayayayaya");
        mockMvc.perform(get("/difficult")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("ayay")));
    }


}
