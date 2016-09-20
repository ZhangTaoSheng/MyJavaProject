import java.util.*;
public class Main_3 {
	public ArrayList ret = null;
	public Main_3(ArrayList ret)
	{
		this.ret = ret;
	}
	public  void permutation(String str){
		if(str == null){
			return;
		}
		permutation (str.toCharArray(),str.length(),0);
	}
	public void permutation(char[] str, int length,int index){
		if(index == length){
			ret.add(str);
		}
		else{
			for(int j =index;j<length;j++){
				char temp = str[index];
				str[index] = str[j];
				str[j] = temp;
				permutation(str,length,index+1);
				 temp = str[index];
				str[index] = str[j];
				str[j] = temp;
			}
		}
		
	}
	public static void main(String args[]){
		ArrayList<String> ret = new ArrayList();
		Main_3 ls = new Main_3( ret);
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String [] input = new String[num];
		for(int i = 0 ;i<num;i++)
		{
			input[i] = s.nextLine();
		}		
		ls.permutation(new String ("0123"));
		int count = ls.ret.size();
		int add[] = new int[count];
		for(int i =0 ;i<count;i++)
		{
			String temp = ret.get(i);
			char[] temp_arr = temp.toCharArray();
			for(int j =0; j<temp_arr.length;j++)
			{
				int nums = temp_arr[j]-'0';
				String temp_input = input[nums];
				char next = temp_input.toCharArray()[nums+1];
				add[i]  = add[i]+next;
			}
		}
		Arrays.sort(add);
		System.out.println(add[0]);
	}
}