package org.methods;

public class SbiBank {
	public static void main(String[] args) {
		
		String a = "Welcome To Class java";
        String replace = a.replace("java","sql");
        System.out.println(replace);
        
        String c = "Greens Adayar";
        String replace1 = c.replace("Adayar","omr");
        System.out.println(replace1);
        
        String e = "Welcome to java class";
        String replace2 = e.replace(" ","#");
        System.out.println(replace2);
        
        String g = "Nishakerala24@gmail.com";
        String replace3 = g.replace("gmail","yahoo");
        System.out.println(replace3);
        
        String i = "5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
        String replace4 = i.replace(",pincode-626101"," ");
        System.out.println(replace4);
        
        
}
}
