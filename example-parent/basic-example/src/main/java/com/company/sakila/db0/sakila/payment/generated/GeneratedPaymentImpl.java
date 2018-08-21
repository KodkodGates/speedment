package com.company.sakila.db0.sakila.payment.generated;

import com.company.sakila.db0.sakila.customer.Customer;
import com.company.sakila.db0.sakila.payment.Payment;
import com.company.sakila.db0.sakila.rental.Rental;
import com.company.sakila.db0.sakila.staff.Staff;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.trait.HasDirtyColumns;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.payment.Payment}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPaymentImpl implements HasDirtyColumns<Payment>, Payment {
    
    private final static Set<Identifier> DISABLED_MODIFICATION_TRACKING = Collections.emptySet();
    private int paymentId;
    private int customerId;
    private short staffId;
    private Integer rentalId;
    private BigDecimal amount;
    private Timestamp paymentDate;
    private Timestamp lastUpdate;
    private Set<Identifier> dirtyColumns_;
    
    protected GeneratedPaymentImpl() {}
    
    @Override
    public int getPaymentId() {
        return paymentId;
    }
    
    @Override
    public int getCustomerId() {
        return customerId;
    }
    
    @Override
    public short getStaffId() {
        return staffId;
    }
    
    @Override
    public OptionalInt getRentalId() {
        return OptionalUtil.ofNullable(rentalId);
    }
    
    @Override
    public BigDecimal getAmount() {
        return amount;
    }
    
    @Override
    public Timestamp getPaymentDate() {
        return paymentDate;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Payment setPaymentId(int paymentId) {
        allColumnsDirty();
        this.paymentId = paymentId;
        return this;
    }
    
    @Override
    public Payment setCustomerId(int customerId) {
        columnDirty(Identifier.CUSTOMER_ID);
        this.customerId = customerId;
        return this;
    }
    
    @Override
    public Payment setStaffId(short staffId) {
        columnDirty(Identifier.STAFF_ID);
        this.staffId = staffId;
        return this;
    }
    
    @Override
    public Payment setRentalId(Integer rentalId) {
        columnDirty(Identifier.RENTAL_ID);
        this.rentalId = rentalId;
        return this;
    }
    
    @Override
    public Payment setAmount(BigDecimal amount) {
        columnDirty(Identifier.AMOUNT);
        this.amount = amount;
        return this;
    }
    
    @Override
    public Payment setPaymentDate(Timestamp paymentDate) {
        columnDirty(Identifier.PAYMENT_DATE);
        this.paymentDate = paymentDate;
        return this;
    }
    
    @Override
    public Payment setLastUpdate(Timestamp lastUpdate) {
        columnDirty(Identifier.LAST_UPDATE);
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Customer findCustomerId(Manager<Customer> foreignManager) {
        return foreignManager.stream().filter(Customer.CUSTOMER_ID.equal(getCustomerId())).findAny().orElse(null);
    }
    
    @Override
    public Staff findStaffId(Manager<Staff> foreignManager) {
        return foreignManager.stream().filter(Staff.STAFF_ID.equal(getStaffId())).findAny().orElse(null);
    }
    
    @Override
    public Optional<Rental> findRentalId(Manager<Rental> foreignManager) {
        if (getRentalId().isPresent()) {
            return foreignManager.stream().filter(Rental.RENTAL_ID.equal(getRentalId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
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
    public Stream<ColumnIdentifier<Payment>> dirtyColumns() {
        return dirtyColumns_ != null ? dirtyColumns_.stream().map(i -> i) : Stream.empty();
    }
    
    private String starForDirty(Identifier id) {
        return dirtyColumns_ != null && dirtyColumns_.contains(id) ? "*" : "";
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add(starForDirty(Identifier.PAYMENT_ID) + "paymentId = " +      Objects.toString(getPaymentId()));
        sj.add(starForDirty(Identifier.CUSTOMER_ID) + "customerId = " +    Objects.toString(getCustomerId()));
        sj.add(starForDirty(Identifier.STAFF_ID) + "staffId = " +          Objects.toString(getStaffId()));
        sj.add(starForDirty(Identifier.RENTAL_ID) + "rentalId = " +        Objects.toString(OptionalUtil.unwrap(getRentalId())));
        sj.add(starForDirty(Identifier.AMOUNT) + "amount = " +             Objects.toString(getAmount()));
        sj.add(starForDirty(Identifier.PAYMENT_DATE) + "paymentDate = " +  Objects.toString(getPaymentDate()));
        sj.add(starForDirty(Identifier.LAST_UPDATE) + "lastUpdate = " +    Objects.toString(getLastUpdate()));
        return "PaymentImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Payment)) { return false; }
        final Payment thatPayment = (Payment)that;
        if (this.getPaymentId() != thatPayment.getPaymentId()) { return false; }
        if (this.getCustomerId() != thatPayment.getCustomerId()) { return false; }
        if (this.getStaffId() != thatPayment.getStaffId()) { return false; }
        if (!Objects.equals(this.getRentalId(), thatPayment.getRentalId())) { return false; }
        if (!Objects.equals(this.getAmount(), thatPayment.getAmount())) { return false; }
        if (!Objects.equals(this.getPaymentDate(), thatPayment.getPaymentDate())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatPayment.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getPaymentId());
        hash = 31 * hash + Integer.hashCode(getCustomerId());
        hash = 31 * hash + Short.hashCode(getStaffId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRentalId()));
        hash = 31 * hash + Objects.hashCode(getAmount());
        hash = 31 * hash + Objects.hashCode(getPaymentDate());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}