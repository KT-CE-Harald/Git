package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString(); 
	
	private String name;
	
	/** * Default constructor */
	
	protected DomainObject() {
		super();
	}
	
	
	protected DomainObject(String id, String comment) { 
		super(); 
		this.uuid = id; 
	}
	

	protected String getUuId() {
		return uuid;
	}
	
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}
	
	public String getName() {
		return name;
	}

	public void setName(final String pname) {
		this.name = pname;
	}

}
