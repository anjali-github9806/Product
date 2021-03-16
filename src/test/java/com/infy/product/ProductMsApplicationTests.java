package com.infy.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.product.dto.ProductDTO;
import com.infy.product.entity.Product;
import com.infy.product.repository.ProductRepository;
import com.infy.product.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class ProductMsApplicationTests {
	
	@Mock
	ProductRepository productRepo;
	
	@InjectMocks
	ProductService productService = new ProductService();
	
	@Test
	public void authenticateAllProducts() {
		ProductDTO product = new ProductDTO();
		product.setBrand("AW");
		product.setCategory("Footwear");
		product.setDescription("Key Features of AW Bellies Sandals Wedges Heel Casuals,AW Bellies Price: Rs. 499 Material: Synthetic Lifestyle: Casual Heel");
		product.setImage("\"http://img5a.flixcart.com/image/shoe/7/z/z/red-as-454-aw-11-original-imaeebfwsdf6jdf6.jpeg\"");
		product.setPrice(999.00);
		product.setProductId(3);
		product.setProductName("AW Bellies");
		product.setRating(null);
		product.setSellerId(2);
		product.setStock(93);
		product.setSubcategory("Women\\'s Footwear");
		
//		Mockito.when(productRepo.findById(product.getProductId())).thenReturn(product);
		
		
		
	}

}
