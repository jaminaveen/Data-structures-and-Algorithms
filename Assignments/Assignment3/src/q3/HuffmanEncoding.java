package q3;

import java.util.PriorityQueue; 
import java.util.Comparator;
import java.util.Map; 
import java.util.*;

class HuffmanNode { 
  
    int data; 
    char c; 
  
    HuffmanNode left; 
    HuffmanNode right; 
} 
  

class MyComparator implements Comparator<HuffmanNode> { 
    public int compare(HuffmanNode x, HuffmanNode y) 
    { 
  
        return x.data - y.data; 
    } 
} 
  
class HuffmanEncoding { 
  

    public static void printCode(HuffmanNode root, String s) 
    { 
  
        if (root.left == null && root.right == null && (Character.isLetter(root.c) || Character.isWhitespace(root.c))) { 
  
            // c is the character in the node 
            System.out.println(root.c + ":" + s); 
  
            return; 
        } 
  
        printCode(root.left, s + "0"); 
        printCode(root.right, s + "1"); 
    } 
  
  
    public static void main(String[] args) 
    { 
        String s = "This was hard quiz for students";
        HashMap<Character, Integer> hMap  = new HashMap<Character, Integer>(); 
  
        char[] strArray = s.toCharArray(); 
  
        // checking each char of strArray 
        for (char c : strArray) { 
            if (hMap.containsKey(c)) { 
  
                hMap.put(c, hMap.get(c) + 1); 
            } 
            else { 
                hMap.put(c, 1); 
            } 
        } 
  
        PriorityQueue<HuffmanNode> q  = new PriorityQueue<HuffmanNode>(s.length(), new MyComparator()); 
  
        for (Map.Entry entry : hMap.entrySet()) { 

            HuffmanNode hn = new HuffmanNode(); 
  
            hn.c = (char)entry.getKey(); 
            hn.data = (int)entry.getValue(); 
            hn.left = null; 
            hn.right = null; 
  
            q.add(hn); 
        } 
  
        // create a root node 
        HuffmanNode root = null; 
  
        while (q.size() > 1) { 
  
       
            HuffmanNode x = q.peek(); 
            q.poll(); 
  
            HuffmanNode y = q.peek(); 
            q.poll(); 
  
            HuffmanNode f = new HuffmanNode(); 
  
            f.data = x.data + y.data; 
            f.c = '-'; 
  
            f.left = x; 
  
            f.right = y; 
   
            root = f; 
  
    
            q.add(f); 
        } 
  
        printCode(root, ""); 
    } 
} 
  