
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
    // the courseText field satisfies exercise 2.92
    private boolean courseText;
    // the refNumber field satisfies exercise 2.88
    private String refNumber;
    // the borrowed field satisfies exercise 2.91
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, 
    boolean usedForCourse)
    {
        author = bookAuthor;
        title = bookTitle;
        // the pages field satisfies exercise 2.85
        pages = bookPages;
        // the courseText field satisfies exercise 2.92
        courseText = usedForCourse;
        // the refNumber field satisfies exercise 2.88
        refNumber = "";
        // the borrowed field satisfies exercise 2.91
        borrowed = 0;
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
     * Provide access to the int holding the book's number of times borrowed
     * @return borrowed
     * 
     * This satisfies exercise 2.91
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Provide access to the boolean holding the book's status
     * true = yes, this book is a course text book
     * false = no, this book is not used as a course text book
     * @return courseText
     * 
     * This satisfies exercise 2.92
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Set the refNumber variable to hold the inputted value
     * @input ref
     * 
     * This satisfies exercise 2.88 and 2.90
     */
    public void setRefNumber(String ref)
    {
        // the following line satisfied exercise 2.88
        // refNumber = ref;
        
        // the below lines modify the above to satisfy exercise 2.90
        if (ref.length() < 3) //is input ref too short?
        {
            System.out.println("Error! Reference number must be at " +
            "least 3 characters!");
        }
        
        else // input ref is okay; assign to refNumber variable
        {
            refNumber = ref;
        }
    }
    
    /**
     * This method mimics a patron borrowing the book from the library
     * 
     * This satisfies exercise 2.91
     */
    
    public void borrow()
    {
        borrowed ++;
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
     * This satisfies exercise 2.87, 2.89, and 2.91
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
        
        // the following line satisfies exercise 2.91
        System.out.println("This book has been borrowed " + 
        borrowed + " times.");
    }
}
