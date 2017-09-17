package dome;


public class Item {
    private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
	public Item(String title, String artist, int playingTime, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
		this.comment = comment;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("title");
		
	}

}
