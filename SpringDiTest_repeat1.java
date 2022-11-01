//package com.fastcampus.ch3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
//@Component
//class Engine {} // <bean id="engine" class="com.fastcampus.ch3.Engine" />
//@Component class SuperEngine extends Engine{}
//@Component class TurboEngine extends Engine{}
//
//@Component class Door {}
//@Component
//class Car {
//
//
//    @Value("green") String color;
//    @Value("100") int oil;
//
////  @Resource(name="superEngine") // byName 애초에 이름으로 찾기
//    @Autowired // byType 으로 찾은 후 타입이 여러개인 경우
//    @Qualifier("superEngine") // 정확하게 "--임의의 type--" 을 원한다. 이런 느낌
//    Engine engine; // type으로 먼저 검색 후 여러개인 경우에는 이름으로 검색한다. - Engine, superEngine, TurboEngine
//
//    @Autowired  Door[] doors;
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
//}
//
//
//public class SpringDiTest_repeat1 {
//
//    public static void main(String[] args) {
//
//        ApplicationContext ap = new GenericXmlApplicationContext("config_repeat1_componentscan.xml");
//
//        Car car = ap.getBean("car", Car.class);
////        Engine engine = ap.getBean("engine", Engine.class);
//        Engine engine = (Engine)ap.getBean("engine"); //  No bean named 'engine' available
////        Door door = ap.getBean("door",Door.class);
//
////        car.setColor("red");
////        car.setOil(100);
////        car.setEngine(engine);
////        car.setDoors(new Door[]{ap.getBean("door", Door.class), ap.getBean("door", Door.class)});
//
//        System.out.println("car = " + car);
//
//
//
//    }
//
//}
//
//
//
//// 타입이 여러개일때 , 타입을 기준으로 클래스를 찾아서  mapping 하는  @Autowired의 경우 상속한 객체가 있을 경우 오류가 발생한다.
