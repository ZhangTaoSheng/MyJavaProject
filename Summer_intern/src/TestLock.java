import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月14日 下午2:43:07 
 * 类说明 
 * 实现同步的两类方法：1.synchronized(方法和块，wait(), notify())
 * 2.Lock类，Lock类的几个方法， 1,阻塞式的lock()，不会被打断
 * ，					   2，非阻塞式tryLock()返回true or false;
 * 						   3,tryLock(long timeout, TimeUnit unit)在等待时间内，非阻塞式获取锁
 * 						   4.lockInterruptibly();如果获取了锁，立即返回，没有获取，处于休眠，可以被打断，
 */
public class TestLock {
	public static void main (String args[]) throws InterruptedException{
		Lock lock = new ReentrantLock();
		lock.lock();//阻塞式获取锁，
		Thread t = new Thread(new Runnable(){
			public void run(){
				try {
					lock.lockInterruptibly();//会理会中断，
				} catch (InterruptedException e) {
					System.out.println("被打断了");								
				}
			}
		});
		t.start();
		t.interrupt();
		Thread.sleep(1);
	}
}
