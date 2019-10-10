package com.fedex.smm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {
	
	@RequestMapping(value="plannedCommit", method=RequestMethod.GET)
	public String calculatePlannedCommitDate() {
		
		return "Planned commit";
	}

}
