package demo13.org.springframework.factory.bean.factory.config;

public class BeanReference {

    private final String benaName;

    public BeanReference(String benaName){
        this.benaName = benaName;
    }

    public String getBenaName() {
        return benaName;
    }

}
