package study.springbatchtest.simpleJob.config;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import study.springbatchtest.simpleJob.config.reader.SimpleReader;
import study.springbatchtest.simpleJob.config.writer.SimpleWriter;

@RequiredArgsConstructor
public class SimpleJobConfig {

    private final JobBuilderFactory jobBuilderFactory;

    private final StepBuilderFactory stepBuilderFactory;

    private final JdbcTemplate jdbcTemplate;


    @Bean
    public Job simpleJob(){
        return jobBuilderFactory.get("simpleJob")
                .start(simpleStep())
                .build();
    }
    @Bean
    private Step simpleStep() {
        return stepBuilderFactory.get("simpleStep")
                .<String,String>chunk(100)
                .reader(simpleReader())
                .writer(simpleWriter())
                .build();


    }
    @Bean
    private SimpleReader simpleReader() {
        return new SimpleReader();
    }

    @Bean
    private SimpleWriter simpleWriter() {
        return new SimpleWriter(this.jdbcTemplate);
    }


}
