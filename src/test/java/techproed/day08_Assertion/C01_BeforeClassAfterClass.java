package techproed.day08_Assertion;

import org.junit.*;

public class C01_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodlari static olmak zorundadir
     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her class'dan önce Before class methodu bir kez çalışır");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her class'dan sonra Afterclass methodu bir kez çalışır");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her method'dan önce Before methodu bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her method'dan sonra After(teardown) method'u bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("Test01 methodu çalıştı");
    }

    @Test
    public void test02() {
        System.out.println("Test02 methodu çalıştı");
    }

    @Test
    public void test03() {
        System.out.println("Test03 methodu çalıştı");
    }
}
