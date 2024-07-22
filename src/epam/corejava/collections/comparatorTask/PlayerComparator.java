package epam.corejava.collections.comparatorTask;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		//if scores are equal then sort player names in ascending order
		if(o1.getScore()==o2.getScore()) {
			return o1.getName().compareTo(o2.getName());	
		}
		//return the player scores in descending order
		return o2.getScore()>o1.getScore()?1:-1;
	}



}
