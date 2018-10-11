package uk.org.kelsohighschool.ps.program.db;

public class Location {
	private int location_id;
	private String location_name;
	private String location_desc;
	
	/**
	 * Object which represents the location table
	 * @param location_id id for each location Int
	 * @param location_name Name of each location String
	 * @param location_desc Description of each location String
	 */
	public Location(int location_id, String location_name, String location_desc) {
		super();
		this.location_id = location_id;
		this.location_name = location_name;
		this.location_desc = location_desc;
	}

	
	
	/** 
	 * gets and returns location_id
	 * @return location_id
	 */
	public int getLocation_id() {
		return location_id;
	}



	/**
	 * sets location_id
	 * @param location_id Value to set location_id to
	 */
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}



	/**
	 * gets and returns location_name
	 * @return location_name
	 */
	public String getLocation_name() {
		return location_name;
	}



	/**
	 * sets location_name
	 * @param location_name Value to set location_name to
	 */
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}



	/**
	 * gets and returns location_desc
	 * @return location_desc
	 */
	public String getLocation_desc() {
		return location_desc;
	}



	/**
	 * sets location_desc
	 * @param location_desc location_id Value to set  to
	 */
	public void setLocation_desc(String location_desc) {
		this.location_desc = location_desc;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", location_name=" + location_name + ", location_desc="
				+ location_desc + "]";
	}

}
