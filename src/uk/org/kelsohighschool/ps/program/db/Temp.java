package uk.org.kelsohighschool.ps.program.db;

import java.sql.Timestamp;

public class Temp {
	
	private int id2;
	private Timestamp time;
	private float temp_reading;
	private int sensor_id;
	
	
	/**
	 * Object which represents the temp table
	 * @param id2 Unique Int
	 * @param time Time as an Int
	 * @param temp_reading temp reading as a float
	 * @param sensor_id sensor id as Int
	 */
	public Temp(int id2, Timestamp time, float temp_reading, int sensor_id) {
		super();
		this.id2 = id2;
		this.time = time;
		this.temp_reading = temp_reading;
		this.sensor_id = sensor_id;
	}
	/**
	 * gets and returns id2
	 * @return id2
	 */
	public int getId2() {
		return id2;
	}
	/**
	 * sets Id2
	 * @param id2 Value to set id2 to
	 */
	public void setId2(int id2) {
		this.id2 = id2;
	}
	/**
	 * gets and returns time
	 * @return time
	 */
	public Timestamp getTime() {
		return time;
	}
	/**
	 * sets time
	 * @param time Value to set time to
	 */
	public void setTime(Timestamp time) {
		this.time = time;
	}
	/**
	 * gets and returns temp_reading
	 * @return temp_reading
	 */
	public float getTemp_reading() {
		return temp_reading;
	}
	/**
	 * sets temp_reading
	 * @param temp_reading Value to set temp_reading to
	 */
	public void setTemp_reading(float temp_reading) {
		this.temp_reading = temp_reading;
	}
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
	
	@Override
	public String toString() {
		return "Temp [id2=" + id2 + ", time=" + time + ", temp_reading=" + temp_reading + ", sensor_id=" + sensor_id
				+ "]";
	}
	

}
