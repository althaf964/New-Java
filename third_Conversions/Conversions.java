package third_Conversions;

public class Conversions {
    public static void main(String[] args) {
        int num = 10;
        double num1 = num; 
        System.out.println("original value:" +num);
        System.out.println("converted value:" +num1);
        double num2 = 3.14;
        int num3 = (int)num2;//Type mismatch: cannot convert from double to int
                        //you need to do manual conversion add paranthesis before value
         System.out.println("original value:" +num2);
        System.out.println("converted value:" +num3);

    }

}
