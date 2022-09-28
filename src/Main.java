//Q1---REVERSE A NUMBER
/*public class Main {
    public static void main(String[] args) {
        int num=16461;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
            System.out.println("The reverse number is " + rev);
        }
    }
}*/
//Q2-->REVERSE A STRING
/*
public class Main{
    public static void main(String[] args){
        String str="Gaurav";
        String rev="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
            System.out.println("The reverse String is" +rev);
        }
}
}*/
//Q3-->// Java program to find palindrome number
/*
public class Main
{
 public static void main(String[] args)
  {

     // Scanner sc = new Scanner(System.in);
      //System.out.println("Enter the number: ");
      //int num = sc.nextInt();
      int num=16461;
      int org_num=num;
      int reverse=0;
      while(num!=0){
          reverse=reverse*10+num%10;
          num=num/10;
      }
if(org_num==reverse){
    System.out.println(org_num + " Palindrom");
}
else {
    System.out.println(" Not Palindrom");
}
 }
}*/




//Q4-->Java Program to check given String is Panagram or not?

/*public class Main {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        //String s="hello world";
      //  String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPanagram(s.toUpperCase()));

    }

    private static boolean isPanagram(String s) {
        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='A';ch<='Z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
    return true;
    }
}*/
//Q5---->Write a java program to find intersection of elements in two arrays in java
/*
public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {3, 5, 6, 8, 9, 10};
        PrintIntersection(arr1, arr2);
    }

    private static void PrintIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            if (hashSet.contains(arr2[i])) {

                System.out.println(arr2[i]);

            }
        }
    }
}
*/
//Q6--->Java Program to find longest substring without repetition
/*
public  class Main {
    public static void main(String[] args){
        String str= "abcdab";
        PrintLongestSubstring(str);
    }

    private static String PrintLongestSubstring(String str) {
        HashSet<Character> hashSet = new HashSet();
        String LongestStringTillKnow = "";
        String LongestString = "";
        char c = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (hashSet.contains(c)) ;
            LongestStringTillKnow = "";
            hashSet.clear();
        }
        hashSet.add(c);
        LongestStringTillKnow+=c;
        if(LongestStringTillKnow.length()>LongestString.length());
        LongestString=LongestStringTillKnow;
        return LongestStringTillKnow;
    }
}*/
//Q7--->Java Program to find the number of occurences of character

/*public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
       String str= scanner.nextLine();
       int initialLength=str.length();
       Scanner scanner1= new Scanner(System.in);
        System.out.println("Enter the character");
       String str1= scanner1.nextLine();
       str=str.replace(str1,"");
       int finalString=str.length();
        System.out.println("The occurence of  " + str1 + " " +(initialLength-finalString));
    }
}*/

import java.util.Scanner;

//Q8---->Check if number is odd or even?
/*
public class Main {
    public static void main(String[] args){
        int num=5;
        if(num%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Numbe is odd");
        }
    }
}*/
//Q9---> How to check number is prime or not?
/*public class Main {
    public static void main(String[] args){
       int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2)
                System.out.println("prime");

            else
                System.out.println("not prime");

        }
    }*/

//Q10--->Check If String is palindrome.
/*public class Main {
    public static void main(String[] args){
        String str="Gaurav";
        String reverse="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("reverser String " + reverse);
        }
    }*/

//Q11--->Swap two number
/*

public class Main {
    public static void main(String[] args){
        int a=10,b=20,temp=0;
        System.out.println("Before swapping number is " +"a= " + a + " b= " + b);
        //a=temp;
        //a=b;
        //b=temp;
        a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b;
        System.out.println("After swapping number is " +"a= " + a + " b= " + b);
    }
}
*/

