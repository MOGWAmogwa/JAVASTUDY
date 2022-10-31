//package com.fastcampus.ch3.diCopy3;
//
//import com.google.common.reflect.ClassPath;
//import org.checkerframework.checker.units.qual.C;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//@Component class Car {}
//@Component class SportsCar extends Car {}
//@Component class FireEngine extends Car {}
//
//

// @Component Annotation 자동 객체 등록
// 타입으로 검색해서 객체 등록하기


//class AppContext {
//
//    Map map;
//
//    AppContext(){
//
//        map = new HashMap();
//        doComponentScan();
//
//    }
//
//    private void doComponentScan(){
//
//
//        try {
//
//            // 1. 패키지 내의 클래스 목록을 가져와야 함.
//            // 2. 반복문으로 클래스를 하나씩 읽어와서 ComponentAnnotation 이 붙어있는지 확인
//            // 3. @ComponentAnnotation 이 붙어있는 경우 객체를 생성해서 Map에 저장
//
//            ClassLoader classLoader = AppContext.class.getClassLoader();
//            ClassPath classPath = ClassPath.from(classLoader);
//
//            Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.fastcampus.ch3.diCopy3");
//
//            for(ClassPath.ClassInfo classInfo : set){
//                Class clazz = classInfo.load();
//                Component component = (Component)clazz.getAnnotation(Component.class);
//                if(component != null){
//                    String id = StringUtils.uncapitalize(classInfo.getSimpleName());
//                    map.put(id, clazz.newInstance());
//                }
//            }
//
//        }catch(Exception e){
//        e.printStackTrace();
//        }
//
//
//    }
//
//
//    Object getBean(String key){ // byName
//        return map.get(key);
//    }
//
//    Object getBean(Class clazz){ // byType
//        for(Object obj : map.values()){
//            if(clazz.isInstance(obj)){
//                return obj;
//            }
//        }
//
//        return null;
//    }
//
//}
//
//public class Main3_repeat1 {
//
//
//    public static void main(String[] args) {
//        AppContext ap = new AppContext();
//
//        Car car = (Car)ap.getBean(Car.class);
//        Car car2 = (Car)ap.getBean("car");
//
//        System.out.println("car = " + car);
//
//
//
//
//
//
//    }
//
//
//
//
//}
