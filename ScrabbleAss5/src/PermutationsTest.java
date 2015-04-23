import java.util.HashSet;
import java.util.Set;


public class PermutationsTest {

	public static void main(String[] args) {
		System.out.println(generatePerm("hello"));
		System.out.println(generatePerm("ello"));
		System.out.println(generatePerm("hllo"));
		System.out.println(generatePerm("helo"));
		System.out.println(generatePerm("helo"));
		System.out.println(generatePerm("hell"));
		System.out.println(generatePerm("ell"));
		

	}
	
	
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);

	        Set<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}

}
