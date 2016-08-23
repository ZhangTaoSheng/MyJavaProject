/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月10日 上午11:32:13 
 * 类说明 
 * 对于可以得知变换后数组大小的情况，可以从后往前移动数组，这样移动的次数小很多，复杂度为O（n）
 * 1.合并两个排好序的数组，可以使用这个方法，不需要一个个插入后移。
 * 2.字符串替换
 * 
 */
public class ReplaceBlank {
	public  char [] replace(String str){
		int len = str.length();
		int len_replace = 0;
		char [] char_str = str.toCharArray();
//		System.out.println(len);
		int i = 0;
		while(i<len ){
			if(char_str[i] == ' '){
				len_replace ++;
			}
			i++;
		}
		len_replace = 2*len_replace+len;
		System.out.println(len_replace);
		char [] char_str_replace = new char[len_replace];
		int last = len-1;
		int last_cur = char_str_replace.length-1;
		while(last>=0){
			if(char_str[last] == ' '){
				char_str_replace[last_cur] = '0';
				char_str_replace[last_cur-1] = '2';
				char_str_replace[last_cur-2] = '%';
				last -- ;
				last_cur = last_cur -3;
				
			}else{
				char_str[last] = char_str_replace[last_cur];
				last --;
				last_cur --;
			}
		}
		return char_str_replace;
	}
	public static void main(String ars[]){
		ReplaceBlank ls = new ReplaceBlank();
		System.out.println(ls.replace("Hello world")[6]);
	}

}
