package GenericLibrary;

import java.util.Random;

/**
 * this class contains all java specific generic methods
 * @author Dell
 *
 */
public class JavaLibrary {
/**
 * for generate random number
 * @return
 */
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}
}
