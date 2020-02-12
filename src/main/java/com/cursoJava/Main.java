package com.cursoJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Saludo objSaludo = contenedor.getBean("beanSaludo", Saludo.class);
        System.out.println(objSaludo.getMensaje());
    }

}
