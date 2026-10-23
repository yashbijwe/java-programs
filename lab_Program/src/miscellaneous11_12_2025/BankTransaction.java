package miscellaneous11_12_2025;

import java.util.HashMap;
import java.util.Map;

public class BankTransaction {

	public static void main(String[] args) {

		Map<String, String> responses = new HashMap<>();
		responses.put("TXN_001", "Insufficient Funds");
		responses.put("TXN_002", "Incorrect credentials");
		responses.put("INV_TXN", "Invalid transaction");

		String serverResponse = "TXN_005";

		System.out.println("User performed some transaction, and the transaction "
				+ "is failed then, got a server response: " + serverResponse);

		System.out.println(
				"Reason for transaction failure: " +
		            responses.getOrDefault(serverResponse, "Invalid Transaction"));
	}
}