package demo10.org.springframework.factory.config;

public class BeanReference {

    private final String benaName;

    public BeanReference(String benaName){
        this.benaName = benaName;
    }

    public String getBenaName() {
        return benaName;
    }

}
