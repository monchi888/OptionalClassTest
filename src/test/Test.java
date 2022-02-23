package test;

import java.util.Optional;

public class Test {
	static Test getRandom() {
		Test test = null;
		if (new java.util.Random().nextBoolean()) {
			test = new Test();
		}
		return test;		
	}
	
	/*
	 * このメソッド結局使わんかった...^^;
	 */
	String hello() {
		return "Hello, World.";
	}

	public static void main(String[] args) {
		Test test = getRandom();
		/*
		 * Optionalとは、値をラップし、その値がnullかもしれないことを表現するクラス。
		 * メソッドの戻り値として使用する。
		 * nullの場合の処理を強制し、
		 * NullPointerExceptionの発生を防ぐことができる。
		 */
		Optional<Test> strOpt = Optional.ofNullable(test);
		if (strOpt.isPresent()) {
			String message = strOpt.toString();
			System.out.println(message.length());
		}
		/*
		 * strOptの中身が存在している場合、
		 * 変数vにstrで宣言した文字列を格納し、
		 * sysout内で使用する
		 */
		strOpt.ifPresent(v -> System.out.println(v.toString()));
	}
}
