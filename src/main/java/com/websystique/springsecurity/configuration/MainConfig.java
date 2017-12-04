package com.websystique.springsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc //разрешает нашему проекту использовать MVC;
@ComponentScan(basePackages = "com.websystique.springsecurity")
public class MainConfig extends WebMvcConfigurerAdapter //позволяет подклассам переопределять только те методы, которые им интересны.
{

    @Bean
    public ViewResolver viewResolver()// позволяет устанавливать префикс или суффикс, для имени представления, чтобы создать URL страницы окончательного просмотра;
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    @Override// объявление о переопределении метода базового класса.
    public void addResourceHandlers(ResourceHandlerRegistry registry) {// указательь на расположение ресурсов с определенным шаблоном общего URL.
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
}