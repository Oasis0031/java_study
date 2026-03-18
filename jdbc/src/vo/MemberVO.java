package vo;

import java.util.Objects;

public class MemberVO {
	private Long id;
	private String memberEmail;
	private String memberPassword;
	private String memberAdress;
	private String memberRecommenderEmail;
	public MemberVO() {;}
	
	public MemberVO(Long id, String memberEmail, String memberPassword, String memberAdress,
			String memberRecommenderEmail) {
		super();
		this.id = id;
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAdress = memberAdress;
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	public MemberVO(String memberEmail, String memberPassword, String memberAdress) {
		this.memberEmail = memberEmail;
		this.memberPassword = memberPassword;
		this.memberAdress = memberAdress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberAdress() {
		return memberAdress;
	}
	public void setMemberAdress(String memberAdress) {
		this.memberAdress = memberAdress;
	}
	public String getMemberRecommenderEmail() {
		return memberRecommenderEmail;
	}
	public void setMemberRecommenderEmail(String memberRecommenderEmail) {
		this.memberRecommenderEmail = memberRecommenderEmail;
	}
	@Override
	public String toString() {
		return "MemverVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberAdress=" + memberAdress + ", memberRecommenderEmail=" + memberRecommenderEmail + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, memberAdress, memberEmail, memberPassword, memberRecommenderEmail);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(memberAdress, other.memberAdress)
				&& Objects.equals(memberEmail, other.memberEmail)
				&& Objects.equals(memberPassword, other.memberPassword)
				&& Objects.equals(memberRecommenderEmail, other.memberRecommenderEmail);
	}
}
