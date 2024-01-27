package com.hexaware.springannotations1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hexaware.springannotation.entity")

public class Appconfig {

}
