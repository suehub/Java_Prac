package main;

import goods.Goods;
import member.Member;
import order.Order;

public class BookShopApp {
    public static void main(String[] args) {
        Member m = new Member("sue", "1234", "이연수", "경기 고양시", "010-1234-5678");
        Goods g = new Goods(1, "아몬드", "손원평", 15000, "2018-03-18", "창비");
        Order o = new Order(1, 1, "001", 1, "2024-04-19");

        String userInfo = m.printUserInfo();
        System.out.println(userInfo);

        g.printBookInfo();
        o.createOrder();
    }
}
