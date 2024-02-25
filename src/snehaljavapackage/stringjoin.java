package snehaljavapackage;

public class stringjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1;
		
		String[] arr = {"asd","ab","efg"};
		
		str1 = String.join( ":",arr);
		
		System.out.println(str1);
		
		String str2 =" hi I am rani ";
		
		System.out.println(str2.replace("rani", "raja"));
		
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
        System.out.println(str1.equals(str2));
	
        System.out.println(str2.length());
        
        str2 =str2.trim();
        
        System.out.println(str2.length());
	
	
	}

}
