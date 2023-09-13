package org.condition;

public class Condition {
	private void height(int a, int b, int c,int d, int e, int f,int g, int h){
		if(a>b && a>c && a>d && a>e && a>f && a>g && a>h) {
			System.out.println("A is tallest person");
		}
		else if(b>a && b>c && b>d && b>e && b>f && b>g && b>h) {
			System.out.println("b is tallest person");
		}
		else if(c>a && c>b && c>d && c>e && c>f && c>g && c>h) {
			System.out.println("c is tallest person");
		}
		else if(d>a && d>b && d>c && d>e && d>f && d>g && d>h) {
			System.out.println("d is tallest person");
		}
		else if(e>a && e>b && e>c && e>d && e>f && e>g && e>h) {
			System.out.println("e is tallest person");
		}
		else if(f>a && f>b && f>c && f>d && f>e  && f>g && f>h) {
			System.out.println("f is tallest person");
		}
		else if(g>a && g>b && g>c && g>d && g>e  && g>f && g>h) {
			System.out.println("g is tallest person");
		}
		else if(h>a && h>b && h>c && h>d && h>e  && h>f && h>g) {
			System.out.println("h is tallest person");
		}
		else {
			System.out.println("no one is tallest ");
		}
	}
		public static void main (String[]args) {
			Condition con = new Condition();
			con.height(145, 158, 135, 120, 153, 122, 106, 149);
		}
	}
		
		
