import java.util.*;
class Binary{
static String add_binary(String x,String y){
  int n1=Integer.parseInt(x,2);
  int n2=Integer.parseInt(y,2);
  int sum=n1+n2;
 String result=Integer.toBinaryString(sum);
  return result;
}
   public static void main(String args[])
   { 
     String x="0110",y="0011";
    System.out.println(add_binary(x,y));
   }
 }
