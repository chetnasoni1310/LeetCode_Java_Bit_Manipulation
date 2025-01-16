import java.util.*;
//import java.io.*;



public class _2425_BitWise_XOR_Of_All_Pairings {
//Pehle brute force approach
//then hash map
//then mast tarika
public int xorAllNums1(int[] nums1, int[] nums2) {
    int n1=nums1.length;
    int n2=nums2.length;


    //    brute force approach 
        int[]nums3=new int[n1*n2];
        int index=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                nums3[index++]=nums1[i]^nums2[j];
            }
        }
        int result=0;
        for(int i:nums3)
        {
          result= result^i;
        }
        return result;

}
public int xorAllNums2(int[] nums1, int[] nums2) {
    int n1=nums1.length;
    int n2=nums2.length;
    
        // HashMap approach
        HashMap<Integer ,Integer> freq=new HashMap<>();
        for(int i:nums1)
        {
            freq.put(i, freq.getOrDefault(i,0)+n2);
        }  
        for(int i:nums2)
        {
            freq.put(i, freq.getOrDefault(i,0)+n1);
        }  
         int result=0;
         for(int i:freq.keySet())
         {
            if(freq.get(i)%2==1)
            {
                result^=i;
            }
         }  
         return result;

}
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
       
     //Mast Concept Hai
     int result=0;
     if(n1%2==0)
     {
        if(n2%2==0)
        {
            return 0;
        }
        else
        {   
            for(int i:nums1){
            result^=i;
            }
            return result;
        }
     }
     else{
        if(n2%2==0)
        {
            for(int i:nums2){
            result^=i;
            }
            return result;
        }
        else{
             for(int i:nums2){
            result^=i;
            }
             for(int i:nums1){
            result^=i;
            }
            return result;
        }
     }
    }

public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
sc.close();
}
}