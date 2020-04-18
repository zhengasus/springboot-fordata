package com.example.springbootfordata.mysql.domain;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author xu
 * @date 2019-7-6
 */
public class GenerateInsert {


    public void main(String[] args) {


        // 获取实体类的所有属性信息，返回Field数组
        Field[] fields = PmsProduct.class.getDeclaredFields();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();
            String getField = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            System.out.println(getField);
            map.put(i + 1, getField);
        }
        try {
            Class cls = PmsProduct.class;
            Object o = cls.newInstance();
            PmsProduct product = (PmsProduct) o;
            product.setId((long) 999);
            Method m = cls.getMethod(map.get(1), (Class<?>) null);
            m.invoke(o, (Object) null);
            System.out.println(product.getId());
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }




    }



}
