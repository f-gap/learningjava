package part4.paymentcard;

import java.util.ArrayList;

public class Mainn {

	public static void main(String[] args) {
		ArrayList<PaymentCard> paymentCards = new ArrayList<>();
		PaymentCard johnCard = new PaymentCard(500,"john");
		PaymentCard milenaCard = new PaymentCard(500,"milena");
		paymentCards.add(johnCard);
		paymentCards.add(milenaCard);
		for(PaymentCard cards : paymentCards) {
			System.out.println(cards);
		}
	}

}
