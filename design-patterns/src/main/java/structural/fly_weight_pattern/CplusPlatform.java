package structural.fly_weight_pattern;

public class CplusPlatform implements Platform {
    @Override
    public void platform(Code code) {
        System.out.println("code = [" + code + "]");
    }
}
