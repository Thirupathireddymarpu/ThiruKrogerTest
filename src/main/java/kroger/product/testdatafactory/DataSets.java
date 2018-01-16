package kroger.product.testdatafactory;

import java.util.List;

import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.collection.ListRandomizer;
import kroger.product.vo.Product;

public class DataSets {

	@SuppressWarnings("unchecked")
	public  List<Product> dataSet(int range) {

		Randomizer<Product> product = new DataRandomGeneration();
		ListRandomizer<Product> randomizerProductList = ListRandomizer.aNewListRandomizer(product, range);
		List<Product> productLIst = randomizerProductList.getRandomValue();

		return productLIst;

	}

}
