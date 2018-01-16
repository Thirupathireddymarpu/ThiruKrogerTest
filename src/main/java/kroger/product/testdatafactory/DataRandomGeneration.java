package kroger.product.testdatafactory;

import io.github.benas.randombeans.api.Randomizer;
import kroger.product.vo.Product;

public class DataRandomGeneration implements Randomizer<Product> {

	public Product getRandomValue() {
		RandomFillerObject random = new RandomFillerObject ();
		Product product = null;
		try {
			product = random.createAndFill(Product.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product;
	}

}
