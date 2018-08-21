package com.company.sakila.db0.sakila.film_category.generated;

import com.company.sakila.db0.sakila.category.Category;
import com.company.sakila.db0.sakila.film.Film;
import com.company.sakila.db0.sakila.film_category.FilmCategory;
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
 * com.company.sakila.db0.sakila.film_category.FilmCategory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmCategoryImpl implements HasDirtyColumns<FilmCategory>, FilmCategory {
    
    private final static Set<Identifier> DISABLED_MODIFICATION_TRACKING = Collections.emptySet();
    private int filmId;
    private short categoryId;
    private Timestamp lastUpdate;
    private Set<Identifier> dirtyColumns_;
    
    protected GeneratedFilmCategoryImpl() {}
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public short getCategoryId() {
        return categoryId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public FilmCategory setFilmId(int filmId) {
        allColumnsDirty();
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public FilmCategory setCategoryId(short categoryId) {
        allColumnsDirty();
        this.categoryId = categoryId;
        return this;
    }
    
    @Override
    public FilmCategory setLastUpdate(Timestamp lastUpdate) {
        columnDirty(Identifier.LAST_UPDATE);
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Film findFilmId(Manager<Film> foreignManager) {
        return foreignManager.stream().filter(Film.FILM_ID.equal(getFilmId())).findAny().orElse(null);
    }
    
    @Override
    public Category findCategoryId(Manager<Category> foreignManager) {
        return foreignManager.stream().filter(Category.CATEGORY_ID.equal(getCategoryId())).findAny().orElse(null);
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
    public Stream<ColumnIdentifier<FilmCategory>> dirtyColumns() {
        return dirtyColumns_ != null ? dirtyColumns_.stream().map(i -> i) : Stream.empty();
    }
    
    private String starForDirty(Identifier id) {
        return dirtyColumns_ != null && dirtyColumns_.contains(id) ? "*" : "";
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add(starForDirty(Identifier.FILM_ID) + "filmId = " +          Objects.toString(getFilmId()));
        sj.add(starForDirty(Identifier.CATEGORY_ID) + "categoryId = " +  Objects.toString(getCategoryId()));
        sj.add(starForDirty(Identifier.LAST_UPDATE) + "lastUpdate = " +  Objects.toString(getLastUpdate()));
        return "FilmCategoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmCategory)) { return false; }
        final FilmCategory thatFilmCategory = (FilmCategory)that;
        if (this.getFilmId() != thatFilmCategory.getFilmId()) { return false; }
        if (this.getCategoryId() != thatFilmCategory.getCategoryId()) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilmCategory.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Short.hashCode(getCategoryId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}