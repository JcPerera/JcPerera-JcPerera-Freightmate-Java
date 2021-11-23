package com.keyGen;

public class CarrierAccount {
    private String carrierName;
    private String accountNumber;
    private int digits;
    private int lastUsedIndex;
    private int rangeStart;
    private int rangeEnd;

    public CarrierAccount(String carrierName, String accountNumber, int digits, int lastUsedIndex, int rangeStart, int getRangeStart) {
        this.carrierName = carrierName;
        this.accountNumber = accountNumber;
        this.digits = digits;
        this.lastUsedIndex = lastUsedIndex;
        this.rangeStart = rangeStart;
        this.rangeEnd = getRangeStart;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDigits() {
        return digits;
    }

    public void setDigits(int digits) {
        this.digits = digits;
    }

    public int getLastUsedIndex() {
        return lastUsedIndex;
    }

    public void setLastUsedIndex(int lastUsedIndex) {
        this.lastUsedIndex = lastUsedIndex;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }
}
