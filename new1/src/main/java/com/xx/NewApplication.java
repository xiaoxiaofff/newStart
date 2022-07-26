package com.xx;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xx.mapper.xml"})
public class NewApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewApplication.class, args);
    }

}
