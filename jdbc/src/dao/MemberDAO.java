package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemberVO;

public class MemberDAO {
//   1. 연결
	Connection connection;
//   2. 쿼리
	PreparedStatement preparedStatement;
//   3. 결과
	ResultSet resultSet;

//   로그인 성공
	public static Long session;

	public void closeResources() {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (resultSet != null) {
				resultSet.close();
			}

			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//   회원가입
	public void join(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "INSERT INTO TBL_MEMBER(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS)"
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?)";

		try {
//         쿼리 완성!
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberAddress());

//         쿼리를 실행
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("member join query 오류");
			e.printStackTrace();
		} finally {
			this.closeResources();
		}

	}

//   로그인
	public boolean login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER " + "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		boolean check = false;

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());

//         결과가 있을 때
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			session = resultSet.getLong(1);
			check = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResources();
		}

		return check;

	}

//   마이페이지
	public MemberVO findById() {
//      단, 패스워드는 *절대 화면으로 가져오면 안된다.
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS, MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER " + "WHERE ID = ?";

		MemberVO memberVO = new MemberVO();
		connection = DBConnecter.getConnect();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);

			resultSet = preparedStatement.executeQuery();
			resultSet.next();

			memberVO.setId(resultSet.getLong("ID"));
			memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
			memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
			memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
			memberVO.setMemberRecommenderEmail(resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberVO;
	}

//   정보수정
	public void update(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "UPDATE TBL_MEMBER " + "SET MEMBER_EMAIL = ?, MEMBER_PASSWORD = ?, MEMBER_ADDRESS = ?"
				+ "WHERE ID = ?";

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			preparedStatement.setLong(4, session);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResources();
		}
	}

//   새로운 비밀번호 변경
	public boolean changePassword(String newPassword) {
		String query = "UPDATE TBL_MEMBER " + "SET MEMBER_PASSWORD = ? " + "WHERE ID = ?";
		connection = DBConnecter.getConnect();
		boolean isUpdate = false;

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, newPassword);
			preparedStatement.setLong(2, session);

			preparedStatement.executeUpdate();
			isUpdate = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeResources();
		}

		return isUpdate;

	}

//   회원탈퇴
	public boolean withdraw() {
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		boolean isWithDraw = false;
		connection = DBConnecter.getConnect();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);

			preparedStatement.executeUpdate();
			isWithDraw = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isWithDraw;

	}

//   로그아웃
	public void logout() {
		session = null;
	}

//   나를 추천한 사람 전체 조회
	public ArrayList<MemberVO> getRecommenders() {
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_ADDRESS, MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE MEMBER_RECOMMENDER_EMAIL = (SELECT MEMBER_EMAIL FROM TBL_MEMBER WHERE ID = ?)";

		connection = DBConnecter.getConnect();
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				MemberVO memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("ID"));
				memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
				memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
				memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
				memberVO.setMemberRecommenderEmail(resultSet.getString("MEMBER_RECOMMENDER_EMAIL"));

				members.add(memberVO);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeResources();
		}

		return members;
	}
	
//  내가 추천한 추천인 조회
	public String getWhoIRecommended(long myId) {
		String query = "SELECT MEMBER_RECOMMENDER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE ID = ?)";
		String recommender = null;
		
		connection = DBConnecter.getConnect();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, myId);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				recommender = resultSet.getString("MEMBER_RECOMMENDER_EMAIL");
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        this.closeResources();
	}
		return recommender;
	}
}
