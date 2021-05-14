package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findByID ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");

 		List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
		sellerList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		sellerList = sellerDao.findAll();
		sellerList.forEach(System.out::println);
		
	}
	
}