package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

    private static Map<String, AccessControl> map = new HashMap<>();
    static {
        map.put("ADMIN", new AccessControl("ADMIN","ADD/READ REPORTS"));
        map.put("USER", new AccessControl("USER","READ REPORTS"));
        map.put("MANAGER", new AccessControl("MANAGER","GENERATE/READ REPORTS"));
        map.put("VP", new AccessControl("VP","MODIFY REPORTS"));
    }


    public static AccessControl getAccessControlObject(String level) throws CloneNotSupportedException {
        AccessControl accessControl = map.get(level);
        if(accessControl!= null){
            return accessControl.clone();
        }
        return null;
    }
}
