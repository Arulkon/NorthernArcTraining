package Module01.Day3.Polymorphism;

public class Calculator {
    public int add(int a ,int b){
        System.out.println("Integer Addition");
        return a+b;
    }
    public byte add(byte a, byte b){
        System.out.println("Byte Addition");
        return (byte)(a+b);
    }
    public long add(long a, long b){
        System.out.println("Long Addition");
        return (long)(a+b);
    }
    public double add(double a, double b){
        System.out.println("Double Addition");
        return a+b;
    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }
    public int add(int a ,int b,int c,int d){
        return a+b+c+d;
    }
    public String add(String a,String b){
        return a+b;
    }
}
