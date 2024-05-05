package com.example.MatchBooking.repositories;

import com.example.MatchBooking.domain.FieldType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldTypeRepository extends JpaRepository<FieldType,String> {
}
