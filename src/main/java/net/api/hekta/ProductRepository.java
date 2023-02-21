package net.api.hekta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.api.hekta.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
