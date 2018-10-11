package uk.org.kelsohighschool.ps.program.db;

public class Co2 {
	private int id1;
	private int time;
	private float co2_reading;
	private int sensor_id;
	
	/**
	 * Object which represents the Co2 table
	 * @param id1 Unique Int
	 * @param time Time as an Int
	 * @param co2_reading co2 reading as a float
	 * @param sensor_id sensor id as Int
	 */
	public Co2(int id1, int time, float co2_reading, int sensor_id) {
		super();
		this.id1 = id1;
		this.time = time;
		this.co2_reading = co2_reading;
		this.sensor_id = sensor_id;
	}

	/**
	 * gets and returns id1
	 * @return id1
	 */
	public int getId1() {
		return id1;
	}

	/** 
	 * sets id1
	 * @param id1 Value to set id1 to
	 */
	public void setId1(int id1) {
		this.id1 = id1;
	}
	
	/**
	 * gets and returns time
	 * @return time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * sets time
	 * @param time Value to set time to
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Gets and returns co2_reading
	 * @return co2_reading
	 */
	public float getCo2_reading() {
		return co2_reading;
	}

	/**
	 * sets co2_reading
	 * @param co2_reading Value to set co2_reading to
	 */
	public void setCo2_reading(float co2_reading) {
		this.co2_reading = co2_reading;
	}

	/**
	 * Gets and returns sensor_id
	 * @return sensor_id
	 */
	public int getSensor_id() {
		return sensor_id;
	}

	/**
	 * sets sensor_id
	 * @param sensor_id Value to set sensor_id to
	 */
	public void setSensor_id(int sensor_id) {
		this.sensor_id = sensor_id;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Co2 [id1=" + id1 + ", time=" + time  + ", co2_reading=" + co2_reading + ", sensor_id=" + sensor_id + "]";
	}
	
	
}