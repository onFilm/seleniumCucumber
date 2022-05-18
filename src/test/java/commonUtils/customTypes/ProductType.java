package commonUtils.customTypes;

import commonUtils.domainObjects.Product;
import io.cucumber.java.ParameterType;

public class ProductType {

    @ParameterType("([^\"]*)")
    public Product product(String name) {
        return new Product(name);
    }
}
