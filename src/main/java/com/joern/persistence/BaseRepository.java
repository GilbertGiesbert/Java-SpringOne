package com.joern.persistence;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * T describes the type of the managed entity.
 * ID describes the type of the entity’s id field.
 *
 * @NoRepositoryBean ensures that Spring Data JPA doesn’t try
 * to create an implementation for our base repository interface
 */


@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

	void delete(T deleted);

	List<T> findAll();

	Optional<T> findOne(ID id);

	T save(T persisted);
}