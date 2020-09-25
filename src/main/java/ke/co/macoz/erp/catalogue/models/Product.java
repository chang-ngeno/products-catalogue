package ke.co.macoz.erp.catalogue.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ke.co.macoz.erp.catalogue.models.utils.ActiveDeleted;

@Entity
@Table(name = "products_mst")
public class Product extends ActiveDeleted {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", insertable = false, updatable = false, nullable = false)
	private Long productId;

	@Column(name = "name", unique = true, nullable = false, length = 100, insertable = true, updatable = true)
	private String productName;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_category_id", referencedColumnName = "category_id", foreignKey = @ForeignKey(name = "FK_product_category"))
	private Category category;

	@Column(name = "product_price")
	private double price;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_discount_id", referencedColumnName = "discount_id", foreignKey = @ForeignKey(name = "FK_product_discount"))
	private Discount discount;

	public Product() {
		super();
	}

	public Product(Long productId, String productName, Category category, double price, Discount discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
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
