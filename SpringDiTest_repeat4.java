//package com.fastcampus.ch3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
//@Component
//class Engine {
//
//}
//@Component
//class SuperEngine extends Engine{}
//@Component
//class TurboEngine extends Engine{}
//@Component
//class Door {
//
//}
//
//@Component
//class WhiteDoor extends Door {}
//
//@Component
//class Car {
//
//
//    @Value("dark-gray-green")
//    String color;
//    @Value("3000")
//    int oil;
//    @Autowired
//    @Qualifier("turboEngine")
//    Engine engine;
//
//    @Autowired
//    @Qualifier("whiteDoor")
//    Door[] doors;
//
////    public void setColor(String color) {
////        this.color = color;
////    }
////
////    public void setOil(int oil) {
////        this.oil = oil;
////    }
////
////    public void setEngine(Engine engine) {
////        this.engine = engine;
////    }
////
////    public void setDoors(Door[] doors) {
////        this.doors = doors;
////    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", oil=" + oil +
//                ", engine=" + engine +
//                ", doors=" + Arrays.toString(doors) +
//                '}';
//    }
//
//}
//
//
//public class SpringDiTest_repeat4 {
//
//
//    public static void main(String[] args) {
//
//        ApplicationContext ac = new GenericXmlApplicationContext("config_repeat4.xml");
//
//        Car car = ac.getBean("car", Car.class);
//        Engine engine = ac.getBean("engine",Engine.class);
//
//
//
//        // 1. Annotation을 사용하지 않고 Setter를 사용해서 멤버변수를 초기화해주기
//
////        car.setColor("light-gray-pink");
////        car.setOil(1000);
////        car.setEngine(engine);
////        car.setDoors(new Door[]{ac.getBean("door", Door.class), ac.getBean("door", Door.class)});
////
//
//        // 3. @Component Annotation , @Autowired Annotation 활용하기
//
//
//        System.out.println("car = " + car);
//        System.out.println("engine = " + engine);
//
//
//
//
//    }
//
//}
