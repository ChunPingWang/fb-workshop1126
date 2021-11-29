package fb.oo.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeaceTest {

    @Test
    public void getName_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Peace factory = new Peace();
        factory.setName(name);

        // assertion                                       `
        Assertions.assertEquals("和平", factory.getName());
    }

    @Test
    public void reportProductionStatus_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Manufacturer factory = new RedSea();
        factory.setName(name);

        // assertion
        Assertions.assertEquals("和平工廠生產報告",
                                factory.reportProductionStatus());
    }

    private String getFactoryName() {
        return "和平";
    }

    /**
     * 和平: 手機(i14), 平板(ipad)
     */
    @Test
    public void manufacturePhone_should_success(){

        // arrange
        String name = getFactoryName();
        Manufacturer factory = new RedSea();
        factory.setName(name);
        String product = "ipad";

        // action, assertion
        Assertions.assertEquals("生產 ipad",
                                factory.manufacturePhone(product));
    }
}
