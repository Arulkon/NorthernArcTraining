package Module01.Day3.Polymorphism;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        System.out.println(calc.add(1,2));//integer addition
        System.out.println(calc.add((byte)1,(byte)2));//typecasting
        System.out.println(calc.add(1L, 2L));//typecasting
        System.out.println(calc.add(1f, 2f));//widening to double
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(1,2,3,4));
        System.out.println(calc.add("Nikaash","TK"));
    }
}
