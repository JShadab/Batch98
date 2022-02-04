package com.shad.model;

import org.springframework.stereotype.Component;

@Component(value = "intel")
public class IntelProcessor implements Processor {

	public void process() {
		System.out.println("Intel is running");

	}

}
