package goodee.gdj58.booking_c.vo;

import lombok.Data;

@Data
public class Company {
	private String companyId;
	private String companyPw;
	private String companyName;
	private String companyCeo;
	private String companyAddress;
	private String companyPhone;
	private String companyEmail;
	private String companyBank;
	private String companyAccount;
	private String companyNumber;
	private String infoAgree; // 개인정보제공동의
	private int latitude; // 위도
	private int longtitude; // 경도
}
