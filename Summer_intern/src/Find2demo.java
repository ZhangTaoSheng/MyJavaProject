/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��10�� ����10:37:02 
 * ��˵�� 
 * ��һ����ά�����У������մ����ҵ��������ϵ��µ�˳������
 * �󣬸ö�ά�����У��Ƿ����һ����
 */
public class Find2demo {
	 public boolean find(int [][] nums, int rows ,int columns ,int number){
		boolean found =false;
		if(nums != null&& rows>0&&columns>0){
			int rowNum = 0;
			int columnNum = columns-1;
			while(rowNum<rows&&columnNum>=0){
				if(nums[rowNum] [columnNum] == number){//�Ӿ�������Ͻǿ�ʼ
					found = true;
					break;
				}else if(nums[columnNum] [columnNum] > number){//Ŀ��ֵС����Ŀ��ֵһ���������
					--columnNum ;//�����Ǽ����к�
				}else{
					++rowNum;//Ŀ��ֵ�� ˵��һ�������棬�кż��٣���������
				}
				
			}
		}
		return found;
	}
public static void main(String args[]){
	int [][]nums = {{1,2,8},{2,4,9},{4,7,10}};
	Find2demo  ls = new Find2demo();
	System.out.println(ls.find(nums,3,3,2));
}
}
