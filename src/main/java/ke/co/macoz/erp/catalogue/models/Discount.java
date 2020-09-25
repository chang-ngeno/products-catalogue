package ke.co.macoz.erp.catalogue.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ke.co.macoz.erp.catalogue.models.utils.ActiveDeleted;

@Entity
@Table(name = "mst_discount")
public class Discount extends ActiveDeleted {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "discount_id", insertable = false, updatable = false, nullable = false)
	private Long discountId;

	@Column(name = "name", unique = true, nullable = false, length = 50, insertable = true, updatable = true)
	private String discountName;
	
	@Column(name = "amount_rate", unique = true, nullable = false, insertable = true)
	private double amountRate;
	
	@Column(name = "amount_rate_type", nullable = false)
	private String amountRateType;

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public double getAmountRate() {
		return amountRate;
	}

	public void setAmountRate(double amountRate) {
		this.amountRate = amountRate;
	}

	public String getAmountRateType() {
		return amountRateType;
	}

	public void setAmountRateType(String amountRateType) {
		this.amountRateType = amountRateType;
	}

	public Discount() { super(); }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Discount [\"discountId\"=\"");
		builder.append(discountId);
		builder.append("\", \"discountName\"=\"");
		builder.append(discountName);
		builder.append("\", \"amountRate\"=\"");
		builder.append(amountRate);
		builder.append("\", \"amountRateType\"=\"");
		builder.append(amountRateType);
		builder.append("\"]");
		return builder.toString();
	}
	
	
}

