package com.bashtag.helios.DataAccess.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bashtag.helios.Entities.Market;
import java.util.List;

// market collection is readonly so the queries too.
public interface MarketRepository extends MongoRepository<Market, ObjectId> {
	// find by id query
	List<Market> findBy_id(ObjectId _id);

	// find by market name
	List<Market> findByMarketName(String marketName);
}
