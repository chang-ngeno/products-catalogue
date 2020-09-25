package ke.co.macoz.erp.catalogue.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ke.co.macoz.erp.catalogue.models.Category;

@RepositoryRestResource(path = "category", collectionResourceRel = "categories")
@Transactional
public interface CategoryDataRestRepository extends PagingAndSortingRepository<Category, Long>{
	@Override
	@RestResource(exported = false)
	public void delete(Category entity);
	@Override
	@RestResource(exported = false)
	public void deleteAll();	
	@Override
	@RestResource(exported = false)
	public void deleteAll(Iterable<? extends Category> entities) ;	
	@Override
	@RestResource(exported = false)
	public void deleteById(Long id);
}
