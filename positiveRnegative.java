import java.util.Scanner;
public class Test {
public static void main(String[] args) {
int x;
 Scanner in=new Scanner(System.in);
 x=in.nextInt();
if (x<0){
	System.out.println("give no is negative");
}
else if(x>0){
	System.out.println("given no is positive");
}
else{
	System.out.println("given no is zero");
}
	}

}
