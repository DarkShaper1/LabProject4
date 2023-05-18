public class Reader {
    private String readerName;
    private Book takenBook;
    private final boolean didDelayed;

    public Reader(){
        readerName = "";
        takenBook = null;
        didDelayed = false;
    }

    public Reader(String customerName, Book takenBook){
        this.readerName = customerName;
        this.takenBook = takenBook;
        this.didDelayed = takenBook != null && takenBook.getIsExpired();
    }

    public Reader(Reader clone){
        this.readerName = clone.readerName;
        this.takenBook = clone.takenBook;
        this.didDelayed = clone.didDelayed;
    }

    public void setReaderName(String nextLine){
        this.readerName = (nextLine != null) ? nextLine : "nullCustomer";
    }

    public void setTakenBook(Book takenBook){
        this.takenBook = takenBook;
    }

    public boolean getDidDelayed(){
        return didDelayed;
    }

    public String getReaderName(){
        return this.readerName;
    }

    public Book getTakenBook(){
        return this.takenBook;
    }

    public String getStatus(){
        return (this.didDelayed) ? "Книга '" + this.getTakenBook().getBookName() + "',которую взял " + this.getReaderName() + ", просрочена на " + this.getTakenBook().getDays() + " дней" : "Книга '" + this.getTakenBook().getBookName() + "',которую взял " + this.getReaderName() + ", cдана вовремя";
    }

}
