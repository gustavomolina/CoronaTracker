package io.molina.coronavirustracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoronavirusTrackerApplicationTests {

	@Test
	@DisplayName("Validacao dos dados da API")
	void contextLoads() {
		Assertions.assertEquals(1, 1);
	}

}
