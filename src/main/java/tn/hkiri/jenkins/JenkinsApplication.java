package tn.hkiri.jenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsApplication {



	@PostConstruct
	public void init(){
		log.info("Application starting ...");
	}
	public static void main(String[] args) {
		log.info("Application Executed ....");
		SpringApplication.run(JenkinsApplication.class, args);

	}

}
