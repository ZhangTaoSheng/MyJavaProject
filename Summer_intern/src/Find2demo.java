/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月10日 上午10:37:02 
 * 类说明 
 * 在一个二维数组中，都按照从左到右递增，从上到下的顺序排列
 * 求，该二维数组中，是否存在一个数
 */
public class Find2demo {
	 public boolean find(int [][] nums, int rows ,int columns ,int number){
		boolean found =false;
		if(nums != null&& rows>0&&columns>0){
			int rowNum = 0;
			int columnNum = columns-1;
			while(rowNum<rows&&columnNum>=0){
				if(nums[rowNum] [columnNum] == number){//从矩阵的右上角开始
					found = true;
					break;
				}else if(nums[columnNum] [columnNum] > number){//目标值小，则目标值一定是在左侧
					--columnNum ;//左侧就是减少列号
				}else{
					++rowNum;//目标值大， 说明一定在下面，行号减少，继续搜索
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
