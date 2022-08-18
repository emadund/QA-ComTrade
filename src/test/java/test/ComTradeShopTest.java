package test;

import base.BaseComTrade;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.ComTradeShopInput;
import page.ComTradeShopPage;
import page.ComTradeSuccessfull;
import page.KombinovaniFrizideri;

import java.util.Random;

public class ComTradeShopTest extends BaseComTrade {
    private ComTradeShopPage comTradeShopPage;
    private ComTradeShopInput comTradeShopInput;
    private ComTradeSuccessfull comTradeSuccessfull;
    private KombinovaniFrizideri kombinovaniFrizideri;
    Random ran = new Random();
    String ime = "Zvezdina"+ran.nextInt(99999);
    String e_mail = ime+"@gmail.com";


    @Before
    public void setupTest() {
        comTradeShopPage = new ComTradeShopPage();
        comTradeShopInput = new ComTradeShopInput();
        comTradeSuccessfull = new ComTradeSuccessfull();
        kombinovaniFrizideri = new KombinovaniFrizideri();

    }

    @Test

    public void test1 () {
        comTradeShopPage.clickBanner()
                .clickRegister();
        comTradeShopInput.clickcookie()
                .clickPravnoLice()
                .inputFirstName(ime)
                .inputLastName(ime+"ic")
                .inputEmail(e_mail)
                .inputPasswordAndConfirmation()
                .uncheck()
                .send_submit();
        Assert.assertTrue(comTradeSuccessfull.checkDisplay());
        Assert.assertEquals("Hvala na registraciji. Molimo proverite email i aktivirajte Vaš nalog.",comTradeSuccessfull.getMessage());
    }
    @Test

    public void test2() {
        this.test1();
        comTradeSuccessfull.moving();
        kombinovaniFrizideri.scroll();
        Assert.assertTrue(kombinovaniFrizideri.isRataAvailable());
        Assert.assertEquals("1.652 RSD", kombinovaniFrizideri.amount());

    }

}
