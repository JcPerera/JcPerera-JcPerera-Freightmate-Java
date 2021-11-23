package com.keyGen;

public class KeyGen {
    //generate an industry wide unique ID
    public String generateKey(CarrierAccount account) {
        String prefix = getPrefix(account.getCarrierName());
        int newIndex = account.getLastUsedIndex() + 1;
        String connoteNo = calcConnoteNo(newIndex, account.getRangeStart(), account.getRangeEnd(), account.getDigits());
        int checkSum = createCheckSum(connoteNo, account.getDigits());
        return prefix.concat(account.getAccountNumber()).concat(connoteNo).concat(String.valueOf(checkSum));
    }

    //get A Carrier prefix
    private String getPrefix(String name) {
        if (name.equals("FreightmateCourierCo")) {
            return "FMCC";
        } else {
            // or throw an Exception
            return "ABCD";
        }
    }

    //calculate connote number by concatenating prefix with new index
    private String calcConnoteNo(int newNo, int startNo, int endNo, int digit) {
        if (checkNoWithinRange(newNo, startNo, endNo)) {
            return concatDigitsToIndex(newNo, digit);
        } else {
            return "";
            // or throw an exception
        }
    }

    //check if the new index is within the given range
    private boolean checkNoWithinRange(int newNo, int startNo, int endNo) {
        return newNo >= startNo && newNo <= endNo;
    }

    //create the prefix for the connote number
    private String concatDigitsToIndex(int newNo, int digit) {
        String index = String.valueOf(newNo);
        int remainingDigits = digit - index.length();
        String prefix = "0".repeat(remainingDigits);
        return prefix.concat(index);
    }

    //create the checksum no
    private int createCheckSum(String no, int digit) {
        int firstNo = getSecondNo(no, digit, 1);
        firstNo = firstNo * 3;
        int secondNo = getSecondNo(no, digit, 2);
        secondNo = secondNo * 7;
        int total = firstNo + secondNo;
        int multiplier = getTheNextMultiplier(firstNo + secondNo);
        return multiplier - total;
    }

    //get the sum by Adding every second number from a given starting point
    private int getSecondNo(String no, int digit, int startPoint) {
        int sum = 0;
        for (int i = digit - startPoint; i > 0; i = i - 2) {
            sum = sum + Integer.parseInt(String.valueOf(no.charAt(i)));
        }
        return sum;
    }

    //get the next multiple of 10
    private int getTheNextMultiplier(int no) {
        int size = String.valueOf(no).length();
        return (int) Math.pow(10, size);
    }


}
