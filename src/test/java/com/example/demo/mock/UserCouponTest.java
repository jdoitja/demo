package com.example.demo.mock;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserCouponTest {

    @Test
    public void testUserCoupon() {
        User user = new User("area00", "pw");
        assertEquals(0, user.countTotalCoupon()); // 쿠폰수령전

        ICoupon coupon = Mockito.mock(ICoupon.class);
        BDDMockito.given(coupon.isValid())
                .willReturn(true);        // isValid() 호출시 리턴값은 true

        user.addCoupon(coupon);
        assertEquals(1, user.countTotalCoupon());
    }

    @Test
    public void testUserCouponWithMock() {

        User user = new User("area00");
        assertThat(user.countTotalCoupon()).isEqualTo(0);

        ICoupon coupon = Mockito.mock(ICoupon.class);
        Mockito.when(coupon.isValid()).thenReturn(true);



        user.addCoupon(coupon);

        assertThat(user.countTotalCoupon()).isEqualTo(1);
    }
}
