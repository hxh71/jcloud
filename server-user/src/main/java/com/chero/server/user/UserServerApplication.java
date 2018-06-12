package com.chero.server.user;

import com.chero.server.user.convert.WxMappingJackson2HttpMessageConverter;
import com.google.gson.JsonObject;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
@ComponentScan
@EnableJpaAuditing
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.chero.client.user"})
@SpringBootApplication(scanBasePackages = {"com.chero"})
public class UserServerApplication {
	@Autowired
	private RestTemplateBuilder builder;

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = builder.build();
		restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
		return restTemplate;
	}
	@Bean
	public Decoder feignDecoder(){
		WxMappingJackson2HttpMessageConverter wxConverter = new WxMappingJackson2HttpMessageConverter();
		ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(wxConverter);
		return new SpringDecoder(objectFactory);
	}
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("yyyy-MM");
//		Date date = new Date();
//		date.setTime(1528165493000l);
//		String s = df.format(date);
//		System.out.println(s);
		SpringApplication.run(UserServerApplication.class, args);
	}
}
