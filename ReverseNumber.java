class ReverseNumber{

	public static void main(String[]args){

	int num = 123;
	System.out.print(num % 10);  //3
	
	num = (num/10);  //12
	System.out.print(num % 10); //2

	num = (num/10); //1
	System.out.print(num%10);  //1
	}
}
