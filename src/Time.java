public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(){
        this (0, 0, 0);
    }

    private Time (int h, int m){
        this(h, m, 0);
    }

    private Time(int h, int m, int s){
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    private void setHour(int h){
        hour = ((h>=0 && h<24) ? h : 0);
        // if h is between 0 - 24 set to h, else set to 0
    }

    private void setMinute(int m) {
        minute = ((m>=0 && m<60) ? m : 0);
        // if m is between 0 - 60 set to m, else set to 0
    }

    private void setSecond(int s){
        second = ((s>=0 && s<60) ? s : 0);
        // if s is between 0 - 60 set to s, else set to 0
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        //prints out a digit to 2decimal places, then a :, and repeat
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",(hour==0 || hour == 12) ? 12 : hour % 12,
                                                minute, second, (hour<12 ? "AM" : "PM"));
    }

}
