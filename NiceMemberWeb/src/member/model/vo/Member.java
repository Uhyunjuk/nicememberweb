package member.model.vo;

import java.sql.Timestamp;

public class Member {

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberEmail;
	private String memberAddress;
	private String memberPhone;
	private String memberHobby;
	private Timestamp memberDate;
	
	public Member() {
		
	}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress, String memberPhone,String memberHobby) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberHobby = memberHobby;
	}


	public Member(String memberId, String memberPw, String memberName, int memberAge, String memberGender,
			String memberEmail, String memberAddress, String memberPhone, String memberHobby, Timestamp memberDate) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberHobby = memberHobby;
		this.memberDate = memberDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberHobby() {
		return memberHobby;
	}
	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}
	public Timestamp getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(Timestamp memberDate) {
		this.memberDate = memberDate;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + ", memberAge="
				+ memberAge + ", memberGender=" + memberGender + ", memberEmail=" + memberEmail + ", memberAddress="
				+ memberAddress + ", memberPhone=" + memberPhone + ", memberHobby=" + memberHobby + ", memberDate="
				+ memberDate + "]";
	}
	
}
