package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

		objectSet.add(new DomainObject("Helga","bla"));
		objectSet.add(new DomainObject("Walter","bla"));
		objectSet.add(new DomainObject("Hans","bla"));
		objectSet.add(new DomainObject("Paula","bla"));
		objectSet.add(new DomainObject("Claudia","bla"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.toString());
		}
		
	}

}
