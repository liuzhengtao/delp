package com.taotao123.www.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by YM10095 on 2018/3/19.
 */
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.taotao123.www.mapper")
public class RunMain {

    public static void main(String[] args){
        SpringApplication.run(RunMain.class, args);
    }
}
