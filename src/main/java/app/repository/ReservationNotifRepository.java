package app.repository;

import app.domain.ReservationNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationNotifRepository extends JpaRepository<ReservationNotification, Long> {
}