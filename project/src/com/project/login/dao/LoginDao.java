package com.project.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.login.dto.LoginDto;

import sun.util.logging.resources.logging;


public class LoginDao {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String URL="jdbc:oracle:thin:@localhost:1521:testdb";
	private final String UID="kedu";
	private final String PASS="1234";
	
	public ArrayList<LoginDto> selectAllMember(){
		ArrayList<LoginDto> allLoginList= new ArrayList<>();
		String allLoginSql="select * from emp30 ";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL,UID,PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(allLoginSql);
			
			while(rs.next()){
				LoginDto loginDto= new LoginDto();
				loginDto.setEmpno(rs.getInt("empno"));
				loginDto.setEmpname(rs.getString("empname"));
				loginDto.setJuminno(rs.getString("juminno"));
				loginDto.setEmail(rs.getString("email"));
				loginDto.setPhone(rs.getString("phone"));
				loginDto.setIndt(rs.getString("init"));
				loginDto.setOutdt(rs.getString("outdt"));
				loginDto.setManyn(rs.getInt("manyn"));
				loginDto.setDeptno(rs.getInt("deptno"));
				loginDto.setRanknum(rs.getInt("rank"));
				
				allLoginList.add(loginDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (Exception e2) {
			}
		}
		
		return allLoginList;
	}
}
