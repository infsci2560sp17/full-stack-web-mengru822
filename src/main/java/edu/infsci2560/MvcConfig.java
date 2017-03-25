package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/dance").setViewName("dance");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/music").setViewName("music");
        registry.addViewController("/good").setViewName("good");    
        registry.addViewController("/share").setViewName("share");
        registry.addViewController("/files").setViewName("uploadForm");
        registry.addViewController("/video").setViewName("video");  
    }
}