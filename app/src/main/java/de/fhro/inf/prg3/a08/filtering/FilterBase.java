package de.fhro.inf.prg3.a08.filtering;

import java.util.ArrayList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by LenovoG50-45 on 29.11.2017.
 */

public abstract class FilterBase implements MealsFilter {
    @Override
    public List<Meal> filter(List<Meal> meals) {
        List<Meal> filteredMeals = new ArrayList<>();
        for (Meal meal: meals) {
            if (include(meal))
                filteredMeals.add(meal);
        }
        return null;
    }

    abstract boolean include(Meal m);
}
