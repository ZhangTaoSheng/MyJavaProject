import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月24日 下午10:20:22 
 * 类说明 
 */
public class PalindromePairs_leetCode_336 {
	 public List ret = new ArrayList<List<Integer>>();
	 public Hashtable<String,Integer> hash = new Hashtable<String,Integer>();
	/**
	 * 
	 * @Title: palindromePairs
	 * @Description: TODO(首先对字符串进行两个组合全排列，例如 (a,b,c)，其组合排列为ab,ba,ac,ca,bc,cb)
	 * 1.首先对字符串进行组合的全排列。例如：给定a,b,c三个字符串，进行组合排列是a,b,c,ab,ac,bc,abc不考虑顺序，只考虑组合
	 * 2.再次对每个组合进行全排列，上述中存在ab,ac,bc,abc，需要进行排列，以abc为例，其全排列为abc,acb,bac,bca,cab,cba几种。
	 * 其实就是两个算法的组合问题，本题没有那么难，只需要找出两两组合就行了，然后代入两次回文判断即可。
	 * 采用递归的方式，时间复杂度会比较高，由于只用考虑两个字符串的组合的形式，还可以用循环来代替递归
	 * @param: @param words
	 * @param: @return   
	 * @return: List<List<Integer>>   
	 * @throws
	 */
	public List<List<Integer>> palindromePairs(String[] words) {
       
        if(words.length == 0)return null;
        
        for(int i =0;i<words.length;i++){
        	hash.put(words[i], i);
        }
        
        List<String> sb = new ArrayList<String>();
        combineTwo(words,0,2,sb);	
        HashSet<List<Integer>> set = new HashSet<List<Integer>>(ret);
	    //remove duplicate lists
	    ret.clear();
	    ret.addAll(set);
        
        return ret;
    }
	
	//两个组合排列
	public void combineTwo(String[]words,int start,int len,List<String> sb){
		if(len ==0){
			if(isPalindrome(sb.get(0),sb.get(1))){
				List<Integer> list = new ArrayList<Integer>();
				list.add(hash.get(sb.get(0)));
			//	System.out.print(hash.get(sb.get(0)));
				list.add(hash.get(sb.get(1)));
			//	System.out.print(" " +hash.get(sb.get(1)));
				ret.add(list);
			}
			System.out.println();
			if(isPalindrome(sb.get(1),sb.get(0))){
				List<Integer> list = new ArrayList<Integer>();
				list.add(hash.get(sb.get(1)));
			//	System.out.print(hash.get(sb.get(1)));
				list.add(hash.get(sb.get(0)));
		//		System.out.print(" " +hash.get(sb.get(0)));
				ret.add(list);
			}
			System.out.println();
		}
		if(start == words.length)return;
		sb.add(words[start]);
		combineTwo(words,start+1,len-1,sb);
		sb.remove(sb.size()-1);
		combineTwo(words,start+1,len,sb);
	}
	
	/**
	 * 
	 * @Title: isPalindrome
	 * @Description: TODO(判断两个字符串连接起来的字符串是否为回文)
	 * @param: @param word1
	 * @param: @param word2
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean isPalindrome(String word1,String word2){
		if(word1.length() ==0||word2.length() ==0)return false;
		StringBuffer combineStr = new StringBuffer(word1).append(word2);
		char [] char_combine = combineStr.toString().toCharArray();
		int len = char_combine.length;
		int start = 0;
		int end = len-1;
		while(start<=end){//从头尾开始比较
			if(char_combine[start] != char_combine[end])return false;
			start++;
			end--;
		}
		
		return true;
		
	}
	
	public static void main(String args[]){
		PalindromePairs_leetCode_336 ls = new PalindromePairs_leetCode_336();
		String [] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
		ls.palindromePairs(words);
	}

}
