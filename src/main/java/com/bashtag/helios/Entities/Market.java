package com.bashtag.helios.Entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Market Model for datas in markets collection
 */
@Document(collection = "markets")
public class Market {
	// bson id's given by mongodb
	@Id
	private ObjectId	_id;

	private String	marketName;
	private String	seoUrl;

	// getters and setters
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getSeoUrl() {
		return seoUrl;
	}
	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}

}
