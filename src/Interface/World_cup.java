package Interface;

public class World_cup implements India , Pakistan {

	@Override
	public void team2() {
		System.out.println("Team India");
		// TODO Auto-generated method stub
		
	}
	
		
	@Override
	public void team1() {
		System.out.println("Team Pakistan");
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	World_cup team = new World_cup();
	team.team1();
	team.team2();
	
}
}

			
	
