import java.util.*;
public class Get{
	String code;
	public Get(String n){

		code = n;

	}
	public int[] check(String s){
		int spotOn = 0;
		int in = 0;
                int[] result = new int[2];
		String guess = s;
		int g = guess.length();
		for(int i = 0; i < g; i++){
			if(code.charAt(i) == guess.charAt(i)){
				spotOn++;
			} 
			else if(code.contains((guess.subSequence(i,(i+1))))) {
				in++;
			}
			
		}
                result[0]=spotOn;
                result[1]=in;
		return result;
	}

}
