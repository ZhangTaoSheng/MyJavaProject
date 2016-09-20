/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��9��11�� ����16:32
 * ��˵�� 
 * �����Ͻǻ��ǱȽϣ�
 */
public class Search2D_matrix_leetCode_74 {
    public boolean searchMatrix(int [][]matrix, int target){
    	boolean ret = false;
    	if(matrix!=null)
    	{
    		int rows = matrix.length;
    		int columns = matrix[0].length;
    		int start_row = 0;
    		int start_column = columns-1;
    		while(start_row < rows&&start_column >=0){
    			int temp = matrix[start_row][start_column];
    			if(temp == target)
    			{
    				ret = true;
    				break;
    			}
    			else if(temp>target){
    				start_column--;
    			}
    			else{
    				start_row++;
    			}
    		}
    	}
    	
    	return ret;
    }
	public static void main(String[] args) {
	
	}

}
