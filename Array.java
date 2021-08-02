// int[] myArray;
// myArray = new int[5];
import java.util.Arrays;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args){
        // int[] myArray = new int[5];
        // myArray[0] = 4;
        // myArray[1] = 8;
        // myArray[2] = 8;
        // myArray[3] = 5;
        // myArray[4] = 9;
        // int[] myArray = {4, 8, 8, 5, 9};
        // String[] myArray = {"a","b","c"};
        // System.out.println(Arrays.toString(myArray));

        // ArrayList<Integer> myArray = new ArrayList<Integer>();
        // System.out.println(myArray);
        // myArray.add(10);
        // myArray.add(20);
        // myArray.add(30);
        // int num1 = myArray.get(0);
        // int num2 = myArray.get(1);
        // int num3 = myArray.get(2);
        // System.out.println(myArray);
        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(num3);

        ArrayList<Object> myArray = new ArrayList<Object>();
        myArray.add(10);
        myArray.add("Hello");
        myArray.add(new ArrayList<Integer>());
        myArray.add(new Double(12.0));

        // ArrayList<Integer> num = (ArrayList<Integer>) myArray.get(2);
        // num.add(21);

        System.out.println(myArray);
    }
}