package ke.co.macoz.erp.productscatalogue.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ke.co.macoz.erp.productscatalogue.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
