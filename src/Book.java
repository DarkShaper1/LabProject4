import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {
    private int actReturnDay, actReturnMonth;
    private String bookName, authorName;
    private LocalDate returnDate;
    private boolean isExpired;

    public Book(){
        this.actReturnDay = this.actReturnMonth = 0;
        this.bookName = this.authorName = "";
        this.returnDate = LocalDate.of(1960, 1, 1);
        this.isExpired = false;
    }

    public Book(int actReturnDay, int actReturnMonth, String bookName, String authorName, LocalDate returnDate){
        this.bookName = bookName;
        this.authorName = authorName;
        this.actReturnDay = actReturnDay;
        this.actReturnMonth = actReturnMonth;
        this.returnDate = returnDate;
    }

    public Book(Book clone){
        this.bookName = clone.bookName;
        this.authorName = clone.authorName;
        this.actReturnDay = clone.actReturnDay;
        this.actReturnMonth = clone.actReturnMonth;
        this.returnDate = clone.returnDate;
    }

    boolean getIsExpired(){
        LocalDate actReturnDate = LocalDate.of(2022, this.actReturnMonth, this.actReturnDay);
        return !returnDate.isAfter(actReturnDate);
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public int getActReturnDay(){
        return actReturnDay;
    }

    public int getActReturnMonth(){
        return actReturnMonth;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public void setActReturnDay(int actReturnDay){
        this.actReturnDay = actReturnDay;
    }

    public void setActReturnMonth(int actReturnMonth){
        this.actReturnMonth = actReturnMonth;
    }

    public void setReturnDate(int day, int month){
        this.returnDate = LocalDate.of(2022, month, day);
    }

    long getDays(){
        LocalDate actReturnDate = LocalDate.of(2022, this.actReturnMonth, this.actReturnDay);
        return returnDate.until(actReturnDate, ChronoUnit.DAYS);
    }

}
