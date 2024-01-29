package com.Buisness.DataDemo.Application;

import com.Buisness.DataDemo.Implementation.Logic.DataProcessing;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.Buisness.DataDemo.Implementation.Logic")
public class BusinessApplication {

   public static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessApplication.class);

    public static void main(String[] args){
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        context.getBean(DataProcessing.class).printData();
    }
}
