package fb.oo.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GiantTest {

    @Test
    public void getName_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Giant factory = new Giant();
        factory.setName(name);

        // assertion                                       `
        Assertions.assertEquals("廣大", factory.getName());
    }

    @Test
    public void reportProductionStatus_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Manufacturer factory = new RedSea();
        factory.setName(name);

        // assertion
        Assertions.assertEquals("廣大工廠生產報告",
                                factory.reportProductionStatus());
    }

    private String getFactoryName() {
        return "廣大";
    }

    /**
     * 廣大: 沒有生產手機
     */
    @Test
    public void manufacturePhone_should_success(){

        // arrange
        String name = getFactoryName();
        Manufacturer factory = new Giant();
        factory.setName(name);

        // action, assertion
        Assertions.assertEquals("沒有生產",
                                factory.manufacturePhone(null));
    }
}
