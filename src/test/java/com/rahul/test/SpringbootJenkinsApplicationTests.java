package com.rahul.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("Test case executed...");
		assertEquals(true, true);
		
	}

}
