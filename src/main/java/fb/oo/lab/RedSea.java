package fb.oo.lab;

public class RedSea extends Manufacturer{
    
    @Override
    String manufacturePhone(String product) {
        return "生產 " + product;
    }
}
