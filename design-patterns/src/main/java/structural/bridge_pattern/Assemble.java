package structural.bridge_pattern;

public class Assemble implements Workshop {
    private String work;

    public Assemble(String work) {
        this.work = work;
    }

    @Override
    public void work() {
        System.out.println("Assemble: " + this.work);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
