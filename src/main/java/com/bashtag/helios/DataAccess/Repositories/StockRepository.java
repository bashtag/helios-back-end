package com.bashtag.helios.DataAccess.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bashtag.helios.DataAccess.Interfaces.IStockDal;
import com.bashtag.helios.Entities.Stock;

public interface StockRepository extends MongoRepository<Stock, ObjectId>, IStockDal {
	
}
