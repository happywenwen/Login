package package1;

import java.util.Scanner;

public class UserRegister {
	
	UserRegister(){
		System.out.println("請輸入 1/2/3");
		System.out.println("1 (登入)");
		System.out.println("2 (註冊)");
		System.out.println("3 (退出)");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("輸入：");
		int input = keyboard.nextInt();
		System.out.println(input);
		
		if(input ==1) {
			System.out.println("登入囉～～～");
			System.out.println("--------------------");
		}else if(input == 2) {
			System.out.println("註冊囉～～～");
			System.out.println("--------------------");
			new Regis();
		}else if(input == 3) {
			System.out.println("歡迎下次使用");
			System.out.println("--------------------");
			System.exit(0);
		}else {
			System.out.println("您的格式錯誤");
			System.out.println("--------------------");
			System.exit(0);
		}
	}
	
}
