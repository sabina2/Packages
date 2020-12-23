package Two;

import java.util.Scanner;

public class Two {
    public void display(String a,String b){
        String x=a+b;
        System.out.println(x);
    }
    public void display1() {
        System.out.println("Enter your name");
        Scanner scanner=new Scanner(System.in);
        String z=scanner.nextLine();
        System.out.println("Hello "+z);
    }
    public static void main(String []args){

    }
}