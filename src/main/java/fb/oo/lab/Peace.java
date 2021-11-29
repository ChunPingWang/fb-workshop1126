package fb.oo.lab;

public class Peace extends Manufacturer{

    @Override
    String manufacturePhone(String product) {

        return "生產 " + product;
    }
}
