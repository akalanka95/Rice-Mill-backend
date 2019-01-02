package com.akalanka.riceMill.repository;

import com.akalanka.riceMill.model.DailyExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyExpenseRepository extends JpaRepository<DailyExpense , Integer> {

}
