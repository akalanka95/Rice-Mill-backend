package com.akalanka.riceMill.repository;

import com.akalanka.riceMill.model.Labour;
import com.akalanka.riceMill.model.LabourSalaryToPaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LabourSalaryToPaidRepository extends JpaRepository<LabourSalaryToPaid , Integer> {
    LabourSalaryToPaid findByLabour_Id(@Param("labourId") Integer labourId);
}
