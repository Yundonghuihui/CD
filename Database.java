package dome;

import java.util.ArrayList;

public class Database {
	
 	private ArrayList<Item> listItem = new ArrayList<Item>();
	public void add(Item cd) {
		listItem.add(cd);
	}
	public void list() {
		for(Item cd : listItem) {
			Item.print();
		}
	}   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc", "bbb",4,60,"...." ));
		db.add(new CD("abc",  "cccc",3,60,">>>>"));
		db.add(new DVD("abc", "bbb",4,60,"...." ));
		db.add(new DVD("abc",  "bbbb",3,60,">>>>"));
		
		db.list();
      
	}

}
