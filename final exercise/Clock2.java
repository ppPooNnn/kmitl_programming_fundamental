public class Clock2 {
    int hour;
    int minute;
    int second;
    String meridiem = "AM";

    public Clock2(int hour, int minute, int second, String meridiem) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = meridiem;
    }
    
    @Override
    public String toString() {
        return "Clock2 [hour=" + hour + ", minute=" + minute + ", second=" + second + ", meridiem=" + meridiem + "]";
    }

    void ticks()
    {
        second += 1;
        if(second == 60)
        {
            second = 0;
            minute += 1;
            if(minute == 60)
            {
                minute = 0;
                hour += 1;
                if(hour == 11)
                {
                    hour = 12;
                    if(meridiem.equals("AM"))
                        meridiem = "PM";
                    else
                        meridiem = "AM";
                }
                if(hour == 12)
                    hour = 1;
            }
        }
    }
}
