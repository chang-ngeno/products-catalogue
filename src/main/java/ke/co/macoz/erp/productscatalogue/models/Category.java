package ke.co.macoz.erp.productscatalogue.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "mst_categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type="uuid-char")
	@Column(name="category_id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
	private String categoryId;

	@Column(name = "category_name", unique = true, nullable = false, length = 50, insertable = true, updatable = true)
	private String categoryName;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "parent_category_id")
	private Category parentCategory;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Category() { super(); }

	public Category(String categoryId, String categoryName, Category parentCategory) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.parentCategory = parentCategory;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [\"categoryId\"=\"");
		builder.append(categoryId);
		builder.append("\", \"categoryName\"=\"");
		builder.append(categoryName);
		builder.append("\", \"parentCategory\"=\"");
		builder.append(parentCategory);
		builder.append("\"]");
		return builder.toString();
	}
	
	

}
