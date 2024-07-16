package application;

import java.util.Date;

import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department dp = new Department(1, "books");
		System.out.println(dp);
		Seller seller = new Seller(21,"Bernardo", "bernardo@gmail.com", new Date(), 3000.0, dp);
		System.out.println(seller);
	}

}
