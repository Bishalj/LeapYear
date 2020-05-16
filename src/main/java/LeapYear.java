import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    private final static LeapYearServiceImpl leapYearServiceImpl = new LeapYearServiceImpl();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println(leapYearServiceImpl.isLeapYear(year));
    }
}
