
public class Driver 
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
		Book b1 = new Book("Bible", 1000);
		Book b2 = new Book("Harry Potter", 550);
		b1.display_title();
		b1.display_pages();
		b2.display_title();
		b2.display_pages();
	}
	
}
