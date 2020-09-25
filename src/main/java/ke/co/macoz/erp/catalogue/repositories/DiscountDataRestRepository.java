package ke.co.macoz.erp.catalogue.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ke.co.macoz.erp.catalogue.models.Discount;

@RepositoryRestResource(path = "discount", collectionResourceRel = "discount")
@Transactional
public interface DiscountDataRestRepository extends PagingAndSortingRepository<Discount, Long> {
	@Override
	@RestResource(exported = false)
	public void delete(Discount entity);
	@Override
	@RestResource(exported = false)
	public void deleteAll();	
	@Override
	@RestResource(exported = false)
	public void deleteAll(Iterable<? extends Discount> entities) ;	
	@Override
	@RestResource(exported = false)
	public void deleteById(Long id);

}
