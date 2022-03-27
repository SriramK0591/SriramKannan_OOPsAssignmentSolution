package com.glearning.pg.service;

import com.glearning.pg.model.Admin;
import com.glearning.pg.model.HR;
import com.glearning.pg.model.Tech;

/* Creating the Department class to isolate and provide a single class for
* displaying each department information*/
public class Department_information
{
    public void Admin(Admin admin)
    {
        System.out.println("**************************");
        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        System.out.println("\n");
    }
    public void HR(HR hr)
    {
        System.out.println("**************************");
        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        System.out.println("\n");
    }
    public void Tech(Tech tech)
    {
        System.out.println("************************");
        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
        System.out.println("\n");
    }
}
