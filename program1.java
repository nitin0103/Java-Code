

class ArmStrongNo{

	public static void main(String[] args){

		int N = 153;

		int temp = N;

		int sum = 0;
		
		while(temp != 0){

			int rem = temp%10;
	
			sum = sum+rem*rem*rem;

			temp = temp/10;
		}
		
		if(sum==N){
		
		System.out.println("Armstrong no");

	}else{
		System.out.println("not Armstrong");
	}
	}
}
