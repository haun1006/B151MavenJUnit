package techproed.day15_FilesExists;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import techproed.utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02_FileDownloadTest extends TestBase {
    @Test
    public void test01() {

        /*
        Dosyayı daha önce indirdiğimiz için ve tekrar testi çalıştırdığımızda yine aynı dosyayı indireceği için
        burda dosyayı sildik
         */

        //Dosya'nın daha önce indirilmiş olması ihtimaline karşı önce o dosyayı sildik.
        String filePath = "C:\\Users\\hasan\\Downloads\\b10 all test cases, code.docx";
        try {
            Files.delete(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("dosya bulunamadı...");
        }

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        bekle(2);

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.xpath("(//a)[3]")).click();

        bekle(3);   // İndirme süresini göz önünde bulundurarak bekle koyduk.

        //Dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu = "C:\\Users\\hasan\\Downloads\\b10 all test cases, code.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
