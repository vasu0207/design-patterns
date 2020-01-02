package structural.fly_weight_pattern;

public class TestFlyWeight {
    static String C = "C Language";
    static String Cplus = "C++ Language";
    static String JAVA = "JAVA Language";

    public static void main(String[] args) {
    System.out.println("Entered Main");
        Code c = new Code();
        c.setLinesOfCode(C);
        Platform cLang = PlatformFactory.getPlatformInstance("C");
        cLang.platform(c);


        Code c1 = new Code();
        c.setLinesOfCode(Cplus);
        Platform cpp = PlatformFactory.getPlatformInstance("C++");
        cpp.platform(c1);

        Code c2 = new Code();
        c.setLinesOfCode(JAVA);
        Platform javaLang = PlatformFactory.getPlatformInstance("JAVA");
        javaLang.platform(c2);

        Platform javaLang1= PlatformFactory.getPlatformInstance("JAVA");
        javaLang1.platform(c2);


        System.out.println("Exist Main");
    }
}
