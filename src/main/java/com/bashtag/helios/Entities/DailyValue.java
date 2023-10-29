package com.bashtag.helios.Entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "daily_values")
public class DailyValue {
	@Id
	private ObjectId	id;
	
	// Stock reference
	private ObjectId	stock_id;
	
	private Date	date;
	// values for each data
	private double	open;
	private double	high;
	private double	low;
	private double	close;

	// volume of occured transactions
	private long	volume;

	// constructors
	public DailyValue(ObjectId id, ObjectId stock_id, Date date, double open, double high, double low, double close,
			long volume) {
		this.id = id;
		this.stock_id = stock_id;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
	}

	// getters and setters

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getStockId() {
		return stock_id;
	}

	public void setStockId(ObjectId stock_id) {
		this.stock_id = stock_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}
}
