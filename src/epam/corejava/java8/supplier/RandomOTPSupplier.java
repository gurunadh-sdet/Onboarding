package epam.corejava.java8.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomOTPSupplier {
// 2. Write a supplier to produce a random OTP. 
	private static final String DIGITS = "0123456789";
    private static final int OTP_LENGTH = 6;
    private static final Random random = new Random();

    public static Supplier<String> generateOTP() {
        return () -> {
            StringBuilder otp = new StringBuilder(OTP_LENGTH);
            for (int i = 0; i < OTP_LENGTH; i++) {
                otp.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
            }
            return otp.toString();
        };
    }
	public static void main(String[] args) {
		// Example of using the OTP generator supplier
        Supplier<String> otpSupplier = generateOTP();

        // Generate and print a random OTP
        String randomOTP = otpSupplier.get();
        System.out.println("Random OTP: " + randomOTP);
		
	}

}
