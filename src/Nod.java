import java.util.Scanner;

/**
 * 
 */

/**
 * @author stefan
 *
 */
public class Nod 
{
	public int _value;
	public Nod _next;
	
	/**
	 * This is an empty constructor.
	 * It initiates the Nod object.
	 */
	public Nod ()
	{
		this._value = 0;
		this._next = null;
	}
	
	/**
	 * Constructor containing only the value.
	 * @param value
	 */
	public Nod(int value)
	{
		this._value = value;
		this._next = null;
	}
	
	/**
	 * Constructor containing only the Nod.
	 * @param next
	 */
	public Nod(Nod toAdd)
	{
		this._next = toAdd._next;
		this._value = toAdd._value;
	}
	
	/**
	 * This function adds the object provided as 
	 * parameter to the list.
	 * @param toAdd
	 */
	public void addToList(Nod first, Nod toAdd)
	{
		Nod parser = new Nod(first);
		
		while(parser._next != null)
		{
			parser._next = parser._next;
		}
		parser._next = toAdd;
	}
	
	/**
	 * This function prints out the list.
	 */
	public void printList(Nod first)
	{
		System.out.println("The list: ");
		
		while(first._value != 0)
		{
			System.out.print(first._value + " ");
			 first = first._next; 
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The number of the first element in the list: ");
		int value = sc.nextInt();
		Nod first = new Nod(value);
		Nod middle = new Nod();
		
		first.printList(first);
		
		System.out.println("Number of elements in the list");
		int nNumberOfElements = sc.nextInt() - 1;
		
		for (int i = 1; i <= nNumberOfElements; i++)
		{
			System.out.println("Insert element number " + i + " : ");
			middle._value = sc.nextInt();
			middle._next = null;
			first.addToList(first, middle);;
			System.out.println("Succesfully added the 1" +"element");
			first.printList(first);
		}
		
		first.printList(first);
		System.out.println("Scenario ended.");

	}
}
