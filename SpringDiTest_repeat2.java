//package com.fastcampus.ch3;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//class Engine {}
//@Component class SuperEngine extends Engine{}
//@Component class TurboEngine extends Engine{}
//@Component
//class Door{}
//
//@Component
//class Car{
//    @Value("light-pink") String color;
//    @Value("1000") int oil;
//    @Autowired // 타입으로 먼저 검색을 하고 여러개인 경우에는 이름으로 찾는 특성이 있음 그래서 아래에서 Engine engine = (Engine)ap.getBean(Engine.Class); 하면 이름으로 또 검색을 하지 않기 때문에 에러가 발생하는거고 @Autowired Annontation는 이름으로 검색을 해서 에러 발생 x
//    @Qualifier("superEngine") // ✔ 타입으로 매칭시키고 타입이 여러개면 그 중에 이름이 "superEngine" 인 애로 값을 할당
//    Engine engine;
//    @Autowired Door[] doors;
//
//    // 1. Setter 를 사용하여 멤버변수를 초기화 하는 방법
//    // 얘는 @Component Annotation 으로 실습할 때에는 필요없음.
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
//}
//
//
//
//
//
//public class SpringDiTest_repeat2 {
//
//    public static void main(String[] args) {
//
//        ApplicationContext ap = new GenericXmlApplicationContext("config_repeat2.xml");
//
//        Car car = ap.getBean("car", Car.class);
//
//        // 1. Setter 를 사용하여 멤버변수를 초기화 하는 방법
//
////        Engine engine = ap.getBean("engine", Engine.class);
////        Door door = ap.getBean("door", Door.class);
////        car.setColor("light-green");
////        car.setOil(200);
////        car.setEngine(engine);
////        car.setDoors(new Door[]{ap.getBean("door", Door.class), ap.getBean("door", Door.class)});
//
//
//        // 2. config.xml 파일에서 직접 멤버변수에 값을 할당하는 방법
////       Engine engine = ap.getBean("engine", Engine.class);
////       Door door = ap.getBean("door", Door.class);
//
//
//       // @Component Annotation 활용하기
//
//        //  No qualifying bean of type 'com.fastcampus.ch3.Engine' available:
//        //  expected single matching bean but found 3: engine,superEngine,turboEngine
//        //  Engine engine = (Engine)ap.getBean(Engine.class);
//
//        // non-error
//        // Engine engine = (Engine)ap.getBean(SuperEngine.class); // 정확하게 타입을 지정해주거나
//        // Engine engine = (Engine)ap.getBean("superEngine", Engine.class); // engine 타입을 찾고 여러 타입중에 이름이 "superEngine"인 애를 찾기
//        Engine engine = (Engine)ap.getBean("engine"); // ✔ 이렇게 하되, 위에 올라가셈
//        Door door = ap.getBean("door", Door.class);
//
//
//        // 출력
//
//        System.out.println("car = " + car);
//        System.out.println("engine = " + engine);
//
//
//    }
//
//
//
//}
