import java.util.Arrays;


public class AscendDescend {

	public static void main(String[] args) {

		String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra",
		"Herman"};
		Arrays.sort(ss);
		
		System.out.println("Ascending:");
		for(int i = 0; i < ss.length; i++){
			System.out.println(ss[i]);
		}
		System.out.println("\nDescending:");
		for(int j = ss.length - 1; j >= 0; j--){
			System.out.println(ss[j]);
		}

	}

}
