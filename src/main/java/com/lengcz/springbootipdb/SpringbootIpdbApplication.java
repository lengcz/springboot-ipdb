package com.lengcz.springbootipdb;

import com.lengcz.springbootipdb.util.IpdbUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootIpdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIpdbApplication.class, args);

        System.out.println(Arrays.toString(IpdbUtil.find("123.125.71.38", "CN")));
    }

}
