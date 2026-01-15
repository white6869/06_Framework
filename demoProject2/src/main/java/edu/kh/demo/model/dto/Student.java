package edu.kh.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
// Spring EL 같은 경우 DTO 객체 출력할 때 getter 가 필수 작성 되어있어야 함!
=======
// Spring EL 같은 경우 DTO 객체 출력할 때 getter 가 필수 작성 되어있어야함 !
>>>>>>> dfbb5ac645c6f5720e59286ec726d937ebb005e5
// -> ${Student.name} == ${Student.getName()}
// 내부적으로 해당 DTO의 Getter를 호출하고 있기 때문!

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
<<<<<<< HEAD
	private String studentNo; 	// 학생번호
	private String name; 		// 이름
	private int age;			// 나이
=======
	private String StudentNo;  // 학생번호
	private String name;  // 이름
	private int age;  // 나이
	
	
	
>>>>>>> dfbb5ac645c6f5720e59286ec726d937ebb005e5
}
