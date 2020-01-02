package structural.fly_weight_pattern;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {

    static Map<String, Platform> map = new HashMap<>();
    static{
        map.put("C",new Cplatform());
        map.put("C++",new Cplatform());
        map.put("JAVA",new JavaPlatform());
    }

    public static synchronized Platform getPlatformInstance(String type) {
        Platform pf =  map.get(type);

        if(pf == null){
            switch(type){
                case "C": map.get("C"); break;
                case "C++": map.get("C++"); break;
                case "JAVA": map.get("JAVA"); break;
            }
        }
        return pf;
    }
}
