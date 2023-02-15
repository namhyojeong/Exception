package com.greedy.section01.xmlconfig;

import java.util.Map;

public class MemberController {

	private final MemberService memberService;
	private final PrintResult printResult;

	public MemberController() {
		this.memberService = new MemberService();
		this.printResult = new PrintResult();
	}

	public void registNewMember(Map<String, String> parameter) {

		String memberId = parameter.get("memberId");
		String memberPwd = parameter.get("memberPwd");
		String memberName = parameter.get("memberName");
		String gender = parameter.get("gender");
		String email = parameter.get("email");
		String phone = parameter.get("phone");
		String address = parameter.get("address");
		int age = Integer.parseInt(parameter.get("age"));
		
		MemberDTO member = new MemberDTO();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setGender(gender);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAddress(address);
		member.setAge(age);
		
		if(MemberService.registNewMember(member)) {
			printResult.printSuccessMessage("insertSuccess");
		} else {
			printResult.printErrorMessage("insertFailed");
		}
	}


	

		
	
}
