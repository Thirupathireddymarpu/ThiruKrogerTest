package kroger.product;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import kroger.product.testdatafactory.DataSets;
import kroger.product.vo.Product;

public class KrogerMain {

	/**
	 * @return
	 */
	public static List<Product> createDataSet(int range) {
		System.out.println(
				"**************************************************************************************************");
		List<Product> prodcutDataSetList = new DataSets().dataSet(range);
		System.out.println(
				"************************Product List with Fake Date Created with Data Set**************************************************************************");

		System.out.println(
				"**************************************************************************************************");

		return prodcutDataSetList;
	}

	/**
	 * @param prodcutDataSetList
	 */
	public static void sortByProductName(List<Product> prodcutDataSetList) {
		System.out.println(
				"____________________________________________________________________________________________");

		System.out.println("Adding Data Set One and  Sorting By based On Product Name ");
		prodcutDataSetList.sort((p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));
		System.out.println("ProdductID" + "\t" + "Product Name" + "\t\t\t" + "Category" + "\t" + "Expiry Date");
		System.out.println(
				"_____________________________________________________________________________________________");
		prodcutDataSetList.forEach(p -> {

			System.out.println(p.getProductNumber() + "\t" + p.getProductName() + "\t" + p.getProductCategories() + "\t"
					+ p.getDateOfExpiry());

		});
	}

	public static void sortByProductCategory(List<Product> prodcutDataSetList) {
		System.out.println(
				"_______________________________________________________________________________________________");

		System.out.println("Adding Data Set One and  Sorting By based On Product Category ");
		prodcutDataSetList.sort((p1, p2) -> p1.getProductCategories().compareTo(p2.getProductCategories()));
		System.out.println("ProdductID" + "\t" + "Product Name" + "\t\t\t" + "Category" + "\t" + "Expiry Date");
		System.out.println(
				"________________________________________________________________________________________________");

		prodcutDataSetList.forEach(p -> {
			System.out.println(p.getProductNumber() + "\t" + p.getProductName() + "\t" + p.getProductCategories() + "\t"
					+ p.getDateOfExpiry());
		});

		System.out.println(
				"________________________________________________________________________________________________");
	}

	/**
	 * @param prodcutDataSetList
	 */
	public static void sortOnProductExpriryDate(List<Product> prodcutDataSetList) {
		System.out.println(
				"________________________________________________________________________________________________");

		System.out.println("Adding Data Set One and  Sorting By based On Product Exprity Date ");
		prodcutDataSetList.sort((p1, p2) -> p1.getDateOfExpiry().compareTo(p2.getDateOfExpiry()));
		System.out.println("ProdductID" + "\t" + "Product Name" + "\t\t\t" + "Category" + "\t" + "Expiry Date");
		System.out.println(
				"________________________________________________________________________________________________");

		prodcutDataSetList.forEach(p -> {
			System.out.println(p.getProductNumber() + "\t" + p.getProductName() + "\t" + p.getProductCategories() + "\t"
					+ p.getDateOfExpiry());
		});

		System.out.println(
				"________________________________________________________________________________________________");
	}

	/**
	 * @param prodcutDataSetList
	 */
	public static void deletProductCategory(List<Product> prodcutDataSetList, String categoryName) {
		System.out.println(
				"________________________________________________________________________________________________");

		Predicate<Product> productDelete = p -> p.getProductCategories().name().equals(categoryName);
		prodcutDataSetList.removeIf(productDelete);

		System.out.println(
				"________________________________________________________________________________________________");

	}

	/**
	 * @param prodcutDataSetList
	 */
	public static void sortProductNo(List<Product> prodcutDataSetList) {
		System.out.println(
				"________________________________________________________________________________________________");

		prodcutDataSetList.sort((p1, p2) -> p1.getProductNumber() - p2.getProductNumber());
		System.out.println("ProductID" + "\t" + "Product Name" + "\t\t\t" + "Category" + "\t" + "Expiry Date");
		System.out.println(
				"________________________________________________________________________________________________");

		prodcutDataSetList.forEach(p -> {
			System.out.println(p.getProductNumber() + "\t" + p.getProductName() + "\t" + p.getProductCategories() + "\t"
					+ p.getDateOfExpiry());
		});

		System.out.println(
				"________________________________________________________________________________________________");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<Product> prodcutDataSetList = null;
		int option = 0;
		do {

			System.out.println("*** Choose below one of the options listed below ****");
			System.out.println("Option 1 - Create the ProductList");
			System.out.println("Option 2 - Sort Product Name");
			System.out.println("Option 3 - Sort Product Category");
			System.out.println("Option 4 - Sort Product Expiry Date");
			System.out.println("Option 5 - Delete by Product Categories");
			System.out.println("Option 6 - Sort  Product No");
			System.out.println("Option 0 - Exit program");

			System.out.print("Enter your choice :");
			option = Integer.parseInt(sc.nextLine());
			if (option == 1) {
				System.out.print("Enter the Size of List:");
				int size = Integer.parseInt(sc.nextLine());
				prodcutDataSetList = createDataSet(size);
			} else if (option == 2) {
				if (prodcutDataSetList == null) {
					System.out.println("No Data Avaliable");
					System.exit(0);
				}
				sortByProductName(prodcutDataSetList);
			} else if (option == 3) {
				if (prodcutDataSetList == null) {
					System.out.println("No Data Avaliable");
					System.exit(0);
				}
				sortByProductCategory(prodcutDataSetList);
			} else if (option == 4) {
				if (prodcutDataSetList == null) {
					System.out.println("No Data Avaliable");
					System.exit(0);
				}
				sortOnProductExpriryDate(prodcutDataSetList);
			} else if (option == 5) {
				if (prodcutDataSetList == null) {
					System.out.println("No Data Avaliable");
					System.exit(0);
				}
				System.out.print("Enter the Product Category:");
				String categoryName = sc.nextLine();
				deletProductCategory(prodcutDataSetList, categoryName);
			} else if (option == 6) {
				if (prodcutDataSetList == null) {
					System.out.println("No Data Avaliable");
					System.exit(0);
				}
				sortProductNo(prodcutDataSetList);
			}
		} while (option != 0);

		sc.close();

	}

}
