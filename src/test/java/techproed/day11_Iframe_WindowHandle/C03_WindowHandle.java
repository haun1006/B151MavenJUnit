package techproed.day11_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import techproed.utilities.TestBase;

public class C03_WindowHandle extends TestBase {
    @Test
    public void windowHandle() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();


        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(3);

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().
                newWindow(WindowType.WINDOW);//-- Yeni bir pencereye driver i taşır.
                //WindowType.TAB --> Yeni bir sekme açar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();
        bekle(3);


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();
        bekle(3);

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(techproWindowHandle);
        bekle(3);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandle);
        bekle(3);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandle);
        bekle(3);
    }

    @Test
    public void test02() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();


        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(3);

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().
                newWindow(WindowType.TAB);//-- Yeni bir pencereye driver i taşır.
        //WindowType.TAB --> Yeni bir sekme açar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();
        bekle(3);


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();
        bekle(3);

        //techproeducation sayfasına geçiniz:
        driver.switchTo().window(techproWindowHandle);
        bekle(3);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandle);
        bekle(3);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandle);
        bekle(3);
    }
}
