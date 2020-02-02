package q3;

public class TwoPowerN {
	
	// To track number of steps
	static int count = 0;
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
    	
        if (n == 1) 
        { 
        	count++;
            System.out.println("step "+ count+": Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        System.out.println("Push hanoi " + (n-1) + " "+from_rod+" "+aux_rod+" "+to_rod); 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        count++;
        System.out.println("step "+ count+": Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        System.out.println("Push hanoi " + (n-1) + " "+aux_rod+" "+to_rod+" "+from_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
        
        
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 5; // Number of disks 
        System.out.println("Push hanoi " + n +" A C B");
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
    }
}
