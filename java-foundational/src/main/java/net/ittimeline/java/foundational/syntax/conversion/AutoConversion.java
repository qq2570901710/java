package net.ittimeline.java.foundational.syntax.conversion;

//7种数据类型的自动转换
//第一个自动类型转换的规则byte<short<int<long<float<double
//第二个自动类型转换的规则char<int<long<float<double
public class AutoConversion {
    public static void main(String[] args) {
        float fltMax = Float.MAX_VALUE;
        System.out.println("fltmax="+ fltMax);
        System.out.printf("单精度浮点类型的float表示的最大值是%.2f \n",fltMax);

        //long自动转换为float
        long longMax = Long.MAX_VALUE;
        System.out.println("long类型最大值是"+ longMax);

        long longVar = 100;
        System.out.println("longVar="+ longVar);

        float flVar;
        flVar = longVar;
        System.out.println("flVar="+ flVar);

        char charMax = Character.MAX_VALUE;
        //char自动转换为int
        int intVar = 100;
        intVar = charMax;
        //charMax = intVar 编译错误
        System.out.println("inVar="+ intVar);

        //short和chart
        short shortVar = 100;
        //charMax = shortVar;
        //shortVar = charMax;

    }
}
