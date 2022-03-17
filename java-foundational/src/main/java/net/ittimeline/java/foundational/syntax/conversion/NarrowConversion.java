package net.ittimeline.java.foundational.syntax.conversion;

public class NarrowConversion {
    public static void main(String[] args) {
        //取值范围小的数据类型 = （取值范围小的数据类型）取值范围大的数据类型；
        double salary = 10000000.0;
        System.out.println("salary="+salary);
        int intSalary = (int)salary;
        System.out.println("intSalary="+intSalary);
    }
}
