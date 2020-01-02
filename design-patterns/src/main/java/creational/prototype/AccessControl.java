package creational.prototype;

public class AccessControl implements Prototype{

    private String access;
    private String accessControl;

    public AccessControl(String access, String accessControl) {
        this.access = access;
        this.accessControl = accessControl;
    }

    @Override
    public AccessControl clone() throws CloneNotSupportedException {

        return (AccessControl) super.clone();
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(String accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "access='" + access + '\'' +
                ", accessControl='" + accessControl + '\'' +
                '}';
    }
}
