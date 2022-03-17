package net.ittimeline.java.foundational.syntax.conversion;

public class TypeConversionWarning {
    public static void main(String[] args) {
        //1、boolean不能和其他七种基本类型进行类型转换
        boolean booleanVar = false;
        byte byteVar = 100;
        //编译错误
//        byteVar = (byte)booleanVar;
//        booleanVar = (boolean)byteVar;
    }
}
