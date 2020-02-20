package com.jiker.keju;

public class TaxiCalculater {
    
    public long showPrice(int kilo, int minute) {
        double price =  getPriceWithin2Kilo()
                + getPriceBetween2And8Kilo(kilo - 2)
                + getPriceMoreThan8Kilo(kilo - 8)
                + getWaitingTimePrice(minute);
        return Math.round(price);
    }

    private double getWaitingTimePrice(int minute) {
        return minute * 0.25;
    }

    private int getPriceWithin2Kilo() {
        return 6;
    }

    private double getPriceMoreThan8Kilo(int kilo) {
        return kilo > 0 ? kilo * 1.2 : 0.0;
    }

    private double getPriceBetween2And8Kilo(int kilo) {
        kilo = kilo > 6 ? 6 : kilo;
        return kilo <= 0 ? 0.0 : kilo * 0.8;
    }
}
