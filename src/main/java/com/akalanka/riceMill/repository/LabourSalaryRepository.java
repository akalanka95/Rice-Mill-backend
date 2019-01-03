package com.akalanka.riceMill.repository;

import com.akalanka.riceMill.model.LabourSalary;
import com.akalanka.riceMill.model.LabourSalaryToPaid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LabourSalaryRepository extends JpaRepository<LabourSalary,Integer>{

    Iterable<LabourSalary> findByLabour_Id(@Param("labourId") Integer labourId);

    /*@Modifying
    @Query("UPDATE Attendance c SET c.monday = :actives")
    void updateMonday(@Param("actives") boolean actives);*/

    //Iterable<Labour> findById(@Param("couId") Integer couId);
}
