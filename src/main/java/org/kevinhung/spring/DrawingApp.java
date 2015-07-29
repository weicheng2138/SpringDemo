package org.kevinhung.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kevin on 2015/7/26.
 */
public class DrawingApp {

    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        context.registerShutdownHook();
//        Triangle triangle = (Triangle) factory.getBean("triangle");
//        Triangle triangle = (Triangle) context.getBean("triangle");
        Circle circle = (Circle) context.getBean("circle");
//        Shape shape = (Shape) context.getBean("circle");

        Point point = new Point();
        point.setY(999);
        point.setX(888);


//        triangle.draw();
        circle.draw();
        circle.setCenter(point);
        circle.draw();
//        shape.draw();




//        System.out.println(context.getMessage("greeting", null, "Defult Greeting", null));



    }
}
