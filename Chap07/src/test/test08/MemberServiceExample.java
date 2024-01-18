package test.test08;

public class MemberServiceExample {
	//이거보고 메소드 어떻게 쓰는지 맞추기 ,로그아웃하면 로그아웃 메세지 띄우기
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}