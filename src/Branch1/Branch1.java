package Branch1;

public class Branch1 {

	public static void main(String[] args) {
		
		//【課題1】
		//動画内のサンプルプログラムをif-else文を使って書き直してみましょう。
		// args[0]で受け取ったIntegerをInt型にする
		int price = Integer.parseInt(args[0]);
		double rate = 0.10; //消費税率：10%
		int discount, amount;

		//priceの値が3000以上ならdiscountの値を300にする。
		if (price >= 5000) {
			discount = 500;
		} else if(price >= 3000){
			discount = 300;
		} else {
			discount = 0;
			
		}

		//値引き後の金額×消費税込みの倍率を計算してからint型にキャスト変換し小数点以下を切り捨て、amountに代入。
		amount = (int) ((price - discount) * (1 + rate));
		System.out.println("【課題1】");
		System.out.println("値引金額：" + discount + "円");
		System.out.println("税込金額：" + amount + "円");
		

	}

}
