package structural.fly_weight_pattern;

import java.util.HashMap;
import java.util.Map;

public class JavaPlatform implements Platform {



    @Override
    public void platform(Code code) {
        System.out.println("code = [" + code + "]");
    }
}
