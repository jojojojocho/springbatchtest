package study.springbatchtest.simpleJob.config;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.*;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.springbatchtest.TestBatchConfig;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {SimpleJobConfig.class, TestBatchConfig.class})
@SpringBatchTest
class SimpleJobConfigTest {

    @Autowired
    JobLauncherTestUtils jobLauncherTestUtils;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("simpleJob test")
    @Test
    public void simpleJobTest() throws Exception {
        //given
        JobParameters jobParameters = new JobParametersBuilder().addString("requestDate", "20220920")
                .addLong("date", new Date().getTime())
                .toJobParameters();

        //when
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParameters);


        //then
        assertEquals(jobExecution.getExitStatus(), BatchStatus.COMPLETED);
        assertEquals(jobExecution.getExitStatus(), ExitStatus.COMPLETED);

    }
}