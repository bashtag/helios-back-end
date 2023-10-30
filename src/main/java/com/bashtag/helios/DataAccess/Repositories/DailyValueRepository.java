package com.bashtag.helios.DataAccess.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bashtag.helios.Entities.DailyValue;

public interface DailyValueRepository extends MongoRepository<DailyValue, ObjectId> {
	
}
