import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月12日 下午4:33:42 
 * 类说明 
 */
public class LetterCombin_leetCode_17 {
	public HashMap<String, String> hash = new HashMap<String,String>();

	public List<String> letterCombinations(String digits){
		List<String> ret = new ArrayList<String>();

		hash.put("2", "abc");
		hash.put("3", "def");
		hash.put("4", "ghi");
		hash.put("5", "jkl");
		hash.put("6", "mno");
		hash.put("7", "pqrs");
		hash.put("8", "tuv");
		hash.put("9", "wsyz");
	
		return ret;

	}

}
