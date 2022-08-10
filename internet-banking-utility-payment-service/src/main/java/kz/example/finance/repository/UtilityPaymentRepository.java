package kz.example.finance.repository;

import kz.example.finance.model.dto.UtilityPayment;
import kz.example.finance.model.entity.UtilityPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
