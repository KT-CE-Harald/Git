package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

		objectSet.add(DomainFactory.createDomainObject("Helga","bla"));
		objectSet.add(DomainFactory.createDomainObject("Walter","bla"));
		objectSet.add(DomainFactory.createDomainObject("Hans","bla"));
		objectSet.add(DomainFactory.createDomainObject("Paula","bla"));
		objectSet.add(DomainFactory.createDomainObject("Claudia","bla"));

		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.toString());
		}
		
	}

}
