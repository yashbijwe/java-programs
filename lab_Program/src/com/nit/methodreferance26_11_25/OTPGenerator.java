package com.nit.methodreferance26_11_25;


import java.util.function.Supplier;


class OTP{
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
}
    public class OTPGenerator {
    public static void main(String[] args) {
        Supplier<Integer> otpSupplier = OTP::generateOTP;
        int otp = otpSupplier.get();
        System.out.println("Generated OTP: " + otp);
    }
}

