package com.example.myproject;

import javafx.scene.Parent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@EnableAutoConfiguration
@ComponentScan  //用来搜索应用程序组件,包含直接(@Component,@Service,@Repository,@Controller)
//使用@ComponentScan 搜索beans 并且结合@Autowired构造器注入依赖
public class Application {
	public static void main(String [] args) {
		SpringApplication.run(Application.class, args);
	}
}*/


/*
//如果使用的包结构是目前项目这种结构,并且需要用到@Configuration,@EnableAutoConfiguration,@ComponentScan这三个注解,则可以直接声明
//@SpringBootApplication注解就够了
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}*/


/*

//设置不显示banner
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setShowBanner(false);
		app.run(args);
	}
}*/




