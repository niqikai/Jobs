package indi.welfare.jobs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("indi.welfare.jobs.mapper")
public class JobsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobsApplication.class, args);
    }

}
