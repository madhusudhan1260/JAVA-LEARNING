public class TrafficLight {
    public static void main(String[] args) {
        String light = "Red";

        while (true) {
            if (light.equals("Red")) {
                System.out.println("Red Light! Stop for 30 seconds.");
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                light = "Green";
            } 
            else if (light.equals("Green")) {
                System.out.println("Green Light! Go for 60 seconds.");
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                light = "Yellow";
            } 
            else if (light.equals("Yellow")) {
                System.out.println("Yellow Light! Slow down for 10 seconds.");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                light = "Green";
            }
        }
    }
}