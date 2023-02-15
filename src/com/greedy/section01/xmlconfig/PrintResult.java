package com.greedy.section01.xmlconfig;

public class PrintResult {

	public void printSuccessMessage(String successCode) {
		
		String successMessage = "";
		switch(successCode) {
		case "insertSuccess" : successMessage = "insert 성공!"; break;
		case "updateSuccess" : successMessage = "update 성공!"; break;
		case "deleteSuccess" : successMessage = "delete 성공!"; break;
		default : successMessage = "DML 구문은 성공적으로 수행했으나 잘못된 코드값이 전달되었습니다."; break;
		}
		
		System.out.println(successMessage);
	}

	public void printErrorMessage(String errorCode) {
		
		String errorMessage = "";
		switch(errorCode) {
			case "insertFailed" : errorMessage = "회원 가입 실패!"; break;
			case "updateFailed" : errorMessage = "회원 정보 수정 실패!"; break;
			case "deleteFailed" : errorMessage = "회원 탈퇴 실패!"; break;
			case "selectFailed" : errorMessage = "회원 조회 실패!"; break;
			default : errorMessage = "알 수 없는 에러 발생!"; break;
		}
		
		System.out.println(errorMessage);
	}

}
