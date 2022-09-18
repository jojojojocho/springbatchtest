package study.springbatchtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@SpringBatchTest
@Transactional
@Rollback(value = true)
class SpringbatchtestApplicationTests {

	@Test
	void contextLoads() {
	}


}
