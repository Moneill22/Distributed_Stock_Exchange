package src;
import java.io.*;
import java.net.*;
import java.util.*;

import src.Objects.Trader;
import src.Objects.Transaction;

class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 9822)) {

			Trader trader = new Trader(10000);

			System.out.println("Hello trader!");
			System.out.println("");
			System.out.println("A breakdown of your account is as follows");
			System.out.println("Balance: "+trader.balance);
			trader.holdingsOverview();

			System.out.println("Please input the details of your trade separated by commas.");
			System.out.println("The order of these inputs should be ticker, number of shares, price, and transaction type.");
			System.out.println("Buy transactions are denoted as 0, and sells are denoted as 1");
			System.out.println("EX: ABC,5,225.85,1");
			System.out.println("");

            //Read next trade from user
            String line = sc.nextLine();			

            OutputStream outputStream = socket.getOutputStream();

        	ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

			objectOutputStream.writeObject(new Transaction(trader, line));



        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    	sc.close();
    }
}
