/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年2月24日 上午9:45:57 
 * 类说明 
 */
public class LiftOff implements Runnable {
	
	public void run(){
		
	}
public static void main(String [] args){
	LiftOff lf = new LiftOff();
	Thread td = new Thread(lf);
	td.start();
}
}
