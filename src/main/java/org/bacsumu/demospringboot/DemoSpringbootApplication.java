package org.bacsumu.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoSpringbootApplication.class, args);
		} catch (Exception e) {
			log.error("error={}",e);
		}
		
	}

}
