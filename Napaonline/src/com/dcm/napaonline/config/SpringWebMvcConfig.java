package com.dcm.napaonline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration
@EnableWebMvc
@Import(HibernateConfiguration.class)
@ComponentScan(basePackages = "com.dcm.napaonline")
public class SpringWebMvcConfig extends WebMvcConfigurerAdapter{
	
	 private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB

	    @Bean
	    public InternalResourceViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/view_pages/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }

	    @Bean
	    public CommonsMultipartResolver multipartResolver() {

	        CommonsMultipartResolver cmr = new CommonsMultipartResolver();
	        cmr.setMaxUploadSize(maxUploadSizeInMb * 2);
	        cmr.setMaxUploadSizePerFile(maxUploadSizeInMb); //bytes
	        return cmr;

	    }
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
	

}
