package epam.corejava.conditions;

public class Party {
	//3. We are having a party with amounts of tea and candy.
	//Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. 
	//A party is good (1) if both tea and candy are at least 5. 
	//However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
	//However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

	public static void main(String[] args) {
		
		System.out.println(isPartyGood(6,8));
		System.out.println(isPartyGood(3,8));
		System.out.println(isPartyGood(20,6));
		System.out.println(isPartyGood(12,6));
		System.out.println(isPartyGood(11,6));
		System.out.println(isPartyGood(5,5));
	}
	
	public static int isPartyGood(int tea , int candy) {
		if(tea>=5&&candy>=5) {
			if(tea>=(2*candy) || candy>=(2*tea))
				return 2;
			return 1;
		}
			return 0;
	}

}
