import java.util.Scanner;
 
public class test {
	public  static long  ret_count = 0;
	public static void hase(String ss, String target)
	{
		if(ss.length() < target.length())return;
		if(ss.contains(target))
		{
			ret_count++;
			hase(ss.substring(ss.indexOf(target)+target.length()),target); 
		}
		else{
			return;
		}
	}
 
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String input = s.nextLine();
    	String target = s.nextLine();
    	int len = input.length();
    	String ss = new String(input);
    	for(int i = 0 ;i<len;i++)
    	{
    		ss = ss.substring(1)+ss.subSequence(0, 1);
    		hase(ss,target);
   		
    	}
    	System.out.println(ret_count);
    	
    }
 
}