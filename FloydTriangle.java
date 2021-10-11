
public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6 ,k=1;
		for (int i=1;i<6;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k+ " ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println();
		k=1;
		for (int i=1;i<6;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k+ " ");
				
			}
			k++;
			System.out.println();
		}
		
		System.out.println();
		k=1;
		for (int i=1;i<6;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k+ " ");
				if(k==1) {
					k--;
				}
				else if(k==0) {
					k=1;
				}
			}
			
			System.out.println();
		}
		
		
		

	}

}
