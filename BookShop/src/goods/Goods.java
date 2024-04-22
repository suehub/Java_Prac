package goods;

public class Goods {
    int bookNum;
    String bookName;
    String author;
    int price;
    String publishDate;
    String publisher;

    public Goods () {}

    public Goods(int bookNum, String bookName, String author, int price, String publishDate, String publisher) {
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publishDate = publishDate;
        this.publisher = publisher;
    }

    // 도서 정보 조회
    public String printBookInfo() {
        return "";
    }

    // 도서 정보 등록
    public void createBook() {

    }

    // 도서 정보 수정
    public void updateBook() {

    }

    // 도서 정보 삭제
    public void deleteBook() {

    }

}
