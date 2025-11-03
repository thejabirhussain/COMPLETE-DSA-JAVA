import java.util.*;
public class string{
    public static void palindrome(String str){
        int mid=str.length()/2;
        int n=str.length();
        for(int i=0;i<mid;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("Not a palindrome");
                return; 
            }
        }
        System.out.println("Palindrome");
    }
    public static void displacement(String str){
        int x_pos=0;
        int y_pos=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            switch(dir){
                case 'N':
                    y_pos++;
                    break;
                case 'S':
                    y_pos--;
                    break;
                case 'E':
                    x_pos++;
                    break;
                case 'W':
                    x_pos--;
                    break;
                default:
                    System.out.println("Invalid direction");
            }}
            int final_displacement=(int)Math.sqrt(x_pos*x_pos + y_pos*y_pos);
            System.out.println("Final displacement: "+final_displacement);

    }
    public static void string_compression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String args[]){
    //    String name="Tony Stark";
    //    String name2="Tony Stark";
       //System.out.println(name.charAt(1));


       //string functions
        //  System.out.println(name.length()); //length of string
        //  System.out.println(name.charAt(3)); //to get character at index 3
        //  System.out.println(name+" "+name2); //concatenation
        // System.out.println(name.contains("tony")); //case sensitive
        //     System.out.println(name.indexOf("S")); //gives index of character
        //     System.out.println(name.equals(name2)); //to check equality
        //     System.out.println(name.substring(0,4)); //substring from index 0 to 4(exclusive)
        //     System.out.println(name.replace('o','a')); //replace o with a
        //     System.out.println(name.toLowerCase()); //to lowercase
        //     System.out.println(name.toUpperCase()); //to uppercase
        //     System.out.println(name.trim()); //removes spaces at start and end


        //comapring name==name2 && name.equals(name2)
        // if(name==name2){
        //     System.out.println("Strings are equal using ==");
        // }else{
        //     System.out.println("Strings are not equal using ==");      
        // }
        // if(name.equals(name2)){
        //     System.out.println("Strings are equal using equals()");
        // }else{
        //     System.out.println("Strings are not equal using equals()"); 
        // }
        //difference between == and equals() in java
        /*
        == checks for reference equality (whether both references point to the same object in memory).
        equals() checks for value equality (whether the values of the objects are the same).
        */
      String str="aaabbccccd";
        string_compression(str);

    }
}