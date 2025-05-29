package ArrayAndLoop;

import java.util.Scanner;

public class ArrayAndLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//【課題1】
		System.out.println("【課題1】");
		System.out.print("xを入力してください：");
		int x = scanner.nextInt();
		kadai1(x);
		scanner.close();
		System.out.println();
		kadai2();
		System.out.println();
		kadai3();
		System.out.println();
		kadai4();

	}

	//【課題1】
	//入力をint型変数xで受け取り、九九、xの段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しましょう。
	//例）
	//xを入力してください：3
	//３、６、９、１２、１５、１８、２１、２４、２７
	static void kadai1(int x) {
		int i = 0;
		if (x <= 9) {
			for (i = 1; i <= 9; i++) {
				int y = i * x;
				if (i == 9) {
					System.out.print(y);
				} else {
					System.out.print(y + "、");

				}
			}

		}

	}

	//【課題2】
	//for文又は、while文を用い、以下の配列の4個目の要素、要素数、平均値を計算してください。
	//平均値はdouble型で出力しましょう。
	static int[] nums = { 20, 1, 2, 23, 5, 11, 5, 67 }; //初期化された配列

	//＊チャレンジできる人は、中央値と分散も計算してみましょう！
	static void kadai2() {
		System.out.println();
		System.out.println("【課題2】");
		System.out.print("4個目の要素：");
		System.out.print(nums[3]);
		System.out.println();

		System.out.print("要素数：");
		System.out.print(nums.length);
		System.out.println();

		System.out.print("平均値：");
		double total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		double average = total / nums.length;
		System.out.print(average);

	}

	//【課題3】
	//二次元配列を使う方法を調べてみましょう。
	//以下の配列の数字が横5、縦3つ並ぶように、表示してみましょう。
	static int[][] array = {
			{ 1, 8, 12, 17, 20 },
			{ 2, 5, 11, 13, 18 },
			{ 4, 6, 9, 19, 21 }
	};

	static void kadai3() {
		System.out.println();
		System.out.println("【課題3】");
		for (int o = 0; o < array.length; o++) {
			for (int i = 0; i < array[o].length; i++) {
				System.out.print(array[o][i] + " ");
			}
			System.out.println();

		}

	}

	//【課題4】
	//以下の画像のようなピラミッドを出力してみましょう
	static void kadai4() {
		System.out.println();
		System.out.println("【課題4】");

		//左寄せ$ピラミッド
		for (int i = 1; i <= 4;) { //4行まで出力
			for (int d = 1; d <= i; d++) { //
				System.out.print("$");
			}
			System.out.println();
			i++;
		}
		System.out.println();

		//右寄せ$ピラミッド
		for (int i = 1; i <= 4; i++) {
			for (int d = 1; d <= 4; d++) { //4文字目まで繰り返す
				if (d <= 4 - i) {
					System.out.print(" ");

				} else {
					System.out.print("$");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
