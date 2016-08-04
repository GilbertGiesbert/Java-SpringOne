package com.joern.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Locale;

@EnableWebMvc //mvc:annotation-driven
@Configuration
@ComponentScan({ "com.joern" })
public class SpringWebConfig extends WebMvcConfigurerAdapter {


	private static final String LOCALE_COOKIE_NAME = "myLocaleCookie";


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
	    interceptor.setParamName(LOCALE_COOKIE_NAME);
	    registry.addInterceptor(interceptor);
	}


    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

	//  by default bean name will be derived by method name

	@Bean(name = "messageSource")
	public MessageSource configureMessageSource() {
		FallbackMessageSource messageSource = new FallbackMessageSource();

		// classpath not working! why ??
		// String propertiesBasePath = "classpath:WEB-INF/i18n/";
		String propertiesBasePath = "/WEB-INF/i18n/";

		messageSource.setBasenames(new String[]{
				"classpath:i18n/srcMainRsrcProps",
				propertiesBasePath+"messages",
				propertiesBasePath+"subfolder/prompts"});

		messageSource.setCacheSeconds(5);
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setDefaultLocale(new Locale("en"));
		resolver.setCookieName(LOCALE_COOKIE_NAME);
		resolver.setCookieMaxAge(5);
		return resolver;
	}

}