
public class UniquePaths_leetCode_62 {
	public static int path = 0;
	public static int uniquePaths(int m, int n){
		
		move(1,1,m,n);
		return path;
		
	}
	
	public static void move(int x, int y,int m, int n ){
		if(x == m && y ==n){
			path++;
			return ;
		}
		if(x==m&& y<n)
		{
			move(x,y+1,m,n);
			
		}
		if(y == n&& x<m)
		{
			move(x+1,y,m,n);

		}
		if(x<m&&y<n){
			move(x+1,y,m,n);
			move(x,y+1,m,n);			
		}
		
	}
	/**
	 * 采用动态规划。对于格点(i,j)。由于只能从上格点(i-1,j)或左格点(i,j-1)到达，并且两者路径是不重复的
	 * @param m
	 * @param n
	 * @return
	 */
	
	
	public static int uniquePaths_dongtai(int m, int n) {  
        int[][] A = new int[m][n];  
  
        for (int i = 0; i < m; ++i) {  
            A[i][0] = 1;  
        }  
  
        for (int i = 1; i < n; ++i) {  
            A[0][i] = 1;  
        }  
  
        for (int i = 1; i < m; ++i)  
            for (int j = 1; j < n; ++j) {  
                A[i][j] = A[i][j - 1] + A[i - 1][j];  
            }  
  
        return A[m - 1][n - 1];  
    }  
	
	
	public static void main(String[] args) {
		int ret_digui = UniquePaths_leetCode_62.uniquePaths(2,10);
			System.out.println("递归结果是："+ret_digui);
		int ret_dongtai = UniquePaths_leetCode_62.uniquePaths_dongtai(2,10);
		System.out.println("动态规划结果是："+ret_dongtai);
	
	}

}
