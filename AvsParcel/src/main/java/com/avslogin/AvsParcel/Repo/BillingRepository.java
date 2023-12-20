package com.avslogin.AvsParcel.Repo;

import com.avslogin.AvsParcel.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

    Optional<Billing> findByBillingId(long billingId);


    List<Billing> findAllByPaymentTypeIn(Set<String> paymentTypes);
    List<Billing> findByCreatedAtBetween(LocalDateTime fromDate, LocalDateTime toDate);


}
