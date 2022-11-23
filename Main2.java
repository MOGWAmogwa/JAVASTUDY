package com.fastcampus.ch3.diCopy2;
import org.springframework.context.ApplicationContext;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


import java.io.FileReader;
import java.util.Properties;

class Car{}

class SportCar extends Car{}
class Truck extends Car{}

class Engine{}

class AppContext {
    Map map ;

    AppContext() throws Exception{

        Properties p = new Properties();
        p.load(new FileReader("config.txt"));
        map = new HashMap(p);

        for(Object key : map.keySet()){
            Class clazz = Class.forName((String)map.get(key));
            map.put(key, clazz.newInstance());
        }

    } // 생성자 끝


    Object getBean(String key){
        return map.get(key);
    }

}
public class Main2{

    public static void main(String[] args) throws Exception{
        AppContext ac = new AppContext();
        Car car = (Car)ac.getBean("car");
        Engine engine = (Engine)getObject("engine");
        System.out.println("car = " + car);
        System.out.println("engine = " + engine);

    }

    static Object getObject(String key) throws Exception{
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));

        Class clazz = Class.forName(p.getProperty(key));

        return (Object)clazz.newInstance();

    }

    static Car getCar() throws Exception{
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));

        Class clazz = Class.forName(p.getProperty("car"));

        return (Car)clazz.newInstance();

    }

}
