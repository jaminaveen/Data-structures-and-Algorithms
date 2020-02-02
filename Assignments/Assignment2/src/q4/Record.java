package q4;

public class Record
{
//basic data format
int number;
String name;

     public String toString() 
     {
    	 return String.format("data >> %s %d ", name, number);
     }

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     
}

