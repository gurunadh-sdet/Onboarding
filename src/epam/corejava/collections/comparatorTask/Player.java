package epam.corejava.collections.comparatorTask;

public class Player {
	private String name;
	private int score;
	
	
	
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int age) {
		this.score = score;
	}
	
	

}
