package in.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.raghu.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
