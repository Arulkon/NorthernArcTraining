package Module01.Day3.ObjectOperations;

public class ObjectFunctionsMain {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
        System.out.println(o1.hashCode()==o2.hashCode());
        System.out.println(o2.hashCode()==o3.hashCode());
        System.out.println(o1.getClass().getSimpleName());
        System.out.println(o1.getClass().getName());
        System.out.println(o1);
        System.out.println(o1.toString());
    }
}
