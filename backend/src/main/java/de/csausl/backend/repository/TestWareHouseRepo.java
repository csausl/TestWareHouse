package de.csausl.backend.repository;

import de.csausl.backend.models.ProductRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestWareHouseRepo extends MongoRepository<ProductRecord,String> {
}
