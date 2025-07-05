import java.util.Arrays;
import java.util.Random;

public class AQITracking {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();

        // i) Generate 30 random AQI readings between 1 and 300
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // Random value between 1 and 300
        }

        // Display the AQI readings
        System.out.println("AQI Readings for 30 Days: " + Arrays.toString(aqiReadings));

        // ii) Compute and display the median AQI value
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length / 2 - 1] + aqiReadings[aqiReadings.length / 2]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }
        System.out.println("Median AQI Value: " + median);

        // iii) Identify and count the number of “hazardous” days (AQI > 200)
        int hazardousDaysCount = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDaysCount++;
            }
        }
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDaysCount);
    }
}import java.util.Arrays;
import java.util.Random;

public class AQITracking {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();

        // i) Generate 30 random AQI readings between 1 and 300
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // Random value between 1 and 300
        }

        // Display the AQI readings
        System.out.println("AQI Readings for 30 Days: " + Arrays.toString(aqiReadings));

        // ii) Compute and display the median AQI value
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[aqiReadings.length / 2 - 1] + aqiReadings[aqiReadings.length / 2]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }
        System.out.println("Median AQI Value: " + median);

        // iii) Identify and count the number of “hazardous” days (AQI > 200)
        int hazardousDaysCount = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDaysCount++;
            }
        }
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDaysCount);
    }
}
