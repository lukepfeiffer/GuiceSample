package social;
import java.util.LinkedList;

public interface SocialMediaUserInterface {
	/* Returns a LinkedList of all the public posts a user has.
	 * @returns LinkedList<String> allPosts
	 * @params none; Each implementation should have a username string member variable
	 * @author Luke Pfeiffer
	 */
	public LinkedList<String> getPosts();
	
	/* Returns a LinkedList of the numPosts most recent the public posts a user has.
	 * @returns LinkedList<String> allPosts
	 * @params none; Each implementation should have a username string member variable
	 * @author Luke Pfeiffer
	 */
	public LinkedList<String> getPosts( int numPosts );
	
	/*
	 * Returns the total likes on all posts a given user has
	 * @returns an integer of the total likes a user has received
	 * @params none
	 * @author Luke Pfeiffer
	 */
	public int numberLikes();
	
	/*
	 * Returns the total comments on all posts a given user has
	 * @returns an integer of the number of likes
	 * @params none
	 * @author Luke Pfeiffer
	 */
	public int numberComments();
	
	/*
	 * Returns both number of likes and number of comments
	 * @returns number of Likes + number of comments
	 * @params none
	 * @author Luke Pfeiffer
	 */
	public int totalInteractions();
}