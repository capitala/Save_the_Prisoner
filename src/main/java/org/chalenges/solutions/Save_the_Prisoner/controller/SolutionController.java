package org.chalenges.solutions.Save_the_Prisoner.controller;

import org.chalenges.solutions.Save_the_Prisoner.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController("/getPrisoner/{val}")
public class SolutionController {
@Autowired
private SolutionService serve;

@RequestMapping("/getPrisoner/{val}")
public int getSolution(@PathVariable String val)
{
	return serve.getSolution(val);
}
}
