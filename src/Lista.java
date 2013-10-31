import java.util.Scanner;

/**
 * 
 */

/**
 * @author stefan
 *
 */

//This class will be separated in the Nod file. This is here just for testing purposes only.
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
		this._first = this;
		this._last = this;
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
}

class List
{
	public Nod _first, _last;

	public List()
	{
		this._first = null;
		this._last = null;
	}

	public List(Nod newHead)
	{
		this._first = newHead;
		this._last = newHead;
	}

	public void addToList(Nod toAdd)
	{
		if(this._first == null)
		{
			//toAdd = new List(toAdd);
			this._first = toAdd;
			this._last = toAdd;
		}
		else
		{
			Nod parser = new Nod(this._first);
			while(parser != this._last)
			{
				parser = parser._next;
			}
			parser._next = toAdd;
			this._last = toAdd;
		}
	}

	public void printLst()
	{
		Nod parser = new Nod(this._first);
		while(parser != this._last)
		{
			System.out.print(parser._value + " ");
			parser = parser._next; 
		}
	}

	public static void main(String[] args)
	{
		List testList = new List();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the number of elements in the list");
		int nNumberOfElements = sc.nextInt();

		for (int i = 1; i <= nNumberOfElements; i++)
		{
			System.out.println("Insert element number " + i + " : ");
			Nod temp = new Nod(sc.nextInt());
			testList.addToList(temp);
		}

		testList.printLst();
	}

}