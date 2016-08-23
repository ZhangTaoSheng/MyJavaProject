/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月14日 下午2:14:15 
 * 类说明 
 * 实现多线程的三种方法：
 * 1. extends Thread;(单继承，如果该类继承了线程类，则不会再次继承其他类了，没有Runnable方便)
 * 2. implements Runnable;
 * 3. implements Callable;(Callable 接口属于Executor框架中的功能类，优势：1.有返回值，2. 可以在call()方法抛出异常)
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
			System.out.println(f.get());//用Future来监视call()方法的调用情况，
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
