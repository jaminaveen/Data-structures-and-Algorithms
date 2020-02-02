package q2;

//JAVA program to find the gray sequence of n bits. 
import java.util.ArrayList; 

class GenerateGrayCode 
{ 
  
static int num; 
  
/* we have 2 choices for each of the n bits either we  
can include i.e invert the bit or we can exclude the  
bit i.e we can leave the number as it is. */
static void grayCodeUtil(ArrayList<Integer> res, int n) 
{ 
    // base case when we run out bits to process 
    // we simply include it in gray code sequence. 
    if (n == 0) 
    { 
        res.add(num); 
        return; 
    } 
  
    // ignore the bit. 
    grayCodeUtil(res, n - 1); 
  
    // invert the bit. 
    num = num ^ (1 << (n - 1)); 
    grayCodeUtil(res, n - 1); 
} 
  
// returns the vector containing the gray  
// code sequence of n bits. 
static ArrayList<Integer> grayCodes(int n) 
{ 
	ArrayList<Integer> res = new ArrayList<Integer>(); 
  
    // num is passed by reference to keep 
    // track of current code. 
    num = 0; 
    grayCodeUtil(res, n); 
  
    return res; 
} 
  
// Driver function. 
public static void main(String[] args) 
{ 
    int n = 4; 
    ArrayList<Integer> code = grayCodes(n); 
    
    //  printing
    for (int i = 0; i < code.size(); i++) { 
    	String str;
    	str = Integer.toBinaryString(code.get(i));
    	if(str.length()==1) {
    		str = "000"+str;
    	}
    	else if(str.length()==2) {
    		str = "00"+str;
    	}
    	else if(str.length()==3) {
    		str = "0"+str;
    	}
        System.out.print(code.get(i)+" : "+str +"\n");  
} 
} 
}