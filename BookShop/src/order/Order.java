package order;

public class Order {
    int orderNum;
    int bookNum;
    String orderID;
    int orderCount;
    String orderDate;

    public Order() {}

    public Order(int orderNum, int bookNum, String orderID, int orderCount, String orderDate) {
        this.orderNum = orderNum;
        this.bookNum = bookNum;
        this.orderID = orderID;
        this.orderCount = orderCount;
        this.orderDate = orderDate;
    }

    // 주문 정보 조회
    public String printOrderInfo() {
        return "";
    }

    // 주문 정보 등록
    public void createOrder () {

    }

    // 주문 정보 수정
    public void updateOrder() {

    }

    // 주문 정보 삭제
    public void deleteOrder() {

    }
}
