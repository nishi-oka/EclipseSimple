package Valuable_Calculation;

public class Valuable_Calculation {

	public static void main(String[] args) {
		//【課題1】
		//変数 x の値を表示する。
		kadai1();
		
		//【課題2】
		kadai2();
		
		//【課題3】
		kadai3();
	}
	

	//【課題1】
	 static void kadai1(){
		//int 型の変数 x に数値 7 を代入する。
		int x = 7;
		//変数 x の値を 3 倍にする。
		x = x * 3;
		System.out.println("7 × 3 = " + x);
		
		//変数 x の値を半分（1/2）にする。
		x = x / 2;
		//変数 x の値を表示する。
		System.out.println("21 % 2 = " + x + "(余り無視)");
	}
	
	//【課題2】
	 //int 型の変数 xに数値 19、yに数値23 を代入し、その積を変数 z に代入して z の値を表示するプログラムを作成しましょう。
	 static void kadai2() {
		 int x = 19;
		 int y = 23;
		 int z = x * y;
		 System.out.println("z = " + z);
	 }
	 
	 //【課題3】
	 //String 型の変数sに自身の苗字を代入、int 型 変数 xに自身の年齢を代入し、"sはx歳です。"と表示するプログラムを作成しましょう；
	 static void kadai3() {
		 String s = "西岡";
		 int x = 29;
		 System.out.println( s + "は" + x +"歳です。");
	 }

}
