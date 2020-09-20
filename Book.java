/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Bill Crosbie
 * @modified by Catherine Oldfield
 * @for RVCC GDEV242 - Fall 2020
 * @version 09/20/2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    // the pages field satisfies exercise 2.85
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        // the pages field satisfies exercise 2.85
        pages = bookPages;
    }

        /**
     * Provide access to the string holding the author's name
     * @return author
     * 
     * This satisfies exercise 2.83
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Provide access to the string holding the book's title
     * @return title
     * 
     * This satisfies exercise 2.83
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Provide access to the int holding the book's number of pages
     * @return pages
     * 
     * This satisfies exercise 2.85
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Print the string holding the book's author to the terminal window
     * 
     * This satisfies exercise 2.84
     */
    public void printAuthor()
    {
        System.out.println("The book's author is: " + author);
    }
    
    /**
     * Print the string holding the book's author to the terminal window
     * 
     * This satisfies exercise 2.84
     */
    public void printTitle()
    {
        System.out.println("The book's title is: " + title);
    }
    
}
