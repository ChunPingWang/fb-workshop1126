package fb.oo.lab;

public abstract class Manufacturer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String reportProductionStatus() {

        return name + "工廠生產報告"; 
    }

    abstract String manufacturePhone(String product);
}
