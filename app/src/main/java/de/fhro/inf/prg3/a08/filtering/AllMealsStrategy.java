package de.fhro.inf.prg3.a08.filtering;

import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by LenovoG50-45 on 29.11.2017.
 */

public class AllMealsStrategy implements MealsFilter {
    @Override
    public List<Meal> filter(List<Meal> meals) {
        return meals;
    }
}
