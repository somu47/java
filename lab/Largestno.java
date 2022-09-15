
package largestno.org;

public class Largestno
{
public static void main(String[] args) {
	 int a,b,c;
	  a=10;
	  b=15;
	  c=25;
	 if (a>b && a>c) {
      System.out.println("a is big");
	} else if(b>a && b>c){
     System.out.println("b is big");
	} else if(c>a && c>b){
      System.out.println("c is big");
     } else {
     System.out.println("all are equal");
     }
}
}
