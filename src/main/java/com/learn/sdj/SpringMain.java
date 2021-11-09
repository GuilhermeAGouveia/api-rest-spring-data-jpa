package com.learn.sdj;

import com.learn.sdj.Entity.Student;
import com.learn.sdj.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;

@SpringBootApplication
public class SpringMain {

    public static void main(String[] args){
        SpringApplication.run(SpringMain.class, args);
    }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/student").allowedOrigins("http://localhost:3000");
//            }
//        };
//    }
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//
//        return args -> {
//            Student student = new Student("Guilherme", "Gouveia", "guilhermegouveia@gmail.com", LocalDate.of(2001, 12, 26));
//            studentRepository.save(student);
//        };
//    }

}
