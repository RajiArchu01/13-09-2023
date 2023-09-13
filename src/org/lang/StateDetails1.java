package org.lang;

public class StateDetails1 {
	private void southIndia() {
		System.out.println("chennai");
	}
	private void northIndia() {
		System.out.println("delhi");
	} 
	public static void main(String[] args)
	{

		StateDetails1 state = new StateDetails1();
		state.southIndia();
		state.northIndia();

		LanguageInfo1 lang= new LanguageInfo1();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
	}}

