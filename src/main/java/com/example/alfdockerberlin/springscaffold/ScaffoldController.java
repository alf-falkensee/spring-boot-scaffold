package com.example.alfdockerberlin.springscaffold;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/* this is java, so be aware of side-effects :-/ */

@RestController
public final class ScaffoldController {
	
	// the request id
	private int requestnumber = 0;

	@GetMapping(value="/hello", params={"name"})
	public final String hello(@RequestParam("name") String name) {
		
		requestnumber += 1;
		
		
		return requestnumber + ") Hello " + name;
		
	}
	
	
}