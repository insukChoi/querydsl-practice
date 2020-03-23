package study.querydslpractice;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class QuerydslPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydslPracticeApplication.class, args);
	}
}
