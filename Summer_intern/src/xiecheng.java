import java.util.Scanner;
public class xiecheng{

public static void main(String args[])
      {
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            String []input_arr = input.split(",");
            int start = 0;
            int end = input_arr.length-1;
            int max = 0;
			while(start<=end)
            {
                  int temp = Integer.valueOf(input_arr[end])-Integer.valueOf(input_arr[start]);
                  if(temp>max)max = temp;
                  if(Integer.valueOf(input_arr[start])>Integer.valueOf(input_arr[end]))
                     {
                     	start++;
                     }
                   else 
                     {
                     	end--;
                     }
            }
            System.out.println(max);
      }
      
}