import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number to convert to decimal:");
        int binary = scan.nextInt();
        System.out.println("In decimal: "+ toDecimal(binary));      
        System.out.println("Enter a decimal number to convert to binary:");
        int decimal = scan.nextInt();
        System.out.println("In binary: "+ toBinary(decimal));
  
    }

    //converts a binary number to decimal and returns it as an int
    //Precondition: binary is a valid number in binary (1's and 0's only)
    public static int toDecimal(int binary) {
        int sum = 0;
        int pow = 0;
        while(binary>0)
        {
            int temp = binary%10;
            if(temp == 1)
            {
                sum += Math.pow(2, pow);
            }
            binary = binary/10;
            pow++;
        }
        return sum;
    }

    //converts a decimal number to binary and returns it as an 8-bit String
    //Precondition: decimal is a valid int between 255 and 0 inclusive
    public static String toBinary(int decimal) {
        //this works, but cuts out the leading zeroes


        // String str = " ";
        // while((decimal)>0)
        // {
        //     if(decimal%2 == 0)
        //     {
        //         str += "0";
        //     }
        //     if(decimal%2 == 1)
        //     {
        //         str += "1";
        //     }
        //     decimal /= 2;
        // }
        // String fin = "";
        // for(int i = str.length()-1;i>=0;i--)
        // {
        //     fin += str.substring(i, i+1);
        // }
        // return fin;

        String str = "";
        int pow = 7;
        while(pow>=0)
        {
            if(decimal>=Math.pow(2, pow))
            {
                str += "1";
                decimal -= Math.pow(2, pow);
            }
            else
            {
                str += "0";
            }
            pow--;
        }
        return str;
    }

}
