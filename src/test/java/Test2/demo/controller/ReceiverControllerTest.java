package Test2.demo.controller;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ReceiverControllerTest {

    private MockMvc mockMvc;


    void addprofile() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post(HederConst.Auth_TOK));



    }
}
