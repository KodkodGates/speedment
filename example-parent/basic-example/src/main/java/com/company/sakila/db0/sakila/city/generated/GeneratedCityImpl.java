package com.company.sakila.db0.sakila.city.generated;

import com.company.sakila.db0.sakila.city.City;
import com.company.sakila.db0.sakila.country.Country;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.trait.HasDirtyColumns;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.city.City}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCityImpl implements HasDirtyColumns<City>, City {
    
    private final static Set<Identifier> DISABLED_MODIFICATION_TRACKING = Collections.emptySet();
    private int cityId;
    private String city;
    private int countryId;
    private Timestamp lastUpdate;
    private Set<Identifier> dirtyColumns_;
    
    protected GeneratedCityImpl() {}
    
    @Override
    public int getCityId() {
        return cityId;
    }
    
    @Override
    public String getCity() {
        return city;
    }
    
    @Override
    public int getCountryId() {
        return countryId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public City setCityId(int cityId) {
        allColumnsDirty();
        this.cityId = cityId;
        return this;
    }
    
    @Override
    public City setCity(String city) {
        columnDirty(Identifier.CITY);
        this.city = city;
        return this;
    }
    
    @Override
    public City setCountryId(int countryId) {
        columnDirty(Identifier.COUNTRY_ID);
        this.countryId = countryId;
        return this;
    }
    
    @Override
    public City setLastUpdate(Timestamp lastUpdate) {
        columnDirty(Identifier.LAST_UPDATE);
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Country findCountryId(Manager<Country> foreignManager) {
        return foreignManager.stream().filter(Country.COUNTRY_ID.equal(getCountryId())).findAny().orElse(null);
    }
    
    void resetModificationTracking() {
        dirtyColumns_ = null;
    }
    
    void disableModificationTracking() {
        dirtyColumns_ = DISABLED_MODIFICATION_TRACKING;
    }
    
    @Override
    public void clearUpdatedColumns() {
        if (dirtyColumns_ != DISABLED_MODIFICATION_TRACKING) {
            dirtyColumns_ = null;
        }
    }
    
    private void columnDirty(Identifier column) {
        if (dirtyColumns_ != DISABLED_MODIFICATION_TRACKING) {
            if (dirtyColumns_ == null) {
                dirtyColumns_ = EnumSet.of(column);
            } else {
                dirtyColumns_.add(column);
            }
        }
    }
    
    private void allColumnsDirty() {
        if (dirtyColumns_ != DISABLED_MODIFICATION_TRACKING) {
            dirtyColumns_ = EnumSet.allOf(Identifier.class);
        }
    }
    
    @Override
    public Stream<ColumnIdentifier<City>> dirtyColumns() {
        return dirtyColumns_ != null ? dirtyColumns_.stream().map(i -> i) : Stream.empty();
    }
    
    private String starForDirty(Identifier id) {
        return dirtyColumns_ != null && dirtyColumns_.contains(id) ? "*" : "";
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add(starForDirty(Identifier.CITY_ID) + "cityId = " +          Objects.toString(getCityId()));
        sj.add(starForDirty(Identifier.CITY) + "city = " +               Objects.toString(getCity()));
        sj.add(starForDirty(Identifier.COUNTRY_ID) + "countryId = " +    Objects.toString(getCountryId()));
        sj.add(starForDirty(Identifier.LAST_UPDATE) + "lastUpdate = " +  Objects.toString(getLastUpdate()));
        return "CityImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof City)) { return false; }
        final City thatCity = (City)that;
        if (this.getCityId() != thatCity.getCityId()) { return false; }
        if (!Objects.equals(this.getCity(), thatCity.getCity())) { return false; }
        if (this.getCountryId() != thatCity.getCountryId()) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCity.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getCityId());
        hash = 31 * hash + Objects.hashCode(getCity());
        hash = 31 * hash + Integer.hashCode(getCountryId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}