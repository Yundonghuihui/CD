package dome;

public class DVD extends Item{
	
	private int numofTracks;
	
	private boolean gotIt;
	
	public DVD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, artist, playingTime, comment);
		
		
		this.numofTracks = numofTracks;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

}
