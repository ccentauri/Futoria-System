package main.application.configuration.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"main.repository", "com.futoria.core.repository"})
@EnableTransactionManagement
public class JPAConfiguration {
}
