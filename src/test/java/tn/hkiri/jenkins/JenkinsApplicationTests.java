package tn.hkiri.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class JenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("executing unit testing");
		assertEquals(true,true);
	}

}
