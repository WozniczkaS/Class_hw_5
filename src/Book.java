
public class Book 
{
	String title;
	int pages;
	
	public Book(String title, int pages)
	{
		this.pages = pages;
		this.title = title;
	}
	
	void display_title()
	{
		System.out.println("This book is called: " + this.title);
	}
	
	void display_pages()
	{
		System.out.println("This book has " + this.pages + " pages.");
	}
	
	
}
