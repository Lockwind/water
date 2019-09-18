package com.example.demo.util;

import java.lang.reflect.Field;

public class checkObject {

    public static boolean check(Object object) throws IllegalAccessException {
        for (Field field:object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
                if (field.get(object)==null || field.get(object).equals("")){
                    return false;
                }

        }
        return true;
    }

    public static boolean check(Object object,String... Check) throws IllegalAccessException{
        Class Ob=object.getClass();
        Field[] fie=Ob.getDeclaredFields();
        for (int i=0;i<fie.length;i++){
            fie[i].setAccessible(true);
            for (int j=0;j<Check.length;j++){
                if (fie[i].getName().equals(Check[j])){
                    if (fie[i].get(object)==null || fie[i].get(object).equals("")){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean Nocheck(Object object,String... noCheck) throws IllegalAccessException{
        Class _c=object.getClass();
        Field[] _f=_c.getDeclaredFields();
        for (Field field:_f){
            field.setAccessible(true);
            for (int i=0;i<noCheck.length;i++){
                if (field.getName().equals(noCheck[i])){
                    field=null;
                }
            }
            if (field!=null) {
                if (field.get(object) == null || field.get(object).equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
}
