package controlstatement;

public class pattern1 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
		if(i%2!=0)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
for(int i=2;i<=5;i++)
{
	if(i%2!=0)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}}
