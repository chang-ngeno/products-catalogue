package ke.co.macoz.erp.catalogue.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ke.co.macoz.erp.catalogue.models.Product;

@RepositoryRestResource
public interface ProductDataRepository extends PagingAndSortingRepository<Product, Long> {
	@Override
	@RestResource(exported = false)
	public void delete(Product entity);

	@Override
	@RestResource(exported = false)
	public void deleteAll();

	@Override
	@RestResource(exported = false)
	public void deleteAll(Iterable<? extends Product> entities);

	@Override
	@RestResource(exported = false)
	public void deleteById(Long id);
}
