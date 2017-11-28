\subsubsection{Theory about project: }
In mathematics, the notion of permutation relates to the act of arranging all the members of a set into some sequence or order, or if the set is already ordered, rearranging (reordering) its elements, a process called permuting. These differ from combinations, which are selections of some members of a set where order is disregarded. For example, written as tuples, there are six permutations of the set {1,2,3}, namely: (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2), and (3,2,1). These are all the possible orderings of this three element set. As another example, an anagram of a word, all of whose letters are different, is a permutation of its letters. In this example, the letters are already ordered in the original word and the anagram is a reordering of the letters. The study of permutations of finite sets is a topic in the field of combinatorics.
\lstset {language=JAVA}
\begin{lstlisting}
import java.io.*;
import java.util.*;
class HelloWorld 
{   
    // TreeSet<String> s=new TreeSet<String>(); you can directly use Treeset to add permutation instead of printing @line17  and then print treeset
     HashMap<String , String> hm =new HashMap<String,String>();//this will be efficeint check before 
     public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private  void StringPermutation(String permutation, String input)
    {    
        if(input.length() == 0)
        {
        	System.out.println(permutation);
        	//s.add(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {	String per=permutation+input.charAt(i);
            	String ip=input.substring(0, i)+input.substring(i+1, input.length());
            	//System.out.println(hm.containsKey(per));
            	//System.out.println(hm.containsValue(ip));
            	 if(!(hm.containsKey(per)&&hm.containsValue(ip)) )
                    {	hm.put(per,ip);
                	    StringPermutation(per,ip );
                    }
            }
        }
    }
     
    public  static void main(String[] args) 
    {
    	HelloWorld  p=new HelloWorld();
    	Scanner sc=new Scanner(System.in);
    	String ips=sc.next();
        p.StringPermutation(ips);
        //System.out.println(p.hm);
        
        
        
    }    
}
\end{lstlisting}
