import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��14�� ����2:43:07 
 * ��˵�� 
 * ʵ��ͬ�������෽����1.synchronized(�����Ϳ飬wait(), notify())
 * 2.Lock�࣬Lock��ļ��������� 1,����ʽ��lock()�����ᱻ���
 * ��					   2��������ʽtryLock()����true or false;
 * 						   3,tryLock(long timeout, TimeUnit unit)�ڵȴ�ʱ���ڣ�������ʽ��ȡ��
 * 						   4.lockInterruptibly();�����ȡ�������������أ�û�л�ȡ���������ߣ����Ա���ϣ�
 */
public class TestLock {
	public static void main (String args[]) throws InterruptedException{
		Lock lock = new ReentrantLock();
		lock.lock();//����ʽ��ȡ����
		Thread t = new Thread(new Runnable(){
			public void run(){
				try {
					lock.lockInterruptibly();//������жϣ�
				} catch (InterruptedException e) {
					System.out.println("�������");								
				}
			}
		});
		t.start();
		t.interrupt();
		Thread.sleep(1);
	}
}
