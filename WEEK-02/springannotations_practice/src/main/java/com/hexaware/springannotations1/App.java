package com.hexaware.springannotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.hexaware.springannotation.entity.Product;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
        Product product1=context.getBean(Product.class);
        product1.setProductId(1);
        product1.setProductName("Laptop");
        product1.setPrice(1200.00);
        product1.setCategory("Electronics");
        
        Product product2 = context.getBean(Product.class);
        product2.setProductId(2);
        product2.setProductName("Smartphone");
        product2.setPrice(500.00);
        product2.setCategory("Electronics");

        System.out.println(product1);
        System.out.println(product2);
    }
}
