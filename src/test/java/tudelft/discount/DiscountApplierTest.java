package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    public void discountFilterTest() {
        Product bed=new Product("BED",10,"HOME");
        Product desk=new Product("DESK",20,"BUSINESS");


        ProductDao dao= Mockito.mock(ProductDao.class);

        List<Product> result = Arrays.asList(bed,desk);
        Mockito.when(dao.all()).thenReturn(result);

        DiscountApplier discountApplier=new DiscountApplier(dao);
        discountApplier.setNewPrices();
        Assertions.assertEquals(10*0.9, result.get(0).getPrice());
        Assertions.assertEquals(20*1.1, result.get(1).getPrice());
    }
}
