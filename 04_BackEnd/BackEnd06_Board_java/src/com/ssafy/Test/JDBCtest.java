package com.ssafy.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;

//1. JDBC 드라이버 로드
//2. 데이터 베이스 연결 (connection)
//3. SQL 준비 및 실행
//4. 데이터베이스 연결 해제

public class JDBCtest {
	
	public JDBCtest() {
		//드라이버를 로드한다
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JDBCtest db = new JDBCtest();
		
		for(Board b : db.seletAll()) {
			System.out.println(b);
		}
	}
	
	private List<Board> seletAll() {
		List<Board> list = new ArrayList<>();
		
		//2. 데이터베이스를 연결해야함
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "ssafy", "ssafy");
			
			Statement stmt = conn.createStatement();
			//전체 값을 가져오는 SQL문 작성
			String sql = "SELECT * FROM board";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//데이터베이스에서 index는 1부터 시작
			while(rs.next()) {
				Board board = new Board();
				
				board.setId(rs.getInt("id"));	//rs.getInt(1); 과 같다
				//인덱스로 가져오는 것이 더 퍼포먼스가 좋다고 하지만
				//그 인덱스를 다 외울 수 없기 때문에 라벨 명으로 가져온다!
				
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getString("reg_date"));
				board.setViewCnt(rs.getInt("view_cnt"));
				
				list.add(board);
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
