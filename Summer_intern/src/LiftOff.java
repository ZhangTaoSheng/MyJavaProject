/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��2��24�� ����9:45:57 
 * ��˵�� 
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
