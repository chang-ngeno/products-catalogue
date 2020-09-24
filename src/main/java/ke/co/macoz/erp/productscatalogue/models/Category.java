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

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "mst_categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", insertable = false, updatable = false, nullable = false)
	private Long categoryId;

	@Column(name = "category_name", unique = true, nullable = false, length = 50, insertable = true, updatable = true)
	private String categoryName;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "parent_category_id",referencedColumnName = "category_id")
	@RestResource(path = "parentCategory", rel="category")
	private Category parentCategory;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
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

	public Category() {
		super();
	}

	public Category(Long categoryId, String categoryName, Category parentCategory) {
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
