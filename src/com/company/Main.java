package com.company;
import com.company.future.support.varType;

public class Main {

    public static void main(String[] args) {
        varType obj1 = new varType(1);
        varType obj2 = new varType("abc");
        System.out.println(obj1.type+"\n"+obj2.type);
        try {
            varType obj3 = varType.op(obj1,'+',obj2);
            System.out.println(obj3.type);
        }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
