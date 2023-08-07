package com.j2ee_assign;

import java.io.BufferedReader;
import java.io.FileReader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.util.StringTokenizer;

import com.jdbc.utility.GetOracleConnection;



public class transfer_data {
	private String id;
	private String name;
	private String phone;
	private String address;
	public transfer_data() {
		super();
		// TODO Auto-generated constructor stub
	}
	void write_data() {


		System.out.println("\t****** WELCOME TO RB GROUP  ******\n");
		System.out.println("view all file data\n");
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		List<input_data> li= new ArrayList<input_data>();
		input_data cd;
		String data;
	
			try {
				fr= new FileReader("tranfer_data.txt");
				br= new BufferedReader(fr);
				
				data =br.readLine();
				while(data!=null) {
					st=new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						id = st.nextToken();
						name=st.nextToken();
						phone=st.nextToken();
						 address=st.nextToken();
						System.out.print("ID is ="+id+"\t");
						System.out.print("Name is ="+name+"\t\t");
						System.out.print("Phone no is ="+phone+"\t\t");
						System.out.println("Address is ="+address);
						
					}
					data=br.readLine();
				}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}

}

	public void transfer_filedata_to_collectionObj_to_database(){
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		List<input_data> li= new ArrayList<input_data>();
		input_data cd;
		String data;
	
			try {
				fr= new FileReader("tranfer_data.txt");
				br= new BufferedReader(fr);
				
				data =br.readLine();
				while(data!=null) {
					st=new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						 id = st.nextToken();
						 name=st.nextToken();
						 phone=st.nextToken();
						 address=st.nextToken();
						cd=new input_data(id,name,phone,address);
						
					//	cd.setCust_balace(balance);
						li.add(cd);
						
					}
					data=br.readLine();
				}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			for (input_data c1:li) {
				//System.out.println(c1.getCust_Id()+""+c1.getCust_Name()+""+c1.getCust_phone()+""+c1.getCust_balace());
				Connection conn;
				conn=GetOracleConnection.getMyOracleConn();
				PreparedStatement pst;
				String qry="insert into transfer_data values(?,?,?,?)";
				try {
					pst =conn.prepareStatement(qry);
					int id1=Integer.parseInt(c1.getInt_id());
					long phone1=Long.parseLong(c1.getInt_phone());
					pst.setInt(1, id1);
					pst.setString(2,c1.getInt_name() );
					pst.setLong(3, phone1);
					pst.setString(4,c1.getAddress() );
					int row =pst.executeUpdate();
					if(row > 0)
						System.out.println("data insert succes in database");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("already id exist");
				}
				
			}
	}
	void show_collection_data() {
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		List<input_data> li= new ArrayList<input_data>();
		input_data cd;
		String data;
	
			try {
				fr= new FileReader("tranfer_data.txt");
				br= new BufferedReader(fr);
				
				data =br.readLine();
				while(data!=null) {
					st=new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						 id = st.nextToken();
						 name=st.nextToken();
						 phone=st.nextToken();
						 address=st.nextToken();
						cd=new input_data(id,name,phone,address);
						
					//	cd.setCust_balace(balance);
						li.add(cd);
						
					}
					data=br.readLine();
				}
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("\t****** WELCOME TO RB GROUP  ******\n");
		System.out.println("view all collection data\n");
		for (input_data c1:li) {
			System.out.print("ID is ="+c1.getInt_id()+"\t");
			System.out.print("Name is ="+c1.getInt_name()+"\t\t");
			System.out.print("Phone no is ="+c1.getInt_phone()+"\t\t");
			System.out.println("Address is ="+c1.getAddress());
		}
	}
	void show_database() {
		Connection conn;
		conn=GetOracleConnection.getMyOracleConn();
		PreparedStatement pst;
		String qry="select * from transfer_data";
		ResultSet rs;
		try {
			pst =conn.prepareStatement(qry);
			//pst.setInt(1, Integer.parseInt(args[0]));

			rs = pst.executeQuery();
			//looping thru the result set
			while(rs.next()) {
				
				System.out.print("ID is ="+rs.getInt("tid")+"\t");
				System.out.print("Name is ="+rs.getString("tname")+"\t\t");
				System.out.print("Phone no is ="+rs.getLong("tphone")+"\t\t");
				System.out.println("Address is ="+rs.getString("taddress"));
		}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
