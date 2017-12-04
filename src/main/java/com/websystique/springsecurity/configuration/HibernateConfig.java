package com.websystique.springsecurity.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration // эта аннотация и говорит о том, что данный класс является Java Configuration;
@EnableTransactionManagement // отвечает за регистрацию необходимых компонентов Spring, которые управляют обработкой транзакций
@ComponentScan({ "com.websystique.springsecurity.configuration" }) // где искать компоненты проекта.
@PropertySource(value = { "classpath:application.properties" }) // механизм добавления свойств проекта
public class HibernateConfig {

    @Autowired //отмечает конструктор, поле или метод как требующий автозаполнения инъекцией зависимости Spring,
                // заполняются соответствующими значениями сразу после создания bean'а и перед тем, как любой из методов класса будет вызван
    private Environment environment;

    @Bean
    public LocalSessionFactoryBean sessionFactory() { // настроика  Hibernate SessionFactory в контексте приложения Spring
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.websystique.springsecurity.model" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() { // подключения к физическому источнику данных
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    private Properties hibernateProperties() { //свойства JDBC-соединений
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        return properties;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) { //Привязывает сеанс Hibernate с заданной фабрики к потоку
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
}