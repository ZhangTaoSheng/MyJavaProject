/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月14日 下午3:50:43 
 * 类说明 
 */
import java.sql.*;
public class TestJDBC {
	public static void main (String args[]){
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:dbname";
		String user = "zts";
		String password = "zts310";
		String driver = "oracle.jdbc.driver.oracleDriver";
		Connection con = null;
		Statement sta = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(driver);
			 con = DriverManager.getConnection(url,user,password);
			 sta = con.createStatement();
			sta.execute("insert into emp values(1,'James',25)");
			rs = sta.executeQuery("select * from emp");
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			try{
			if(rs!=null)rs.close();
			if(sta!=null)sta.close();
			if(con!=null)con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
