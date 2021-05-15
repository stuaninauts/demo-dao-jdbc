package application;

import java.util.Date;
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
		Department department = new Department(2, null);
 		List<Seller> sellerList = sellerDao.findByDepartment(department);
		sellerList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		sellerList = sellerDao.findAll();
		sellerList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller insert ===");
		seller = new Seller(null, "Denis", "denis@gmail.com", new Date(), 2500.0, department);
		sellerDao.insert(seller);
		sellerList = sellerDao.findAll();
		sellerList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Claudin do Pneu");
		sellerDao.update(seller);
		System.out.println(seller);
	}
	
}