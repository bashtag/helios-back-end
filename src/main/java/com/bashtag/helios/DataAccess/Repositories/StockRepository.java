package com.bashtag.helios.DataAccess.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bashtag.helios.Entities.Stock;
import java.util.List;


public interface StockRepository extends MongoRepository<Stock, ObjectId> {

	List<Stock> findBySymbol(String symbol);

	List<Stock> findByMarket(ObjectId market);

}
