package com.aurionpro.model;

import java.time.LocalDate;
import java.time.Period;


public class HR {
    public boolean isPromotionDue(Employee e) {
        Period period = Period.between(e.getDoj(), LocalDate.now());
        if (period.getYears() > 5 && e.getSalary() < 50000) {
            return true;
        }
        return false;
    }
}
