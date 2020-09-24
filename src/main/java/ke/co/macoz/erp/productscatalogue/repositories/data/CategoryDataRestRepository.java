package ke.co.macoz.erp.productscatalogue.repositories.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ke.co.macoz.erp.productscatalogue.models.Category;

@RepositoryRestResource(path = "category", collectionResourceRel = "categories")
@Transactional
public interface CategoryDataRestRepository extends PagingAndSortingRepository<Category, Long>{
	
}
