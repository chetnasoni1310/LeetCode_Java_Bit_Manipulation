import java.util.*;
//import java.io.*;



public class _2429_Minimize_XOR_Set_Bits_num1and2 {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int num2=15;
int count=0;
        while(num2>0)
        {
            if((num2 & 1)==1)
            {
                //odd number
                count++; 
            }
            num2=num2>>1;
        }
        
System.out.println(count);

sc.close();


}
}