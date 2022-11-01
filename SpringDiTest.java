//package com.fastcampus.ch3;
//
//
//import org.checkerframework.checker.units.qual.C;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//
//@Component("engine") class Engine {} // <bean id = "engine" class="com.fastcampus.ch3" />
//@Component class SuperEngine extends Engine {}
//@Component class TurboEngine extends Engine {}
//@Component class Door {}
//
//@Component
//class Car {
//    @Value("blue") String color;
//    @Value("100") int oil;
//    @Autowired  Engine engine; // byType -  타입으로 먼저 검색, 타입이 여러개라면 이름으로 검색한다.
//
//    @Autowired Door[] doors;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setOil(int oil) {
//        this.oil = oil;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setDoors(Door[] doors) {
//        this.doors = doors;
//    }
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
//public class SpringDiTest {
//
//    public static void main(String[] args) {
//
//        ApplicationContext ac = new GenericXmlApplicationContext("config1.xml");
////        Car car = (Car)ac.getBean("car"); // byName 형변환 수동
//        Car car = ac.getBean("car", Car.class); // byName 형변환 생략쓰
//
//
////        Car car2 = (Car)ac.getBean(Car.class); // byType
//
//
//        //Engine engine = (Engine) ac.getBean(Engine.class); // 같은 타입이 여러개라 에러가 남.
//        Engine engine = (Engine) ac.getBean("superEngine"); // 그래서 이름으로 찾는 것이 나음.
//        Door door = (Door) ac.getBean("door");
//
//
////        car.setColor("red");
////        car.setOil(100);
////        car.setEngine(engine);
////        car.setDoors(new Door[]{ac.getBean("door", Door.class), ac.getBean("door", Door.class)});
//
//
//        System.out.println("car = " + car);
//        //System.out.println("engine = " + engine);
//
//
//    }
//
//
//}
//
//
