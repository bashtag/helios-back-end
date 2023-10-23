package com.bashtag.helios.DataAccess.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bashtag.helios.DataAccess.Interfaces.IMarketDal;
import com.bashtag.helios.Entities.Market;

public interface MarketRepository extends MongoRepository<Market, ObjectId>, IMarketDal {
	
}
