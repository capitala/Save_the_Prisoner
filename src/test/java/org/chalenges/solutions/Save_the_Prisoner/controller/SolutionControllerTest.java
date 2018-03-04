package org.chalenges.solutions.Save_the_Prisoner.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.chalenges.solutions.Save_the_Prisoner.service.SolutionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
@RunWith(SpringRunner.class)
@WebMvcTest(SolutionController.class)
public class SolutionControllerTest {
	@Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private SolutionService service;
    
    
    
	@Test
	public void getSolutionTest() throws Exception{
		
        Mockito.when(service.getSolution("5 2 2"))
        .thenReturn(1);
		
		mockMvc.perform(get("/getPrisoner/5%202%202"))
	    	      .andExpect(status().isOk());
	}
	
}
