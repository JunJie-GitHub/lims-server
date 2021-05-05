package org.honma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
@MapperScan({"org.honma.*.mapper.**"})
public class LimsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimsApplication.class, args);
	}

}
