/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��7�� ����9:54:59 
 * ��˵�����ҳ������еڶ��������
 * �������ÿռ任ʱ�䣬ÿ�αȽ����� 
 */
public class FindSecMax {
	public static int findSecMax(int []a ){
		int max = a[0];
		int secMax = Integer.MIN_VALUE;
		for(int i =1; i<a.length;i++){
			if(a[i]>max){
				secMax = max;//�ڱ仯���ֵ֮ǰ�������ֵ�����δ�ֵ
				max = a[i];
			}else{
				if(secMax<a[i])
					secMax = a[i];//������ֵû�иı䣬��ô��δ�ֵ���бȽϣ����ȴδ�ֵ���򽫴�ֵ�����δ�ֵ����
			}
		}
		return secMax;
	}
	public static void main(String args[]){
		int []a = {1,3,5,7,8,9};
		System.out.println(FindSecMax.findSecMax(a));
	}

}
