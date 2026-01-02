package DSA;

public class for_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int j;
		int k;
		
		
		for(i=1;i<=5;i++) {
		
			for(k=1;k>=5-i;k++) {
				System.out.print("  ");
			}
			
			for(j=1;j<2*i-1;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}

}
