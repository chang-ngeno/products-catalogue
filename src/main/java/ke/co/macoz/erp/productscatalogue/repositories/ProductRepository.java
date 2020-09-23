package ke.co.macoz.erp.productscatalogue.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ke.co.macoz.erp.productscatalogue.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{

}
