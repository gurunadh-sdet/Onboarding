package epam.corejava.collections.comparatorTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparatorSolution {

	public static void main(String[] args) {
		
			System.out.println("Enter the Number of Players: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			List<Player> players = new ArrayList<Player>();	
			
			for(int i=0;i<n;i++) {
				scan.nextLine();
				System.out.println("Please enter player name and score");
				String playerName = scan.next();
				int playerScore = scan.nextInt();
				players.add(new Player(playerName, playerScore));			
			}
			
			Collections.sort(players, new PlayerComparator());
			players.forEach(p->System.out.println(p.toString()));
	}

}
