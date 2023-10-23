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

	// market id's
	private Integer	id;

	private String	marketName;
	private String	seoUrl;

	public Market() {
	}

	public Market(Integer id, String marketName, String seoUrl) {
		this.id = id;
		this.marketName = marketName;
		this.seoUrl = seoUrl;
	}

	public ObjectId get_id() {
		return _id;
	}

	public Integer getId() {
		return id;
	}

	public String getMarketName() {
		return marketName;
	}

	public String getSeoUrl() {
		return seoUrl;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public void setSeoUrl(String seoUrl) {
		this.seoUrl = seoUrl;
	}
}
