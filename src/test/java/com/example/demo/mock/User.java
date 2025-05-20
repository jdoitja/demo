package com.example.demo.mock;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private List<ICoupon> coupons;

    public User(String id, String pw) {
        this.id = id;
        this.coupons = new ArrayList<>();
    }

    public User(String id) {
        this.id = id;
        this.coupons = new ArrayList<>();
    }

    public int countTotalCoupon() {
        return coupons.size();
    }

    public void addCoupon(ICoupon coupon) {
        if (coupon.isValid()){
            coupons.add(coupon);
        }
    }
}
