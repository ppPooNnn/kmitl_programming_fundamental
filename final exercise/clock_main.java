public class clock_main {
    public static void main(String[] args) {
        Clock time1 = new Clock(3, 0, 0);
        time1.ticks();
        System.out.println(time1);
        Clock2 time2 = new Clock2(3, 0, 0, "AM");
        time2.ticks();
        System.out.println(time2);
    }
}
