package ke.co.macoz.erp.productscatalogue.repositories.data;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ke.co.macoz.erp.productscatalogue.models.Category;

@RepositoryRestResource(path = "cat-data", collectionResourceRel = "cat-data")
public interface CategoryDataRestRepository extends PagingAndSortingRepository<Category, UUID>{

}
