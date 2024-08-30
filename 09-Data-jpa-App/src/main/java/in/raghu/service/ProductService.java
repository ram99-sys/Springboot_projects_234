package in.raghu.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;

import in.raghu.entity.Product;
import in.raghu.repo.ProductRepository;

@Service
public class ProductService {
	
	public ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	public void saveProductData() throws IOException {
		Product product=new Product();
		product.setName("laptop");
		 File imageFile = new File("C:\\Users\\kamak\\Downloads\\product.jpg");
	        try (FileInputStream fileInputStream = new FileInputStream(imageFile)) {
	            byte[] buffer = new byte[1024];
	            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	            int bytesRead;
	            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
	                outputStream.write(buffer, 0, bytesRead);
	            }
	            byte[] imageData = outputStream.toByteArray();
	            product.setImageData(imageData);
	            productRepo.save(product);
	        }
	}
	
}
