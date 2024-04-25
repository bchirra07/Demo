package ListCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EcommerceList {

	public static void main(String[] args) {
		
		Ecommerce ec1=new Ecommerce("Mobile", 70000, "Technology", 1);
		Ecommerce ec2=new Ecommerce("Shirt", 3500, "Clothing", 6);
		Ecommerce ec3=new Ecommerce("bowl", 200, "Applicances", 1);
		Ecommerce ec4=new Ecommerce("Lotion", 800, "Cosmetics", 5);
		
		List<Ecommerce> ecom=new LinkedList<Ecommerce>();
		
		ecom.add(ec1);
		ecom.add(ec2);
		ecom.add(ec3);
		ecom.add(ec4);
		
		Collections.sort(ecom, new sortPrice());
		for(Ecommerce ec:ecom)
		{
			System.out.println(ec);
		}

	}

}
