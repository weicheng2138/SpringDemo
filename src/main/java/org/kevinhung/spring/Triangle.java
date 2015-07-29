package org.kevinhung.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by Kevin on 2015/7/26.
 */
public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    //    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public Point getPointC() {
        return pointC;
    }
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

//    private List<Point> points;
//    public List<Point> getPoints() {
//        return points;
//    }
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }

    public void draw() {
//        for (Point point: points) {
//            System.out.println("Points is -> ("+point.getX()+","+point.getY()+")");
//        }
        System.out.println("Drawing Triangle");
        System.out.println("PointA is -> ("+pointA.getX()+","+pointA.getY()+")");
        System.out.println("PointB is -> ("+pointB.getX()+","+pointB.getY()+")");
        System.out.println("PointC is -> ("+pointC.getX()+","+pointC.getY()+")");
    }

    public void myInit() {
        System.out.println("My Init method called for Triangle");
    }

    public void cleanUp() {
        System.out.println("Clean up method called for Triangle");
    }


    //implementing InitializingBean, DisposableBean
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("InitializingBean init method called for Triangle");
//    }
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("DisposableBean destroy method called for Triangle");
//    }

//    @Override
//    public void setApplicationContext(ApplicationContext context) throws BeansException {
//        this.context = context;
//        System.out.println("context name is = "+context);
//    }
//
//    @Override
//    public void setBeanName(String beanName) {
//        System.out.println("Bean name is = "+beanName);
//    }
}
