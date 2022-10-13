public class Transaction {
	//Transaction object to pass Trader object and order over a socket.

	Trader trader;
	String transaction;

	public Transaction(Trader t, String tx){
		trader = t;
		transaction = tx;
	}

	boolean validTransaction(String tx){
		String[] params = tx.split(",");
		if(params.length != 4){return false;}
		
		for(char c: params[0].toCharArray()){
			if(!Character.isAlphabetic(c)){return false;}
		}

		for(char c: params[1].toCharArray()){
			if(!Character.isDigit(c)){return false;}
		}
		for(char c: params[2].toCharArray()){
			if(!Character.isDigit(c)){return false;}
		}
		for(char c: params[3].toCharArray()){
			if(!Character.isDigit(c)){return false;}
		}

		if(!params[3].equals("1") && !params[3].equals("2") ){
			return false;
		}

		return true;
	}
	
}
