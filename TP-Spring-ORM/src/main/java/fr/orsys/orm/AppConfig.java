package fr.orsys.orm;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/orsys");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
//		entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
//	}
}
