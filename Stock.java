import java.util.UUID;

public class Stock {

	String ticker;
	UUID uuid;

	public Stock(String tick){
		ticker = tick;
		uuid = UUID.randomUUID();
	}
	
}