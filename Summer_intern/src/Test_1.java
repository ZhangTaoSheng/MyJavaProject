import java.util.HashMap;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��23�� ����2:10:43 
 * ��˵�� 
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
