package techproed.day15_FilesExists;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FilesExists {
    @Test
    public void test01() {

        String dosyaYolu = "C:/Users/hasan/OneDrive/Masaüstü/sen.txt";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));//-->Dosya varsa true yoksa false döner
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @Test
    public void test02() {
        String dosyaYolu = "C:\\Users\\hasan\\OneDrive\\Masaüstü\\DEMOQA_files";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }

    @Test
    public void test03() {
        String farkliYol = "";
        String isletimSistemiAdi = System.getProperty("os.name");//-->İşletim sistemimizin adını verir
        System.out.println(isletimSistemiAdi);
        System.out.println(System.getProperty("user.home"));//-->Bilgisayarımızdaki kullanıcı yolunu verir
        if (isletimSistemiAdi.contains("Win")){
            farkliYol = System.getProperty("user.home");//-->Windows 10/-->C:\Users\Lenovo
        }else if (isletimSistemiAdi.contains("mac")){
            farkliYol = "/Users/aycapolatkamali";//-->Mac işletim sistemi yolu
        }
        String ortakYol = "/OneDrive/Masaüstü/sen.txt";
        String dosyaYolu = farkliYol+ortakYol;
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        try {
            Files.delete(Paths.get(dosyaYolu));//Bu şekilde belirtmiş olduğuöuz dosyayı sileriz.
        } catch (IOException e) {
            System.out.println("dosya bulunamadı");
        }
        Assert.assertFalse(Files.exists(Paths.get(dosyaYolu))); //Sildiğimiz için assertFlase kullandık



        //Sildiğimiz dosyayı tekrar oluşturalım
        try {
            Files.createFile(Paths.get(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        /*
            Her seferinde test ettiğimiz sayfada download işlemi yapılıyorsa gereksiz dosya kalabalığını önlemek için
        yukardaki delete işlemini kullanabiliriz
         */
    }

    @Test
    public void test04() {
        String dosyaYolu = "C:/Users/hasan/OneDrive/Masaüstü/sen.txt";
        File file = new File(dosyaYolu);
        System.out.println(file.exists());
        Assert.assertTrue(file.exists());
        file.delete();

    }
}
