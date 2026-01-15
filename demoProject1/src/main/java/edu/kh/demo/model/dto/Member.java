package edu.kh.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter+setter+toString
@NoArgsConstructor // 기본생성자
<<<<<<< HEAD
@AllArgsConstructor // 모든 필드 초기화용 매개변수생성자
public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
=======
@AllArgsConstructor // 모든 필드 초기화용 매개변수 선언
public class Member {
	private String memberId;
	private String memberPw;
	private String meberName;
	private int memberAge;
	
	
	
>>>>>>> dfbb5ac645c6f5720e59286ec726d937ebb005e5
}
