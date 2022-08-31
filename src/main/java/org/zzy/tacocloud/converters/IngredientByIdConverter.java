package org.zzy.tacocloud.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.zzy.tacocloud.domain.Ingredient;
import org.zzy.tacocloud.repositories.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
	private final IngredientRepository ingredientRepository;

	public IngredientByIdConverter(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Ingredient convert(String id) {
		return ingredientRepository.findById(id).orElse(null);
	}
}
