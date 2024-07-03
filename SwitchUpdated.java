public class SwitchUpdated {
    public static void main(String[] args) {
        String day = "friday";
        String mood = switch (day) {
            case "monday", "tuesday", "wednesday" -> "sad";
            case "thursday" -> "Waiting";
            case "friday", "saturday", "sunday" -> "Happy";
            default -> "Invalid day";
        };
        System.out.println("Today is " + day + " and I am " + mood);
        mood = "";
        // is same as
        mood = switch (day) {
            case "monday", "tuesday", "wednesday":
                yield "sad";
            case "thursday":
                yield "Waiting";
            case "friday", "saturday", "sunday":
                yield "Happy";
            default:
                yield "Invalid day";
        };
        System.out.println("Today is " + day + " and I am " + mood);
    }
}
