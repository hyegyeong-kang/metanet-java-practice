package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.전화번호 추가  2.전화번호 목록 출력  3.검색 4. 종료
		Manager mg = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1: 전화번호 추가 / 2: 전화번호 목록 출력 / 3: 전화번호 검색 / 4.종료");
			int chk = sc.nextInt();
			
			switch(chk) {
			case 1:
				mg.addPhoneinfo();
				break;
			case 2:
				mg.listPhoneInfo();
				break;
			case 3:
				mg.searchPhoneNum();
				break;
			case 4:
				return;
			}
		}
	}
}
