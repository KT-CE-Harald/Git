package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString(); 
	
	private String name;
	
	/** * Default constructor */
	
	public DomainObject() {
		super();
	}
	
	public DomainObject(String id) { 
		super(); 
		this.uuid = id; 
	}
	
	public String getUuId() {
		return uuid;
	}
	
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
