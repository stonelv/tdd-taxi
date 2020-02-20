package com.jiker.keju;

import org.junit.Test;

public class TaxiCalculatorTest {
    @Test
    public void should_return_6_within_2_kilo() {
        TaxiCalculater taxiCalculater = new TaxiCalculater();
        assert taxiCalculater.showPrice(2, 0) == 6;
        assert taxiCalculater.showPrice(1, 0) == 6;
        assert taxiCalculater.showPrice(1, 3) == 7;
        assert taxiCalculater.showPrice(1, 5) == 7;
    }

    @Test
    public void should_return_6_plus_kilo_price_between_2_and_8_kilo() {
        TaxiCalculater taxiCalculater = new TaxiCalculater();
        assert taxiCalculater.showPrice(3,0) == 7;
        assert taxiCalculater.showPrice(8, 5) == 12;
    }

    @Test
    public void should_return_result_with_long_way_price_more_than_8_kilo() {
        TaxiCalculater taxiCalculater = new TaxiCalculater();
        assert taxiCalculater.showPrice(9,0) == 12;
        assert taxiCalculater.showPrice(20, 3) == 26;
    }
}