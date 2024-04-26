package sec04.ex06;

import sec04.ex03.Product;

import java.sql.Array;
import java.util.*;

public class ProductGenericTest {
    public static void getProdInfo(Map<String, List<Product>> pMap) {   // key는 담당자 이름, value는 제품 정보가 저장된 ArrayList 타입으로 하는 매개변수
        Product prod = null;
        String code = null;
        String name = null;
        String color = null;
        int qty = 0;

        Set<String> employee = pMap.keySet();   // 전달된 Map에서 담당자 이름 Set으로 얻음
        Iterator<String> ite1 = employee.iterator();    // 담당자 이름을 Iterator로 얻음

        System.out.println("제품 정보 출력\n");
        while(ite1.hasNext()) {
            String employeeName = ite1.next();      // Iterator에서 담당자 이름 얻음
            System.out.println("담당자: " + employeeName);
            System.out.println("---------------------------");
            List<Product> pList = pMap.get(employeeName);   // 담당자 이름을 key로 ArrayList에 저장된 제품 정보를 얻음
            for(int i=0; i<pList.size(); i++) {
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

    }

    public static void main(String[] args) {
        Map<String, List<Product>> pMap = new HashMap<String, List<Product>>();
        List<Product> pList1 = new ArrayList<Product>();
        Product p1 = new Product();
        Product p2 = new Product("002", "스마트 TV", "흰색", 200);
        Product p3 = new Product("003", "노트북", "은색", 100);
        pList1.add(p1);
        pList1.add(p2);
        pList1.add(p3);
        pMap.put("이순신", pList1);

        List<Product> pList2 = new ArrayList<Product>();
        pList2.add(new Product());
        pList2.add(new Product("004", "스마트폰", "블랙", 500));
        pList2.add(new Product("005", "OLED TV", "블루", 200));
        pMap.put("홍길동", pList2);

        getProdInfo(pMap);


    }
}
