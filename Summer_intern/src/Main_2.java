import java.util.Scanner;
import java.util.regex.Pattern;
public class Main_2 {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String [] input_arr = input.split(" ");

		boolean ret = true;
		int nums_count = 0;
		int result = 0;
		for(int i = 0 ;i<input_arr.length ;i++)
		{
			if(input_arr[i] == "")continue;
			if(nums_count >=32)
			{
				ret = false;
				System.out.println("ERROR");
				break;
			}
			boolean ret_temp = true;
			char [] temp = input_arr[i].toCharArray();
			for(int j = 0; j<temp.length;j++)
			{
				if(temp[j]<48||temp[j]>57)
				{
					System.out.println("ERROR");
					
					ret_temp = false;
					ret =false;
					break;
				}
			}
			if(!ret_temp)break;
			else if(ret){
				if(input_arr[i]!= "")
				{
					result +=  Integer.parseInt(input_arr[i]);
					nums_count++;
				}
				

			}
		}
		if (ret)
		System.out.println(result);
	}

}
