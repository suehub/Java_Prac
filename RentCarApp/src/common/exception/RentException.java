package common.exception;

import java.util.Calendar;

public class RentException extends Exception {
    public RentException() {}

    public RentException(String message) {
        super(message);
    }

    public String getRentExceptionInfo() {
        String errMsg = "예외 발생 시간: " + showTime() + "예외 내용: " + super.getMessage();
        return errMsg;
    }

    // 예외 발생 시각 정보 제공 메서드
    public static String showTime() {
        String date = null;
        String time = null;
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        date = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;

        return date + " " + time;
    }
}
