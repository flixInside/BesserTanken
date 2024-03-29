package de.flix29.besserTanken.kraftstoffbilliger.deserializer;

import com.google.gson.reflect.TypeToken;
import de.flix29.besserTanken.kraftstoffbilliger.model.FuelStation;
import de.flix29.besserTanken.kraftstoffbilliger.model.FuelType;
import de.flix29.besserTanken.kraftstoffbilliger.model.OpeningTime;
import de.flix29.besserTanken.kraftstoffbilliger.model.Price;

import java.lang.reflect.Type;
import java.util.List;

public class CustomModelTypes {

    public static final Type FUEL_TYPE_LIST_TYPE = new TypeToken<List<FuelType>>(){}.getType();
    public static final Type PRICE_LIST_TYPE = new TypeToken<List<Price>>(){}.getType();
    public static final Type FUEL_STATION_LIST_TYPE = new TypeToken<List<FuelStation>>(){}.getType();
    public static final Type OPENING_TIMES_LIST_TYPE = new TypeToken<List<OpeningTime>>(){}.getType();

}
