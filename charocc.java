import java.util.Scanner;

public class charocc {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string");
    String s=sc.next();
    char [] c=s.toCharArray();
    int count=0;
    for(int i=0;i<c.length;i++)
    {
        count++;
        System.out.println(count);
}}}