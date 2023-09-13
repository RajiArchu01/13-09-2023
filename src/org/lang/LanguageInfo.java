package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("tamil");
	}
	private void englishLanguage() {
		System.out.println("english");
	}
	private void hindiLanguage() {
		System.out.println("hindi");
	}
	public static void main(String[]args) {
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
		li.northIndia();
		li.southIndia();
	}

}
