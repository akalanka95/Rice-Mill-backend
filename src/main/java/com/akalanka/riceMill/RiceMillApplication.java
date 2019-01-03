package com.akalanka.riceMill;

import com.akalanka.riceMill.model.DailyExpense;
import com.akalanka.riceMill.model.Labour;
import com.akalanka.riceMill.model.LabourSalary;
import com.akalanka.riceMill.model.LabourSalaryToPaid;
import com.akalanka.riceMill.repository.DailyExpenseRepository;
import com.akalanka.riceMill.repository.LabourRepository;
import com.akalanka.riceMill.repository.LabourSalaryRepository;
import com.akalanka.riceMill.repository.LabourSalaryToPaidRepository;
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
    @Autowired
    private LabourSalaryToPaidRepository labourSalaryToPaidRepository;

	public static void main(String[] args) {
		SpringApplication.run(RiceMillApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Labour l1 = new Labour();
		l1.setId(2);
		l1.setAddress("horana");
		l1.setCode("123");
		l1.setName("akalanka");
		l1.setContact1("098");
		labourRepository.save(l1);

        Labour l2 = new Labour();
        l2.setId(3);
        l2.setAddress("horana");
        l2.setCode("123");
        l2.setName("akalanka123");
        l2.setContact1("098");
        labourRepository.save(l2);

        Labour l3 = new Labour();
        l3.setId(4);
        l3.setAddress("horana");
        l3.setCode("123");
        l3.setName("akalanka123334");
        l3.setContact1("098");
        labourRepository.save(l3);

        Labour l4 = new Labour();
        l4.setId(5);
        l4.setAddress("horana");
        l4.setCode("123");
        l4.setName("akalanka123334");
        l4.setContact1("098");
        labourRepository.save(l4);

        Labour l5 = new Labour();
        l5.setId(6);
        l5.setAddress("horana");
        l5.setCode("123");
        l5.setName("akalanka123334");
        l5.setContact1("098");
        labourRepository.save(l5);

        Labour l6 = new Labour();
        l6.setId(7);
        l6.setAddress("horana");
        l6.setCode("123");
        l6.setName("akalanka123334");
        l6.setContact1("098");
        labourRepository.save(l6);

        Labour l7 = new Labour();
        l7.setId(8);
        l7.setAddress("horana");
        l7.setCode("123");
        l7.setName("akalanka123334");
        l7.setContact1("098");
        labourRepository.save(l7);

		LabourSalary l1s = new LabourSalary();
		// l1s.setId(1);
		l1s.setSalary(0);
		l1s.setAdvance(0);
		//l1s.setAmountTopaid(12345);
		l1s.setLabour(l1);
		labourSalaryRepository.save(l1s);

		DailyExpense d1 = new DailyExpense();
		d1.setCode("123");
		d1.setExpense(1234);
		d1.setIncome(1678);
		d1.setName("akala");
		d1.setType("donation");
		//d1.setDate(new Date(2018,01,20));
        d1.setDate("23/34/56");
		dailyExpenseRepository.save(d1);

        LabourSalaryToPaid ls1 = new LabourSalaryToPaid();
        ls1.setId(1);
        ls1.setSalary(0);
        ls1.setAdvance(0);
        ls1.setAmountTopaid(0);
        ls1.setLabour(l1);
        labourSalaryToPaidRepository.save(ls1);
	}

}

