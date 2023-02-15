package com.greedy.section01.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberController memberController = new MemberController();
		
		do {
			System.out.println("\n *** 회원 관리 프로그램 *** \n");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 모든 회원 조회");
			System.out.println("3. 아이디로 회원 조회");
			System.out.println("4. 성별로 회원 조회");
			System.out.println("5. 암호 수정");
			System.out.println("6. 이메일 변경");
			System.out.println("7. 전화번호 변경");
			System.out.println("8. 주소 변경");
			System.out.println("9. 회원 탈퇴");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : memberController.registNewMember(inputNewMember()); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 8 : break;
			case 9 : break;
			default : System.out.println("잘못된 번호를 선택하셨습니다.");
			
			}
		
		} while(true);
	}
	
	private static Map<String, String> inputNewMember() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등록할 회원의 아이디를 입력해주세요 : ");
		String memberId = sc.nextLine();
		System.out.println("등록할 회원의 비밀번호를 입력해주세요 : ");
		String memberPwd = sc.nextLine();
		System.out.println("등록할 회원의 이름을 입력해주세요 : ");
		String memberName = sc.nextLine();
		System.out.println("등록할 회원의 성별을 입력해주세요 : ");
		String gender = sc.nextLine();
		System.out.println("등록할 회원의 이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		System.out.println("등록할 회원의 핸드폰번호를 입력해주세요 : ");
		String phone = sc.nextLine();
		System.out.println("등록할 회원의 주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.println("등록할 회원의 나이를 입력해주세요 : ");
		String age = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("memberId", memberId);
		parameter.put("memberPwd", memberPwd);
		parameter.put("memberName", memberName);
		parameter.put("gender", gender);
		parameter.put("email", email);
		parameter.put("phone", phone);
		parameter.put("address", address);
		parameter.put("age", age);
		
		return parameter;
	}

}
