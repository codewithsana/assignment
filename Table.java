package controlstatement;

public class Table {
	public static void main(String[] args) {
		
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(i*j);
			for(int k=1;k<=1;k++ ) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}}
