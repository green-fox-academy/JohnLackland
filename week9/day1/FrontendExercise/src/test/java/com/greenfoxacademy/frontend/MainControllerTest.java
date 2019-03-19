package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.controllers.MainController;
import com.greenfoxacademy.frontend.controllers.RestControllers;
import com.greenfoxacademy.frontend.services.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestControllers.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogService service;

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

    @Test
    public void append_a_atTheEnd_kuty_kutya() throws Exception{
        this.mockMvc.perform(get("/appenda/kuty"))
                .andExpect(jsonPath("$.appendable", is("kutya")));
    }

    @Test
    public void append_a_but_no_appendable()throws Exception{
        this.mockMvc.perform(get("/appenda"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testUntil_sum_5_result15()throws Exception{
        this.mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result", is(15)));
    }

    @Test
    public void testUntil_factor_5_result15()throws Exception{
        this.mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result", is(120)));
    }

    @Test
    public void test_until_action_is_null()throws Exception{
        this.mockMvc.perform(post("/dountil/sum"))
                .andExpect(jsonPath("$.error", is("Please provide a number!")));
    }

    @Test
    public void tets_ArrayHandler_sum_() throws Exception{
        this.mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\":\"sum\", \"numbers\": [1,2,5,10] }"))
                .andExpect(jsonPath("$.result", is(18)));

    }

    @Test
    public void tets_ArrayHandler_multiply_() throws Exception{
        this.mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\":\"multiply\", \"numbers\": [1,2,5,10] }"))
                .andExpect(jsonPath("$.result", is(100)));

    }

    @Test
    public void tets_ArrayHandler_double() throws Exception{
        this.mockMvc.perform(post("/arrays")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\":\"double\", \"numbers\": [1,2,5,10] }"))
                .andExpect(jsonPath("$.result", is(Arrays.asList(2,4,10,20))));

    }

    @Test
    public void tets_ArrayHandler_double_but_Json_Object_isNull() throws Exception{
        this.mockMvc.perform(post("/arrays"))
                .andExpect(jsonPath("$.error", is("Please provide a object!")));

    }




}
