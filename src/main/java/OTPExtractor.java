//19. Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPExtractor {
    public static void main(String[] args) {
        String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";

        String otp = extractOTP(sms);

        System.out.println("Extracted OTP: " + otp);
    }

    public static String extractOTP(String sms) {
        String otp = "";

        // Define the OTP pattern
        String pattern = "\\b\\d{6}\\b";

        // Create a Pattern object
        Pattern otpPattern = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = otpPattern.matcher(sms);

        // Find the first match
        if (matcher.find()) {
            otp = matcher.group();
        }

        return otp;
    }
}