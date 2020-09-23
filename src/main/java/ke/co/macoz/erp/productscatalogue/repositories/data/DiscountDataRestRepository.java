package ke.co.macoz.erp.productscatalogue.repositories.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ke.co.macoz.erp.productscatalogue.models.Discount;

@RepositoryRestResource(path = "discount", collectionResourceRel = "discount")
public interface DiscountDataRestRepository extends PagingAndSortingRepository<Discount, String> {

}
