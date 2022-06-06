package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludar = (Saludo) context.getBean("saludar");

        String saludo = saludar.imprimirSaludo();
        System.out.println(saludo);

        UserService notification = (UserService) context.getBean("notification");
        System.out.println(notification);

    }
}
