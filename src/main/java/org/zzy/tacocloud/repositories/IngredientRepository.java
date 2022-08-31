package org.zzy.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.zzy.tacocloud.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
