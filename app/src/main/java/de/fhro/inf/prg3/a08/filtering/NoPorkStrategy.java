package de.fhro.inf.prg3.a08.filtering;

import de.fhro.inf.prg3.a08.model.Meal;

/**
 * Created by LenovoG50-45 on 29.11.2017.
 */

public class NoPorkStrategy extends FilterBase {
    @Override
    boolean include(Meal m) {
        return false;
    }
}
