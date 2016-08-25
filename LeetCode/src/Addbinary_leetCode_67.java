import java.util.ArrayList;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月29日 下午5:44:28 
 * 类说明 
 * 求两个二进制的加法，可以采用异或运算，这样十分方便。
 */
public class Addbinary_leetCode_67 {
	public String addBinary(String a, String b) {
        if(a.length() == 0||b.length() == 0)return "";
        StringBuffer ret = new StringBuffer( "");
        char[]aa = a.toCharArray();
        char[]bb = b.toCharArray();
        int startA = aa.length-1;
        int startB = bb.length-1;
        int carry = 0;
        List<Integer> retInt = new ArrayList<Integer>();
        while(startA>=0&&startB>=0){        	
        	retInt.add((aa[startA]+bb[startB]-2*'0'+carry)%2);
        	System.out.println(" "+(aa[startA]+bb[startB]-2*'0'+carry)%2);
        	carry = (aa[startA]+bb[startB]+carry-2*'0')/2;
        	startA--;
        	startB--;
        }
        
        while(startA>=0){
        	retInt.add((aa[startA]+carry-'0')%2);
        	System.out.println(" "+(aa[startA]+carry-'0')%2);
        	carry = (aa[startA]+carry-'0')/2;
        	startA--;
        }
        while(startB>=0){
        	retInt.add((bb[startB]+carry-'0')%2);
        	System.out.println(" "+(bb[startB]+carry-'0')%2);
        	carry = (bb[startB]+carry-'0')/2;
        	startB--;
        }
        if(carry>0){
        	retInt.add(carry);
        	System.out.println(" "+carry);
        }
        for(int i = 0;i <retInt.size();i++){
        	ret = ret.append(retInt.get(retInt.size()-i-1));
        }
        
        
        return ret.toString();
    }

	public static void main(String args[]){
		Addbinary_leetCode_67  ls = new Addbinary_leetCode_67();
		System.out.println(ls.addBinary("111", "101"));
	}
}
