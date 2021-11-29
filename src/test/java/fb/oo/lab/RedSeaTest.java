package fb.oo.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RedSeaTest {

    @Test
    public void getName_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Manufacturer factory = new RedSea();
        factory.setName(name);

        // assertion
        Assertions.assertEquals("紅海", factory.getName());
    }

    @Test
    public void reportProductionStatus_should_success(){

        // arrange
        String name = getFactoryName();

        // action
        Manufacturer factory = new RedSea();
        factory.setName(name);

        // assertion
        Assertions.assertEquals("紅海工廠生產報告",
                                factory.reportProductionStatus());
    }

    private String getFactoryName() {
        return "紅海";
    }

    /**
     * 手機(i14)
     */
    @Test
    public void manufacturePhone_input_i14_should_success(){

        // arrange
        String name = getFactoryName();
        Manufacturer factory = new RedSea();
        factory.setName(name);
        String product = "i14";

        // action, assertion
        Assertions.assertEquals("生產 i14",
                                factory.manufacturePhone(product));
    }

    /**
     * 手機(i14-max)
     */
    @Test
    public void manufacturePhone_input_i14_max_should_success(){

        // arrange
        String name = getFactoryName();
        Manufacturer factory = new RedSea();
        factory.setName(name);
        String product = "i14-max";

        // action, assertion
        Assertions.assertEquals("生產 i14-max",
                                factory.manufacturePhone(product));
    }

//    /**
//     * 手機(i14-max)
//     */
//    @Test
//    public void manufacturePhone_strategy_pattern_should_success(){
//
//        Manufacturer2 redSea = new RedSea2();
//        redSea.setPhoneManufacturer();
//    }
}
