package org.chalenges.solutions.Save_the_Prisoner.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionServiceTest {
	@Test
	public void getSolutionTest(){
		SolutionService serve=new SolutionService();
		assertEquals(serve.getSolution("5 2 2"), 3);
		
	}
	@Test
	public void getSolutionEndPrisonerTest(){
		SolutionService serve=new SolutionService();
		assertEquals(serve.getSolution("5 2 4"), 5);
		
	}
	@Test
	public void getSolutionFirstPrisonerTest(){
		SolutionService serve=new SolutionService();
		assertEquals(serve.getSolution("5 2 5"), 1);
		
	}
}
