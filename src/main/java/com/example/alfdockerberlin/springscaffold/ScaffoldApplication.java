package com.example.alfdockerberlin.springscaffold;

import org.springframework.boot.SpringApplication;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaffoldApplication.class, args);
		System.out.println("Saulubinander!");
		System.out.println("1) Direct a browser to http://localhost:8080/hello/?name=world");
	}	

}
