import java.util.Arrays;


public class PermutationsTest {
	public static void main(String[] args){
	    Permutations<Integer> perm = new Permutations<Integer>(new Integer[]{3,3,4,4,4});
	    int count = 0;
	    String[] arrayOfPerms = new String[40];
	    while(perm.hasNext()){
	       // System.out.println(Arrays.toString(perm.next()));
	        arrayOfPerms[count] = Arrays.toString(perm.next());
	        count++;
	    }
	    
	   for(int i=0;i<count;i++){
		   int intVersion = (int) arrayOfPerms[i].charAt(1);
		   char charVersion = (char)intVersion;
		   System.out.println(charVersion);
	   }
	}
}
