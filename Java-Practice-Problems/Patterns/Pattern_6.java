package Patterns;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i, j;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				if((i+j) % 2 == 0)
				{
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}

}
