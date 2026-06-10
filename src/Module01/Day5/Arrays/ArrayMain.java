package Module01.Day5.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println("The elements integer array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int val:arr){
            System.out.println(val);
        }



        String[] arr2=new String[5];
        arr2[0]="Hi";
        arr2[1]="I'm";
        arr2[2]="Nikaash";
        arr2[3]="T K";
        arr2[4]="bye";
        System.out.println("The elements string array are: ");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println();
        for(String val:arr2){
            System.out.println(val);
        }


        char[] arr3=new char[5];
        arr3[0]='a';
        arr3[1]='b';
        arr3[2]='c';
        arr3[3]='d';
        arr3[4]='e';
        System.out.println("The elements character array are: ");
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
        System.out.println();
        for(char val:arr3){
            System.out.println(val);
        }

        short[] arr4=new short[5];
        arr4[0]=1;
        arr4[1]=2;
        arr4[2]=3;
        arr4[3]=4;
        arr4[4]=5;
        System.out.println("The elements short array are: ");
        for(short i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }
        System.out.println();
        for(short val:arr4){
            System.out.println(val);
        }

        Integer[] arr5=new Integer[5];
        arr5[0]=1;
        arr5[1]=2;
        arr5[2]=3;
        arr5[3]=4;
        arr5[4]=5;
        System.out.println("The elements integer array(wrapper class) are: ");
        for(int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }
        System.out.println();
        for(int val:arr5){
            System.out.println(val);
        }

        byte[] arr6=new byte[5];
        arr6[0]=1;
        arr6[1]=2;
        arr6[2]=3;
        arr6[3]=4;
        arr6[4]=5;
        System.out.println("The elements byte array are: ");
        for(int i=0;i<arr6.length;i++){
            System.out.println(arr6[i]);
        }
        System.out.println();
        for(byte val:arr6){
            System.out.println(val);
        }


    }
}
