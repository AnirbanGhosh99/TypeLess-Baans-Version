package com.company.future.support;

public class varType {
    private String dataStr;
    private int dataInt;
    private double dataDouble;
    private varType[] dataList;
    public String type;

    public varType(int i){
        dataInt = i;
        dataStr = null;
        dataDouble = 0;
        dataList = null;
        type = "int";
    }

    public varType(double d){
        dataInt = 0;
        dataStr = null;
        dataDouble = d;
        dataList = null;
        type = "double";
    }

    public varType(String str){
        dataInt = 0;
        dataStr = String.format("%s", str);
        dataDouble = 0;
        dataList = null;
        type = "String";
    }

    public varType(boolean List){
        dataInt = 0;
        dataStr = null;
        dataDouble = 0;
        dataList = null;
        type = "List";
    }

    public void equals(int i){
        dataInt = i;
        dataStr = null;
        dataDouble = 0;
        dataList = null;
        type = "int";
    }

    public void equals(double d){
        dataInt = 0;
        dataStr = null;
        dataDouble = d;
        dataList = null;
        type = "double";
    }

    public void equals(String str){
        dataInt = 0;
        dataStr = String.format("%s", str);
        dataDouble = 0;
        dataList = null;
        type = "String";
    }

    public void equals(boolean List){
        dataInt = 0;
        dataStr = null;
        dataDouble = 0;
        dataList = null;
        type = "List";
    }

    public static varType op(varType obj1, char symbol, varType obj2) throws TypeMismatchError
    {
        if ((obj1.type.charAt(0) == 'S' || obj2.type.charAt(0) == 'S') && obj1.type.charAt(0) != obj2.type.charAt(0)) {
            throw new TypeMismatchError(obj1.type, obj2.type, Character.toString(symbol));
        }
        if (obj1.type.charAt(0) == obj2.type.charAt(0) && obj1.type.charAt(0) == 'S') {
            varType result = new varType(obj1.dataStr + obj2.dataStr);
            return result;
        }
        else {
            varType result = new varType(obj1.dataInt + obj2.dataInt);
            return result;
        }
    }
}
