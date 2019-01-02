package com.akalanka.riceMill;

import com.akalanka.riceMill.model.DailyExpense;
import com.akalanka.riceMill.model.Labour;
import com.akalanka.riceMill.model.LabourSalary;
import com.akalanka.riceMill.repository.DailyExpenseRepository;
import com.akalanka.riceMill.repository.LabourRepository;
import com.akalanka.riceMill.repository.LabourSalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class RiceMillApplication implements CommandLineRunner {
	@Autowired
	private LabourRepository labourRepository;
	@Autowired
	private LabourSalaryRepository labourSalaryRepository;
	@Autowired
    private DailyExpenseRepository dailyExpenseRepository;

	public static void main(String[] args) {
		SpringApplication.run(RiceMillApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Labour l1 = new Labour();
		//l1.setId(2);
		l1.setAddress("horana");
		l1.setCode("123");
		l1.setFullName("akalanka");
		l1.setTelNumber("098");
		labourRepository.save(l1);

		LabourSalary l1s = new LabourSalary();
		//l1s.setId(1);
		l1s.setSalary(1234);
		l1s.setAdvance(12);
		l1s.setAmountTopaid(12345);
		l1s.setLabour(l1);
		labourSalaryRepository.save(l1s);*/

		DailyExpense d1 = new DailyExpense();
		d1.setCode("123");
		d1.setExpense(1234);
		d1.setIncome(1678);
		d1.setName("akala");
		d1.setType("donation");
		//d1.setDate(new Date(2018,01,20));
        d1.setDate("23/34/56");
		dailyExpenseRepository.save(d1);

	}

}

