package src.Objects;
import java.util.UUID;

public class Stock {

	//Ticker identifies the company or fund the stock represents
	public String ticker;

	//The uuid is a unique identifier to help monitor double-spending
	public UUID uuid;

	public Stock(String tick){
		ticker = tick;
		uuid = UUID.randomUUID();
	}
	
}