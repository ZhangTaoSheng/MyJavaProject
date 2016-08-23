import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年4月14日 下午7:54:48 
 * 类说明 
 */
public class ReconstructItinerary_leetCode_332 {
public List<String> findItinerary(String[][] tickets) {
    List<String> ret = new ArrayList<String>();
    int len =tickets.length;
    HashMap<String ,String> hash = new HashMap<String ,String>();
    for(int i = 0 ;i<len;i++){
    	hash.put(tickets[i][0], tickets[i][1]);
    }
    ret.add("JFK");
    String begin = hash.get("JFK");
    ret.add(begin);
    while(hash.containsKey(begin)){
    	 begin = hash.get(begin);
    	 ret.add(begin);
    }
    return ret;		
    }
	public static void main(String[] args) {

	}

}
