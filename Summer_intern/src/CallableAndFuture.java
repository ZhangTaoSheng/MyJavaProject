/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��14�� ����2:14:15 
 * ��˵�� 
 * ʵ�ֶ��̵߳����ַ�����
 * 1. extends Thread;(���̳У��������̳����߳��࣬�򲻻��ٴμ̳��������ˣ�û��Runnable����)
 * 2. implements Runnable;
 * 3. implements Callable;(Callable �ӿ�����Executor����еĹ����࣬���ƣ�1.�з���ֵ��2. ������call()�����׳��쳣)
 */
import java.util.concurrent.*;
public class CallableAndFuture {
	public static class CallableTest implements Callable{
		public String call(){
			return "Hello world";
		}
	}
	public static void main(String args[]){
		ExecutorService threadPool =Executors.newSingleThreadExecutor();
		Future<String> f = threadPool.submit(new CallableTest ());
		try{
			System.out.println("waiting thread to finish");
			System.out.println(f.get());//��Future������call()�����ĵ��������
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
