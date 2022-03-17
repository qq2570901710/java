package net.ittimeline.java.foundational.syntax.conversion;

public class TypeConversionOptimize {
    public static void main(String[] args) {
        byte byteValue = 100;
        //1、如果byte、short、char类型赋值为常量的时候，例如100，JVM会自动将常量值转化为对应的数据类型。
        char charValue = 97;
        System.out.println("charValue="+ charValue);
        //2、如果运算符操作的是字面量常量，会先进行运算操作，再将结果赋值。
        byte byteResult = 3 + 4;
    }
}
