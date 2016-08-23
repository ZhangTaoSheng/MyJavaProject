import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��24�� ����10:20:22 
 * ��˵�� 
 */
public class PalindromePairs_leetCode_336 {
	 public List ret = new ArrayList<List<Integer>>();
	 public Hashtable<String,Integer> hash = new Hashtable<String,Integer>();
	/**
	 * 
	 * @Title: palindromePairs
	 * @Description: TODO(���ȶ��ַ��������������ȫ���У����� (a,b,c)�����������Ϊab,ba,ac,ca,bc,cb)
	 * 1.���ȶ��ַ���������ϵ�ȫ���С����磺����a,b,c�����ַ������������������a,b,c,ab,ac,bc,abc������˳��ֻ�������
	 * 2.�ٴζ�ÿ����Ͻ���ȫ���У������д���ab,ac,bc,abc����Ҫ�������У���abcΪ������ȫ����Ϊabc,acb,bac,bca,cab,cba���֡�
	 * ��ʵ���������㷨��������⣬����û����ô�ѣ�ֻ��Ҫ�ҳ�������Ͼ����ˣ�Ȼ��������λ����жϼ��ɡ�
	 * ���õݹ�ķ�ʽ��ʱ�临�ӶȻ�Ƚϸߣ�����ֻ�ÿ��������ַ�������ϵ���ʽ����������ѭ��������ݹ�
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
	
	//�����������
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
	 * @Description: TODO(�ж������ַ��������������ַ����Ƿ�Ϊ����)
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
		while(start<=end){//��ͷβ��ʼ�Ƚ�
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
