package com.fastcampus.ch3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component class Engine {}
@Component class SuperEngine extends Engine{}
@Component class TurboEngine extends Engine {}

@Component
class Door{}
@Component
class Car {
    @Value("light-gray-blue") String color;
    @Value("1250") int oil;
    @Autowired
    @Qualifier("superEngine")
    Engine engine ;
    @Autowired Door[] doors;

    // 1. Annotation 아무것도 없고, Car 클래스 멤버변수에 Setter로 값 할당하기

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

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", oil=" + oil +
                ", engine=" + engine +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}



public class SpringDiTest_repeat3 {

    public static void main(String[] args) {

        ApplicationContext ap = new GenericXmlApplicationContext("config_repeat3.xml");
        
        Car car = ap.getBean("car", Car.class);
        Engine engine = ap.getBean("engine",Engine.class);

        // 1. Annotation 아무것도 없고, Car 클래스 멤버변수에 Setter로 값 할당하기

//        car.setColor("light-blue");
//        car.setOil(100);
//        car.setEngine(engine);
//        car.setDoors(new Door[]{ap.getBean("door", Door.class), ap.getBean("door", Door.class)});



        // 2. config.xml 에서 property로 멤버변수에 값 할당하기
        // 이건 config.xml 파일에 적는거라서 여기에 적을게 없음.

        // 3. @Component Annotation & @Autowired Annotation 붙이기


        // 출력

        System.out.println("car = " + car);
        System.out.println("engine = " + engine);

 }
}