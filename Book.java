/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Bill Crosbie
 * @modified by Catherine Oldfield
 * @for RVCC GDEV242 - Fall 2020
 * @textbook exercises 2.83 through 2.92, minus 2.86
 * @version 09/20/2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    // the pages field satisfies exercise 2.85
    private int pages;
    // the refNumber field satisfies exercise 2.88
    private String refNumber;

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
        // the refNumber field satisfies exercise 2.88
        refNumber = "";
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
     * Provide access to the string holding the book's reference number
     * @return refNumber
     * 
     * This satisfies exercise 2.88
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Set the refNumber variable to hold the inputted value
     * 
     * This satisfies exercise 2.88
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
    
    /**
     * Print the string holding the book's details to the terminal window
     * 
     * This satisfies exercise 2.87 and 2.89
     */
    public void printDetails()
    {
        // this version satisfies exercise 2.87
        // System.out.println("Title: " + title + "\t" +
        // "Author: " + author + "\t" +
        // "Pages: " + pages);
        
        // this version modified the above to satisfy exercise 2.89
        System.out.print("Title: " + title + "\t" +
        "Author: " + author + "\t" +
        "Pages: " + pages + "\t");
        
        if (refNumber.length() > 0) //has refNumber been given a value?
        {
           System.out.print("Reference Number: " + refNumber + "\n");
        }
        
        else // refNumber is a null string
        {
            System.out.print("Reference Number: " + "ZZZ" + "\n");
        }
    }
}
