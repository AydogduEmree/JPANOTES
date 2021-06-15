package com.company.queries;

public class ProductQueries {
	
	public static final String findProductsAll = "SELECT  p FROM product p";

	//public static final String findProductsAll = "SELECT productId, available, createdDate, name, unitPrice, updatedDate, brandId, categoryId FROM product";

	public static final String findProducts = "SELECT P FROM product P WHERE P.unitPrice > :unitPrice";

	public static final String findGroupByCategory = "SELECT  p.category, AVG(p.unitPrice) FROM product p Group by p.category";
	
	public static final String findGroupByCategory2 = "it does not work when category used as categoryid !! SELECT  p.category, AVG(p.unitPrice) FROM product p Group by p.category";
}
