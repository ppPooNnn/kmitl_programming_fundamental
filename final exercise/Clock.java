public class Clock {
    int hour;
    int minute;
    int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Clock [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
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
                if(hour == 24)
                    hour = 0;
            }
        }
    }
}
