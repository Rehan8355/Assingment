package Assingment;

import java.util.Arrays;

public class Assingment2 {
     public static void main(String[] args) {
    //     String str1="PWSKILLS";
    //     String str2=" ";
    //     for(int i=str1.length()-1;i>=0;i--)
    //     {
    //         str2=str2+str1.charAt(i);
    //     }
    //     System.out.println(str2);
    
//   String str1="Think Twick";
//   String str2=" ";
//   String arr[]=str1.split(" ");
//   for(String elem:arr)
//   {
//   for(int i=elem.length()-1;i>=0;i--)
//   {
//     str2=str2+elem.charAt(i);
//   }
//   str2=str2+" ";
//     }
//     System.out.println(str2);
String str1="hello";
char[]arr=str1.toCharArray();
Arrays.sort(arr);
System.out.println(arr);
}
}
