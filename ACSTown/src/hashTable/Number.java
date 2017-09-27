package hashTable;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

public class Number
{
	private int theValue;
	
	public Number(int value)
	{
		theValue = value;
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		return ((Number)obj).theValue == this.theValue;
	} 
	
	public int hashCode()
	{
		return theValue%10;
	}

	public String toString()
	{
		return theValue+" ";
	}	
}