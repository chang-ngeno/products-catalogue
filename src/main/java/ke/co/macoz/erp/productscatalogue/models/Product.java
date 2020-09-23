package ke.co.macoz.erp.productscatalogue.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "products_mst")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type="uuid-char")
	@Column(name="product_id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
	private String productId;

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

	public Product(String productId, String productName, Category category, double price, Discount discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
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
