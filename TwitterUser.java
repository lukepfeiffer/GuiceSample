package social;

import java.util.LinkedList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterUser implements SocialMediaUserInterface {
	private String username;
	
	public TwitterUser( String username ) {
		this.username = username;
	}
	
	public LinkedList<String> getPosts(){
		return new LinkedList<String>();
	}
	
	public LinkedList<String> getPosts( int numPosts ){
		return new LinkedList<String>();
	}
	
	public int numberLikes() {
		return 0;
	}
	public int numberComments() {
		return 0;
	}
	
	public int totalInteractions() {
		return 0;
	}
	
	
	//Simple username getter
	public String getUsername() {
		return username;
	}
	
	
	//Simple username setter
	public void setUsername( String newName ) {
		username = newName;
	}
}
