package com.keyGen;

public class Main {

    public static void main(String[] args) {
        CarrierAccount acc = new CarrierAccount(
                "FreightmateCourierCo",
                "ABC123",
                10,
                19604,
                19000,
                20000
        );
        KeyGen keyGen = new KeyGen();
        System.out.println(keyGen.generateKey(acc));
    }
}
