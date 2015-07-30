package util.hashmap;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		MemberService memberService  = new MemberServiceImpl();
		
		/*Member hong = new Member("qwe","123","홍길동",12,"서울");
		memberService.create("qwe", hong);*/
		
		Scanner scanner = new Scanner(System.in);
		String input = "", key =""; 
		
		while (true) {
			System.out.println("1.[JOIN]회원가입 2.[LOGIN]로그인 0.[LOGOUT]로그아웃");
			 input = scanner.next();
			
			if (input.equals("LOGOUT")) {
				System.out.println("로그아웃");
				break;			
			}else{
				switch (input) {
				case "JOIN":
					System.out.println("아이디를 입력하세요");
					String id = scanner.next();
					System.out.println("비밀번호 입력하세요");
					String pass = scanner.next();
					System.out.println("이름을 입력하세요");
					String name = scanner.next();
					System.out.println("나이를 입력하세요");
					int age = scanner.nextInt();
					System.out.println("주소를 입력하세요");
					String adr = scanner.next();
					Member member = new Member(id,pass,name,age,adr);
					memberService.create(id, member);
					break;
				case "LOGIN":
					System.out.println("아이디를 입력하세요");
					String id1 = scanner.next();
					System.out.println("비밀번호 입력하세요");
					String pass1 = scanner.next();
					String result =memberService.login(id1, pass1);
					System.out.println(id1+"님");
					
					break;

				default: System.out.println("에러"); break;
				}
			}
		}
	}
}
