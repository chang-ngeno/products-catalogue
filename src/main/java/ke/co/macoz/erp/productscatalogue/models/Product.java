package ke.co.macoz.erp.productscatalogue.models;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products_mst")
public class Product {@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "discount_id", nullable = false, unique = true, updatable = false)
	private UUID productId;

	@Column(name = "name", unique = true, nullable = false, length = 100, insertable = true, updatable = true)
	private String productName;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_category_id",referencedColumnName = "category_id")
	private Category category;
	
	@Column(name = "product_price")
	private double price;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_discount_id",referencedColumnName = "discount_id")
	private Discount discount;

	public Product() { super(); }

	public Product(UUID productId, String productName, Category category, double price, Discount discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [\"productId\"=\"");
		builder.append(productId);
		builder.append("\", \"productName\"=\"");
		builder.append(productName);
		builder.append("\", \"category\"=\"");
		builder.append(category);
		builder.append("\", \"price\"=\"");
		builder.append(price);
		builder.append("\", \"discount\"=\"");
		builder.append(discount);
		builder.append("\"]");
		return builder.toString();
	}
	
	
}
