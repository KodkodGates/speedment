package com.company.sakila.db0.sakila.inventory.generated;

import com.company.sakila.db0.sakila.film.Film;
import com.company.sakila.db0.sakila.inventory.Inventory;
import com.company.sakila.db0.sakila.store.Store;
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
 * com.company.sakila.db0.sakila.inventory.Inventory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedInventoryImpl implements HasDirtyColumns<Inventory>, Inventory {
    
    private final static Set<Identifier> DISABLED_MODIFICATION_TRACKING = Collections.emptySet();
    private int inventoryId;
    private int filmId;
    private short storeId;
    private Timestamp lastUpdate;
    private Set<Identifier> dirtyColumns_;
    
    protected GeneratedInventoryImpl() {}
    
    @Override
    public int getInventoryId() {
        return inventoryId;
    }
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public short getStoreId() {
        return storeId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Inventory setInventoryId(int inventoryId) {
        allColumnsDirty();
        this.inventoryId = inventoryId;
        return this;
    }
    
    @Override
    public Inventory setFilmId(int filmId) {
        columnDirty(Identifier.FILM_ID);
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public Inventory setStoreId(short storeId) {
        columnDirty(Identifier.STORE_ID);
        this.storeId = storeId;
        return this;
    }
    
    @Override
    public Inventory setLastUpdate(Timestamp lastUpdate) {
        columnDirty(Identifier.LAST_UPDATE);
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Film findFilmId(Manager<Film> foreignManager) {
        return foreignManager.stream().filter(Film.FILM_ID.equal(getFilmId())).findAny().orElse(null);
    }
    
    @Override
    public Store findStoreId(Manager<Store> foreignManager) {
        return foreignManager.stream().filter(Store.STORE_ID.equal(getStoreId())).findAny().orElse(null);
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
    public Stream<ColumnIdentifier<Inventory>> dirtyColumns() {
        return dirtyColumns_ != null ? dirtyColumns_.stream().map(i -> i) : Stream.empty();
    }
    
    private String starForDirty(Identifier id) {
        return dirtyColumns_ != null && dirtyColumns_.contains(id) ? "*" : "";
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add(starForDirty(Identifier.INVENTORY_ID) + "inventoryId = " +  Objects.toString(getInventoryId()));
        sj.add(starForDirty(Identifier.FILM_ID) + "filmId = " +            Objects.toString(getFilmId()));
        sj.add(starForDirty(Identifier.STORE_ID) + "storeId = " +          Objects.toString(getStoreId()));
        sj.add(starForDirty(Identifier.LAST_UPDATE) + "lastUpdate = " +    Objects.toString(getLastUpdate()));
        return "InventoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Inventory)) { return false; }
        final Inventory thatInventory = (Inventory)that;
        if (this.getInventoryId() != thatInventory.getInventoryId()) { return false; }
        if (this.getFilmId() != thatInventory.getFilmId()) { return false; }
        if (this.getStoreId() != thatInventory.getStoreId()) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatInventory.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getInventoryId());
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Short.hashCode(getStoreId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}