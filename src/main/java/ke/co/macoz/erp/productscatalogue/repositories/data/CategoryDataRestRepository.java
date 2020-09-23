package ke.co.macoz.erp.productscatalogue.repositories.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ke.co.macoz.erp.productscatalogue.models.Category;

@RepositoryRestResource(path = "category", collectionResourceRel = "category")
public interface CategoryDataRestRepository extends PagingAndSortingRepository<Category, String>{
	
	//List<Category> findByParentCategory(Category parentCategory);
	
	
}
