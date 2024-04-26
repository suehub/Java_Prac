package sec04.ex03;

import java.util.ArrayList;
import java.util.List;

public class ProductGenericTest {
    public static void getProdInfo(List<Product> pList) {   // Product 객체만 저장된 ArrayList만 매개값으로 받을 수 있음
        Product prod = null;
        String code = null;
        String name = null;
        String color = null;
        int qty = 0;

        System.out.println("제품 정보 출력");
        System.out.println("------------------------");
        for (int i=0; i<pList.size(); i++) {
            prod = pList.get(i);
            code = prod.getCode();
            name = prod.getName();
            color = prod.getColor();
            qty = prod.getQty();

            System.out.println("제품 번호 = " + code);
            System.out.println("제품 이름 = " + name);
            System.out.println("제품 색상 = " + color);
            System.out.println("제품 수량 = " + qty);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Product> pList = new ArrayList<Product>();     // Product로 제네틱 타입 선언
        Product p1 = new Product();
        Product p2 = new Product("0002", "스마트 TV", "흰색", 200);
        Product p3 = new Product("0003", "노트북", "은색", 100);

        // Product 객체만 저장 가능
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        getProdInfo(pList);

        List<String> sList = new ArrayList<String>();
        sList.add("홍길동");
        sList.add("차범근");
        sList.add("박지성");
    }
}
