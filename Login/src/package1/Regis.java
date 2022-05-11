package package1;

import java.util.Scanner;

public class Regis {
	Regis(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("請輸入使用者名稱：");
		String user = keyboard.nextLine();
		System.out.println("");
		
		System.out.println("請輸入密碼：");
		String password = keyboard.nextLine();
		System.out.println("");
		
		new User(user, password);
		
		//回主選單
		new UserRegister();
		
	}

}
