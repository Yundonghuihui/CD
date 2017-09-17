package dome;

public class MP3 extends Item {
	
	private int numofTracks;
	
	
	public MP3(String title, String artist, int playingTime, String comment) {
		
		super(title, artist, playingTime, comment);
		
		this.numofTracks=numofTracks;
		
	}

	@Override
	public void print() {
		System.out.println("Mp3:");
		super.print();
		System.out.println(":"+ numofTracks);
	}
}
