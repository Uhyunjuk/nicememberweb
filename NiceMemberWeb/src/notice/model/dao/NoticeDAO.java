package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import notice.model.vo.Notice;

public class NoticeDAO {
	
	public int insertNotice(Connection conn, Notice notice) {
		String query = "INSERT INTO NOTICE_TBL VALUES(SEQ_NOTICENO.NEXTVAL,?,?,?,DEFAULT,DEFAULT)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeSubject());
			pstmt.setString(2, notice.getNoticeContent());
			pstmt.setString(3, "admin"); // Writer에 값이 들어가있지 않기때문에 아무string이나 넣어준다 
			result = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<Notice> selectAllNotice(Connection conn) {
		String query = "SELECT * FROM NOTICE_TBL";
		List<Notice> nList = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			// 후처리
			nList = new ArrayList<Notice>();
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setNoticeSubject(rset.getString("NOTICE_SUBJECT"));
				notice.setNoticeContent(rset.getString("NOTICE_CONTENT"));
				notice.setNoticeWriter(rset.getString("NOTICE_WRITER"));
				notice.setNoticeDate(rset.getTimestamp("NOTICE_DATE"));
				notice.setNoticeCount(rset.getInt("NOTICE_COUNT"));
				nList.add(notice);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return nList;
	}
}
