package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Books");
		Seller sell = new Seller(1, "Alex", "alex@gmail.com", new Date(), 3000.0, dep);
		
		System.out.println(dep);
		System.out.println();
		System.out.println(sell);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		

	}

}
