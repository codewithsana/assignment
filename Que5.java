package String;

public class Que5 {
public static void main(String[] args) {
	String str= "ABACD";
	String str1="CDABA";
	 String str2=str.concat(str1);//concatination
	System.out.println(str2);
	if(str.length()==str1.length()) {//rotation
		System.out.println("yes! the string rotation exist");
	}
	else {
		System.out.println("no! the string not rotation exist");
	}
	
}
}
