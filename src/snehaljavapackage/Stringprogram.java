package snehaljavapackage;

public class Stringprogram {
	
	public static void main(String[] args) {
		
		String str = "ab;cd;ef;gh";
		
		String[]arrstr = str.split("g");
		
		/*for(int i=0; i<arrstr.length; i++) {
			
			System.out.println(arrstr[i]);
			
		}8*/
		
		for(String ele :arrstr) {
			
			System.out.println(ele);
		}
		
		
	}

}
