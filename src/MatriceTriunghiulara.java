import java.util.Scanner;

public class MatriceTriunghiulara 
{
	int nNumber;
	int[][] arrTable;
	
	public void readLowerTable()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of lines that the table will have: ");
		
		this.nNumber = sc.nextInt();
		this.arrTable = new int [this.nNumber][];
		for (int i=0; i<this.nNumber; i++)
		{
			this.arrTable[i] = new int [i+1];
			for (int j=0; j <= i; j++)
			{
				System.out.println("Insert element fot the " + i+ "x" + j + " coordonates");
				arrTable[i][j] = sc.nextInt(); 
			}
		}
	}
	
	public void printLowerTable()
	{
		for(int i = 0; i< this.nNumber; i++)
		{
			System.out.println();
			for (int j = 0; j<=i; j++)
			{
				System.out.print(this.arrTable[i][j] + " ");
			}
		}
	} 	
	public static void main (String arg[])
	{
		MatriceTriunghiulara table = new MatriceTriunghiulara();
		table.readLowerTable();
		table.printLowerTable();
	}
}
