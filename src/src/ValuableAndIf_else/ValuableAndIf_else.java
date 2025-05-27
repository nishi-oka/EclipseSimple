package ValuableAndIf_else;

import java.util.Scanner;

//コマンドラインに整数を３つ入れてください。
public class ValuableAndIf_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//【課題2】
		System.out.println("【課題2】");
		 System.out.print("数字Aを入力してください：");
	        int A = scanner.nextInt();
	     System.out.print("数字Bを入力してください：");
	        int B = scanner.nextInt();
	        kadai2(A, B);
			
		//【課題3】
		System.out.println("【課題3】");
	     System.out.print("偶数/奇数を判別したい数字を入力してください：");
	        int number = scanner.nextInt();
	     kadai3(number);

	     scanner.close();
		}
	
	//【課題2】
	//２つの整数値をコマンドラインから入力を受け取り、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
	//コマンドラインから入力を受け取る方法は以下の記事を参考にしましょう！
	//例）
	//数字Aを入力してください：23
	//数字Bを入力してください：34
	//大きい数字は34です
	public static int kadai2(int A, int B) {

		if (A > B) {
            System.out.println("大きい数字は" + A + "です。");
            return A;
        } else if (B > A) {
            System.out.println("大きい数字は" + B + "です。");
            return B;
        } else {
            System.out.println("比較対象外です。");
            return A; // 同じなのでどちらでもOK
        }
	}
	
	//【課題3】
	//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
	public static void kadai3(int number) {
		if(number % 2 == 0) {
			System.out.println("この数字は偶数です。");
        } else {
            System.out.println("この数字は奇数です。");
        }
	}


}
