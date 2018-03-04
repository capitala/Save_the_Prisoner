package org.chalenges.solutions.Save_the_Prisoner.integrationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.chalenges.solutions.Save_the_Prisoner.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = WebEnvironment.RANDOM_PORT,
  classes = App.class)
@AutoConfigureMockMvc
public class SolutionControllerIntegrationTests {
    @Autowired
    private MockMvc mockMvc;
	@Test
	public void getSolutionTest() throws Exception{
		
		
		mockMvc.perform(get("/getPrisoner/5 2 2"))
	    	      .andExpect(status().isOk());
	}

}
