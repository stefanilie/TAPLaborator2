import java.util.Scanner;


public class Prob3till6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		String strToAnalyse = new String();
		System.out.println("Insert string to analyse: ");
		strToAnalyse = sc.nextLine();
		
		System.out.println("Insert char to search number of appearences");
		String charToSearch = sc.nextLine();
		
		int nFirstPosition = 0;
		int nCounterOfApps = 0;
		while (nFirstPosition != -1)
		{
		 	nFirstPosition = strToAnalyse.indexOf(charToSearch, nFirstPosition+charToSearch.length());
		 	if(nFirstPosition != -1)
		 		nCounterOfApps++;
		}
		System.out.println("The number of apps for the char " + charToSearch + " in " + strToAnalyse + " is: " + nCounterOfApps);
		
	}

}
