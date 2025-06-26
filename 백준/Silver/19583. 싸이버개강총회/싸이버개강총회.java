import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static Map<String, String> attendanceBook = new HashMap<>();
    static String meetingStart;
    static String meetingEnd;
    static String streamingEnd;

    static final int HOUR = 0;
    static final int MINUTE = 1;
    static final String STATUS_IN = "in";
    static final String STATUS_OUT = "out";

    public static int TotalMinute(String time) {
        String[] hourMinute = time.split(":");

        int hour = Integer.parseInt(hourMinute[0]);
        int minute = Integer.parseInt(hourMinute[1]);

        return hour * 60 + minute;
    }

    public static void isBeforeAfter(String currentTime, String user) {
        int endMinute = TotalMinute(meetingEnd);
        int currentMinute = TotalMinute(currentTime);

        if (currentMinute < endMinute) {
            startTimeBefore(currentTime, user);
        } else {
            endTimeAfter(currentTime, user);
        }
    }

    public static void startTimeBefore(String currentTime, String user) {
        int startMinute = TotalMinute(meetingStart);
        int currentMinute = TotalMinute(currentTime);

        if (currentMinute <= startMinute) {
            attendanceBook.put(user, STATUS_IN);
        }
    }

    public static void endTimeAfter(String currentTime, String user) {
        int meetingMinute = TotalMinute(meetingEnd);
        int streamingMinute = TotalMinute(streamingEnd);
        int currentMinute = TotalMinute(currentTime);

        if ((currentMinute >= meetingMinute && currentMinute <= streamingMinute) || (currentMinute == streamingMinute)) {
            if (attendanceBook.containsKey(user) && attendanceBook.get(user).equals(STATUS_IN)) {
                attendanceBook.put(user, STATUS_OUT);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        meetingStart = st.nextToken();
        meetingEnd = st.nextToken();
        streamingEnd = st.nextToken();

        String data;
        while ((data = br.readLine()) != null) {
            if (data.isEmpty()) break;

            st = new StringTokenizer(data);
            String time = st.nextToken();
            String user = st.nextToken();
            isBeforeAfter(time, user);
        }

        int count = 0;
        for (String value : attendanceBook.values()) {
            if (value.equals(STATUS_OUT)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();

    }
}