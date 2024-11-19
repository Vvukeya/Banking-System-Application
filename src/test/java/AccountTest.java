/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.bankingsystemapplication.Account;
import com.mycompany.bankingsystemapplication.CheckingAccount;
import com.mycompany.bankingsystemapplication.SavingsAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class AccountTest {
    
    public AccountTest() {
    }

    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
     @Test
    public void testDeposit() {
        Account account = new SavingsAccount("13159017768", 1000, 0.05);
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        Account account = new CheckingAccount("2047099974", 500, 1000);
        account.withdraw(200);
        assertEquals(300, account.getBalance(), 0.01);
    }

}
