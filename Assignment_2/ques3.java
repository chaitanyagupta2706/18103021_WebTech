import java.util.*;
public class p3{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string(only lowercase and uppercase english letters): ");
        String s = obj.nextLine();
        char[] chars = s.toCharArray();
        int n=chars.length;
        char temp,minm;
        int ind, one, two;
        for(int i=0;i<n-1;i++){
            one = chars[i];
            ind = i;
            for(int j=i+1;j<chars.length;j++){
                two = chars[j];
                if(one>two){
                    ind = j;
                    one = two;
                }
            }
            temp = chars[i];
            chars[i] = chars[ind];
            chars[ind] = temp;
        }
        System.out.println(chars);
    }
}