import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Trader {

	//Balance of currency trader has available to buy stock
	double balance;

	//Map of stock holdings a trader, groups together by stock ticker.
	HashMap<String, List<Stock>> holdings = new HashMap<>();

	public Trader(double bal){
		balance = bal;

		//For testing, traders will begin with random amounts of unique stocks.
		//Stocks are created here and saved in the traders holdings map.

		List<Stock> abc = new ArrayList<>();
		int count1 = ThreadLocalRandom.current().nextInt(0,20);

		for(int i = 0; i < count1;i++){
			abc.add(new Stock("ABC"));
		}

		holdings.put("ABC",abc);

		List<Stock> def = new ArrayList<>();
		int count2 = ThreadLocalRandom.current().nextInt(0,20);

		for(int i = 0; i < count2;i++){
			def.add(new Stock("DEF"));
		}

		holdings.put("DEF",def);

		List<Stock> xyz = new ArrayList<>();
		int count3 = ThreadLocalRandom.current().nextInt(0,20);

		for(int i = 0; i < count3;i++){
			xyz.add(new Stock("XYZ"));
		}

		holdings.put("XYZ",xyz);


	}

	
}
