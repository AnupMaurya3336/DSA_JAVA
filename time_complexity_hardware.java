package Session12_time_and_space_complexity;

public class time_complexity_hardware {


        // hardware dependency time complexcity ka type hai

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}