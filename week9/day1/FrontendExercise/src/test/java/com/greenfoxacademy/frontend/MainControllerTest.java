package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controllers.MainController;
import com.greenfoxacademy.frontend.controllers.RestControllers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestControllers.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    public void doubling_15_Return30() throws Exception {
        this.mockMvc.perform(get("/doubling?input=15"))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void doubling_null_returnError() throws Exception {
        this.mockMvc.perform(get("/doubling"))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void greeting_nameButNoTitle_returnNameAndTitle() throws Exception{
        this.mockMvc.perform(get("/greeter?name=Boti"))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void greeting_titleButNoName_returnNameAndTitle() throws Exception{
        this.mockMvc.perform(get("/greeter?title=student"))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void greeting_title_and_name_returnNameAndTitle() throws Exception{
        this.mockMvc.perform(get("/greeter"))
                .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
    }


    @Test
    public void greeting_name_and_title_returnNameAndTitle() throws Exception{
        this.mockMvc.perform(get("/greeter?name=Boti&title=student"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Boti, my dear student!")));
    }




}
