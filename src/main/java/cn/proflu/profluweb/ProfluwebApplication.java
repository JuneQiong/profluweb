package cn.proflu.profluweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.proflu.profluweb.controller.*","cn.proflu.profluweb.service.*"})
@MapperScan(basePackages = "cn.proflu.profluweb.dao")
//@EnableSwagger2
public class ProfluwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfluwebApplication.class, args);
	}
}
