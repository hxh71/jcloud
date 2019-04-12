package com.chero.server.user;

import com.chero.server.user.convert.WxMappingJackson2HttpMessageConverter;
//import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.RequestContextFilter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
@EnableJpaAuditing
//@EnableDiscoveryClient
//@EnableFeignClients(basePackages= {"com.chero.client.user"})
@SpringBootApplication(scanBasePackages = {"com.chero"}, exclude = {RepositoryRestMvcAutoConfiguration.class})
//@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class) 防止data-rest注入/{repository}/{id}/{property}],methods=[GET]，作用同上
public class UserServerApplication {
	@Autowired
	private RestTemplateBuilder builder;

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = builder.build();
		restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
		return restTemplate;
	}
//	@Bean
//	public Decoder feignDecoder(){
//		WxMappingJackson2HttpMessageConverter wxConverter = new WxMappingJackson2HttpMessageConverter();
//		ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(wxConverter);
//		return new SpringDecoder(objectFactory);
//	}
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("yyyy-MM");
//		Date date = new Date();
//		date.setTime(1528165493000l);
//		String s = df.format(date);
//		System.out.println(s);
		SpringApplication.run(UserServerApplication.class, args);
	}
}
