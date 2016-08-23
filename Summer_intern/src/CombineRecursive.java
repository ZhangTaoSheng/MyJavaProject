/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��23�� ����1:02:27 
 * ��˵�� 
 * ���ַ����������
 * ���硰abc�������Ϊa,b,c,ab,bc,ac,abc;
 * ���õݹ鷽���������ַ�����ÿ���ַ���Ϊȡ�Ͳ�ȡ������������ȡ������뵽�ַ�������У����ûȡ����ɾ���ϴ��Ǹ��ַ������б��� 
 */
public class CombineRecursive {
	public static void combine (char[]c,int start,int len,StringBuffer sb){
		if(len ==0){
			System.out.println(sb+"");
			return;
		}
		if(start == c.length)
		{			
			return;
		}
		sb.append(c[start]);//���������а�������ַ�����ֻ�ÿ���ʣ�µ��ַ��У��ַ�������Ϊlen-1�����
		combine(c,start+1,len-1,sb);
		sb.deleteCharAt(sb.length()-1);//���������в���������ַ����������µ��ַ����У���ϳ���Ϊlen.
		combine(c,start+1,len,sb);
	}
	public static void main(String args[]){
		String s = "abcde";
		char c[] = s.toCharArray();
		StringBuffer sb = new StringBuffer("");
		for(int i =1;i<=c.length;i++){//�ַ�������Ϊ1,2��....len��������
			combine(c,0,i,sb);//�ַ�������Ϊ���� ��
		}
	}
}
