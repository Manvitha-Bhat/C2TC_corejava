package day10;

public class examples {

	public static void main(String[] args) {
		String s1= new String ("   indian   ");
		System.out.println(s1);
		String s2= s1.toUpperCase();
		String s33="HEELOO";
		System.out.println(s2);
		System.out.println(s33.toLowerCase());
		System.out.println("length of string is "+s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2,5));
		System.out.println(s1.strip());
		System.out.println(s1.trim());
		String replaceString = s1.replace('i','a');
		System.out.println(replaceString);
		//System.out.println("fghiuegh");
		System.out.println(s1.concat(s2));
		
		String str1="how are you";
		System.out.println(str1.contains("you"));
		
		String str = "To learn Java visit abc.in";
		if(str.contains("abc.in.com"))
		System.out.println("This string contains abc.in");
		else
		System.out.println("Result not found");
		
		String s11 = "The walking Dead";

		String s22 = "The walking Dead";

		String s3 = "THE WALKING DEAD";

		String s4 = "The WEST WEEDS";

		System.out.println(s11.equalsIgnoreCase(s22));

		System.out.println(s11.equalsIgnoreCase(s3));

		System.out.println(s11.equalsIgnoreCase(s4));
		
		
		
		String s0 = "This is the world";

		int index4 = s0.indexOf('s');

		System.out.println(" s occurs at "+index4);

		int index1 = s0.indexOf("is");
		int index2 = s0.indexOf("world");

		System.out.println(index1);

		System.out.println(index2);

		int index3 = s0.indexOf("he",7);

		System.out.println(index3);
		int index5= s0.lastIndexOf('w');
		System.out.println("index of w is " + index5);
		
		
		String strr = "Java";

		char ch = strr.charAt(2);

		System.out.println(ch);

		System.out.println(strr.charAt(3));

		//System.out.println(strr.charAt(4));-> exception

		//System.out.println(strr.charAt(-1));//-> exception
		
		
		String s = "Are", t = "you", u = "ready";

		System.out.println(s + t + u);

		System.out.println(s.concat(t));
		
		
		String s5= "Twilight Saga";

		char[] chh = s5.toCharArray();

		for(int i = 0; i < chh.length; i++){

		System.out.print(chh[i]+"  ");

		}
		System.out.println();
		String s10 = "You must be the change you wish to see in the world";

		System.out.println(s10.startsWith("Y"));
		System.out.println(s10.startsWith("You must"));
		System.out.println(s10.startsWith("a"));
		System.out.println(s10.startsWith("o", 1));
		System.out.println();
		System.out.println(s10.endsWith("d"));
		System.out.println(s10.endsWith(" world"));
		
		System.out.println();
		String string= "";
		String string2="haii";
		System.out.println(string.isEmpty());
		System.out.println(string2.isEmpty());
		
		String joinString1=String.join("","welcome","to","jurassic","world");
		System.out.println(joinString1);
		
		
		int value = 30;

		String sr= String.valueOf(value);

		System.out.println(sr + 10);
		
		String ss = 150 - 150 + "error" + 50;

		System.out.println(ss);
//		String st = "Apple";
//
//		int a = 10;
		//System.out.println(st.concat(a));
		
		String ss1 = "Welcome to Jumanji";

		char[] charr = ss1.toCharArray();

		int len = charr.length;

		System.out.println(len);

		for (int i = 0; i < len; i++) {

		System.out.print(charr[i]+"  ");

		}
	}

}
