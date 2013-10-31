import java.awt.List;
import java.util.ArrayList;


public class Prob4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i=0;
		ArrayList strList = new ArrayList<String>();
		while(args[i+1] != null)
		{
			strList.add(args[i]);
			i++;
		}
	}

}
