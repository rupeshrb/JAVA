import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.utility.GetOracleConnection;

public class perpaerdStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		conn=GetOracleConnection.getMyOracleConn();
		PreparedStatement pst;
		String qry="insert into empdata values(?,?)";
		try {
			pst =conn.prepareStatement(qry);
			pst.setInt(1, Integer.parseInt(args[0]));
			pst.setString(2, args[1]);
			int row =pst.executeUpdate();
			if(row > 0)
				System.out.println("succes");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
