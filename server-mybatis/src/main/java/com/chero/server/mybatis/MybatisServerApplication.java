package com.chero.server.mybatis;

import com.chero.server.mybatis.convert.WxMappingJackson2HttpMessageConverter;
import feign.codec.Decoder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.chero.client.user"})
@SpringBootApplication(scanBasePackages = {"com.chero"}, exclude = {RepositoryRestMvcAutoConfiguration.class})
@MapperScan(basePackages = {"com.chero.server.user.repository"})
//@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class) 防止data-rest注入/{repository}/{id}/{property}],methods=[GET]，作用同上

public class MybatisServerApplication {
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
		SpringApplication.run(MybatisServerApplication.class, args);
	}
}
