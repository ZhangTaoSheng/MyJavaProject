import java.util.ArrayList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月3日 上午9:38:32 
 * 类说明 
 * 打印1，2，3，4，5的问题可以分解成以下几个子问题
 * 打印1， 打印｛2，3，4，5｝的全排列
 * 打印2， 打印｛1，3，4，5｝的全排列
 * 打印3， 打印 ｛1，2，4，5｝的全排列
 * 打印4， 打印 ｛1，2，3，5｝的全排列
 * 打印5， 打印 ｛1，2，3，4｝的全排列
 * 每个子问题的可以继续分解下去
 * 
 */
public class Permutations_leetCode_46 {
	/**
	 * 
	 * @Title: dfs
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param i 表示当前选择第几个元素作为交换的元素
	 * @param: @param num
	 * @param: @param result   
	 * @return: void   
	 * @throws
	 */
	void dfs(int i, int[] num,ArrayList<ArrayList<Integer>> result) {  
        if(i==num.length) {  //递归出来的条件，当不需要交换的时候，说明可以打印了
        	 ArrayList<Integer> temp =new ArrayList<Integer>();
            for(int j=0;j<num.length;j++) {            	 
            	 temp.add(num[j]);
            	 System.out.print(num[j]+" ");
            }        
            System.out.println();
            result.add(temp);  
            return;  
        }  
        for(int j=i;j<num.length;j++) {  
            int tmp = num[i];  //每次与第一个元素进行交换，
            num[i]  = num[j];  
            num[j]  = tmp; 
            							//递归不要一步步深入，只需要将问题抽象清楚，而且找到递归的出口    
            dfs(i+1,num,result);  		//遍历排列树的写法,深度 遍历，当不能满足条件的时候，出栈。
            
            tmp = num[i];  
            num[i]  = num[j];  			//当i个子问题解决完后，还需要 swap(a[1],a[i])交换回来，再解决下一个子问题，不然，后面的次序就乱了。
            num[j]  = tmp;  
            
        }  
    }  
      
    public ArrayList<ArrayList<Integer>> permute(int[] num) {  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
          
        if(num==null||num.length==0) {  
            ArrayList<Integer> tmp = new ArrayList<Integer>();  
            result.add(tmp);  
            return result;  
        }  
        dfs(0,num,result);  
        return result;  
    }  
    
    public static void main(String []args){
    	Permutations_leetCode_46 ls = new Permutations_leetCode_46();
    	int [] num = {1,2,3,4};
    	ls.permute(num);
    }
}  

