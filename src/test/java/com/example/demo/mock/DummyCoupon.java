package com.example.demo.mock;

public class DummyCoupon implements ICoupon {
    private String name;
    private int discountPercent;
    private boolean valid;

    public DummyCoupon(String name, int discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
        this.valid = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public int getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public boolean isApplicable(Item item) {
        // 예: 모든 아이템에 적용 가능
        return valid;
    }

    @Override
    public void doExpire() {
        this.valid = false;
    }
}
