package org.zzy.tacocloud.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zzy.tacocloud.domain.Ingredient;
import org.zzy.tacocloud.repositories.IngredientRepository;

@Configuration
public class DataConfig {
	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repository) {
		System.out.println("I'm loading datadatadata");
		return args -> {
			repository.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
			repository.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
			repository.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
			repository.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
			repository.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIE));
			repository.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIE));
			repository.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
			repository.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
			repository.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
			repository.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
		};
	}
}
