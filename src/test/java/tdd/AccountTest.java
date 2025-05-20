package tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/** 1.계좌생성
 *  2.잔액조회
 *  3.입출금 가능
 */
public class AccountTest {
    //질문 - 응답 - 정제

    @Test
    public void testCreateAccount(){
        Account account = new Account(100000); //계좌 생성
        assertNotNull(account); // 질문

    }

    @Test
    public void testGetBalance() throws Exception {
        // 1.계좌생성(초기 금액 입금) 2.잔액 조회
        Account account = new Account(100000);
        assertEquals(100000, account.getBalance());

        account = new Account(50000);
        assertEquals(50000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit(){
        // 1.계좌생성 (초기금액 입금) 2.입금  3.잔액조회
        Account account = new Account(10000);
        account.deposit(50000);

        assertEquals(60000, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        //1.계좌생성 (초기금액 입금) 2.출금 3.잔액조회
        Account account = new Account(10000);
        account.withdraw(5000);
        assertEquals(5000, account.getBalance());

        assertThrowsExactly(RuntimeException.class, () -> account.withdraw(10000));

    }
}
