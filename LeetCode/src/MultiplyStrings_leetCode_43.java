/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年2月29日 下午7:57:09 
 * 类说明 
 */
public class MultiplyStrings_leetCode_43 {
	public String multiply(String num1,String num2){
		String  ret = "";
		if(num1.length() == 0||num2.length() == 0)return ret;
		if(num1.substring(0, 1).equals("0")||num2.substring(0, 1).equals("0")) return "0";
		
		char [] n1_c = num1.toCharArray();
		char [] n2_c = num2.toCharArray();
		int [] n1 = new int[n1_c.length];
		int [] n2 = new int[n2_c.length];
		int [] n_m = new int[n1.length+n2.length];
		for (int i = n1.length-1;i>=0  ;i--){
			n1[n1.length-i-1] = n1_c[i]-'0';
		}
		for (int j = n2.length-1;j>=0  ;j--){
			n2[n2.length-j-1] = n2_c[j]-'0';
		}
		
		for(int m = 0 ;m <n1.length;m++){
			for(int n = 0; n<n2.length;n++){
				n_m[n_m.length-1-m-n]= n_m[n_m.length-1-m-n]+n1[m]*n2[n];//按位相乘。
			}
		}
		for(int l = n_m.length-1 ;l>=0;--l){
			if(l>0)n_m[l-1]+=n_m[l]/10;
			n_m[l]%=10;
		//	System.out.println(n_m[l]);
		}
		for(int k = 0 ; k<=n_m.length-1;k++){
		
			ret = ret+(n_m[k]);

		}
		//System.out.println(ret.substring(0,1));
		ret = ret.substring(0, 1).equals("0")?ret.substring(1):ret;
		return ret;
		
	}
	public static void main(String []args){
		MultiplyStrings_leetCode_43 ls = new MultiplyStrings_leetCode_43();
	//	ls.multiply("10", "10");
		System.out.println(ls.multiply("2530", "10656000"));
	}
}
