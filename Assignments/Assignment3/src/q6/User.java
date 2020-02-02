package q6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Comparable<User> 
{
	private String name; 
	private int id; 
	private Date birth; 

	public User (String name, int id, Date birth) 	 
		 { 
		this.name = name; 
		 this.id = id; 
		 this.birth = birth; 
		 } 

	@Override 
	public boolean equals(Object other) { 
		if (this == other) return true; 
		if (other == null || (this.getClass() != other.getClass()))
			{ 
			return false; 
			} 

		User guest = (User) other; 
		return (this.id == guest.id) && (this.name != null && name.equals(guest.name)) && (this.birth != null && birth.equals(guest.birth)); 
            
	} 

           @Override 
	public int hashCode() { 
		int result = 0; 
		result = 31*result + id; 
		result = 31*result + (name !=null ? name.hashCode() : 0); 
		result = 31*result + (birth !=null ? birth.hashCode() : 0); 
		return result; 
	} 

	@Override 
	public int compareTo(User o) { 
		return this.id - o.id; 
		} 
	
	public static void main(String[] args) throws ParseException {

		 User u1 = new User("Naveen",1,new SimpleDateFormat("dd/MM/yyyy").parse("11/06/1995"));
		 User u2 = new User("Jami",1,new SimpleDateFormat("dd/MM/yyyy").parse("11/06/1995"));
		 User u4 = new User("Jami",1,new SimpleDateFormat("dd/MM/yyyy").parse("06/06/1995"));
		 User u3 = new User("Navin",2,new SimpleDateFormat("dd/MM/yyyy").parse("06/06/1995"));
		 
		 System.out.println("Equals method");
		 System.out.println(u1.equals(u2));
		 System.out.println(u1.equals(u3));
		 

		 System.out.println("Hashcode method");
		 System.out.println(u1.hashCode() == u2.hashCode());
		 System.out.println(u1.hashCode() == u4.hashCode());
		 

		 System.out.println("Compare To:");
		 if(u1.compareTo(u2) == 0)
		 {
			System.out.println("true");
		 }
		 else{
			System.out.println("false");
		 }


		 if(u1.compareTo(u3) == 0)
		 {
			System.out.println("true");
		 }
		 else{
			System.out.println("false");
		 }

		 if(u1.compareTo(u4) == 0)
		 {
			System.out.println("true");
		 }
		 else{
			System.out.println("false");
		 }
			
	  }
	

	

}

