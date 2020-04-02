package com.awstechguide.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awstechguide.microservices.limitsservice.configuration.Configuration;
import com.awstechguide.microservices.limitsservice.domain.Limit;

@RestController
public class LimitsConfigController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limit getLimits() {
		return new Limit(configuration.getMinimum(),configuration.getMaximum());
	}
}
