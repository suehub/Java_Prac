package common;

import java.util.Calendar;

public abstract class AbstractBase {
    // 하위 클래스의 결과값을 출력하는 메서드
//    public void displayData(String data) {
//        System.out.println("조회한 데이터는 " + data + "입니다.");
//    }

    // 조회한 데이터의 시간 정보를 제공하는 메서드
//    public String showTime() {
//        String date = null;
//        String time = null;
//
//        Calendar cal = Calendar.getInstance(); // Calendar 인스턴스 얻음
//        int hour = cal.get(Calendar.HOUR);
//        int minute = cal.get(Calendar.MINUTE);
//        int second = cal.get(Calendar.SECOND);
//
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH) + 1;
//        int day = cal.get(Calendar.DATE);
//
//        date = year + "-" + month + "-" + day;
//        time = hour + ":" + minute + ":" + second;
//
//        return date + " " + time;
//
//
//    }

    public abstract void displayData(String data);
    public abstract String showTime();
}