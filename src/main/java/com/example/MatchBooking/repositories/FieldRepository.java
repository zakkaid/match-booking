package com.example.MatchBooking.repositories;

import com.example.MatchBooking.domain.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FieldRepository extends JpaRepository<Field,String> {
    @Query("select f from Field f where f not in" +
            " (select r.fieldReserved from Reservation r where :time between r.matchEndAt and r.matchEndAt)")
    List<Field> findAllAvailableFields(LocalDateTime time);


}
