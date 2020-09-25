package ke.co.macoz.erp.catalogue.models.utils;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ActiveDeleted {
	private boolean active = true;
	private boolean deleted = false;

	public ActiveDeleted() {
		super();
	}

	public ActiveDeleted(boolean active, boolean deleted) {
		super();
		this.active = active;
		this.deleted = deleted;
	}

	@Column(name = "is_active")
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "is_deleted")
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
