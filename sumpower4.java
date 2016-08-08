public class Power4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Integer.parseInt(args[0]);
int sum=0,k,temp=0;
while(n>0){
	k=n%10;
	k=k*k*k*k;
	sum=sum+k;
	n=n/10;
}
System.out.println(sum);
	}

}
