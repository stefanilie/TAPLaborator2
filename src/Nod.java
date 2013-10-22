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
	private int _value;
	private Nod _next;
	private Nod first;
	
	/**
	 * This is a setter for value.
	 * @param value
	 */
	public void setValue(int value)
	{
		this._value = value;
	}
	
	/**
	 * This this is a setter for the Nod.
	 * @param next
	 */
	public void setNext(Nod next)
	{
		this._next = next;
	}
	
	/**
	 * This is a getter for the value.
	 * @return
	 */
	public int getValue()
	{
		return this._value;
	}
	
	/**
	 * This is a getter for the Nod.
	 * @return
	 */
	public Nod getNext()
	{
		return this._next;
	}
	
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
		this._next = toAdd.getNext();
		this._value = toAdd.getValue();
	}
	
	/**
	 * This function adds the object provided as 
	 * parameter to the list.
	 * @param toAdd
	 */
	public void addToList(Nod toAdd)
	{
		Nod parser = new Nod(this.first);
		
		while(parser.getNext() != null)
		{
			parser.setNext(parser.getNext());
		}
		parser.setNext(toAdd);
	}
	
	/**
	 * This function prints out the list.
	 */
	public void printList()
	{
		System.out.println("The list: ");
		Nod parser = new Nod(this.first);
		
		while(parser.getNext()!=null)
		{
			System.out.print(parser.getValue() + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The number of the first element in the list: ");
		int value = sc.nextInt();
		Nod first = new Nod(value);
		Nod middle = new Nod();
		
		System.out.println("Number of elements in the list");
		int nNumberOfElements = sc.nextInt() - 1;
		
		for (int i = 1; i <= nNumberOfElements; i++)
		{
			System.out.println("Insert element number" + i + " : ");
			middle.setValue(sc.nextInt());
			middle.setNext(null);
			first.addToList(middle);
			System.out.println("Succesfully added the element");
		}
		
		first.printList();

	}

}
