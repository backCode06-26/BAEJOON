import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] current = in.readLine().split(":");
        String[] target = in.readLine().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinuter = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinuter = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        int currentSecondAmount = currentHour * 3600 + currentMinuter * 60 + currentSecond;
        int targetSecondAmount = targetHour * 3600 + targetMinuter * 60 + targetSecond;

        int needSecondAmount = targetSecondAmount - currentSecondAmount;
        if (needSecondAmount <= 0) needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = needSecondAmount % 3600 / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}

