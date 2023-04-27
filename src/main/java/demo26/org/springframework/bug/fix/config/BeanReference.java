package demo26.org.springframework.bug.fix.config;

public class BeanReference {

    private final String benaName;

    public BeanReference(String benaName){
        this.benaName = benaName;
    }

    public String getBenaName() {
        return benaName;
    }

}
