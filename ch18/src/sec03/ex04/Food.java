package sec03.ex04;

public class Food {
    private static String[] menuKorean = {"돈까스", "오므라이스", "된장찌개", "육개장"};
    private static String[] menuChina = {"짜장면", "짬뽕", "볶음밥", "탕수육"};
    String foodName;
    boolean isOrderReceived = false;
    static int choice = 0;  // 한식 중식 선택

    // 주문 받는 메서드
    public void receiveOrder(Thread th) {
        synchronized (this) {
            String threadName = th.getName();
            if(isOrderReceived == false) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(threadName + " 가 손님에게 주문을 받습니다.");
                }

                choice = (int) (Math.random() * 2);
                if(choice == 0) {
                    int menuNum = (int) (Math.random() * 3);
                    foodName = menuKorean[menuNum];     // 메뉴에서 주문한 음식 이름 저장
                } else {
                    int menuNum = (int) (Math.random() * 3);
                    foodName = menuChina[menuNum];  // 메뉴에서 주문한 음식 이름 저장
                }
                System.out.println(threadName + "가 " + foodName + " 주문을 주방에 전달");
                isOrderReceived = true;
            }

            notifyAll();  // 모든 스레드를 실행 상태로 만듦
            try { wait(); } catch (InterruptedException e) { }  // 실행 중인 자신은 정지 상태로 이동함
        }

    }

    // 음식을 만드는 메서드
    public void makeFood(Thread th) {
        synchronized (this) {
            String threadName = th.getName();
            if (choice == 0) {
                if (threadName.equals("한식 주방장")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(threadName + "이 " + foodName + "를 만듦");
                    }
                    System.out.println(threadName + "이 " + foodName + "를 다 만듦\n");
                    isOrderReceived = false;
                }
            } else if (choice == 1) {
                if (threadName.equals("중식 주방장")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(threadName + "이 " + foodName + "를 만듦");
                    }
                    System.out.println(threadName + "이 " + foodName + "를 다 만듦\n");
                    isOrderReceived = false;
                }
            }

            notifyAll();
            try { wait(); } catch (InterruptedException e) { }

        }

    }
}
