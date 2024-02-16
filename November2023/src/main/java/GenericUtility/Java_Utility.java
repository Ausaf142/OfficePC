package GenericUtility;

import java.util.Random;

public class Java_Utility {
public int Random_Number() {
	Random random =new Random();
	int Unique_Number = random.nextInt(100);
	return Unique_Number;
}
}
