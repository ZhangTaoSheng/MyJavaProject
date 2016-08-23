import java.util.HashMap;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月23日 下午2:10:43 
 * 类说明 
 */
public class Test_1 {

	public static void main(String[] args) {
		HashMap<String,String> ss = new HashMap<String ,String>();
		ss.put("1", "1");
		change(ss);
		System.out.println(ss.get("2"));
	}
	public static void change(HashMap<String,String> ss){
		ss = new HashMap<String ,String>();
		ss.put("2", "2");
	}
	
}
