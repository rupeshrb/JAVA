import java.sql.Connection;

import com.jdbc.utility.GetOracleConnection;

public class connect_by_jar {
	public static void main(String[] args) {
		Connection conn;
		conn=GetOracleConnection.getMyOracleConn();
		
	}
}
