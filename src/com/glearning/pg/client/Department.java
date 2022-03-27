package com.glearning.pg.client;
import com.glearning.pg.model.Admin;
import com.glearning.pg.model.HR;
import com.glearning.pg.model.Tech;
import com.glearning.pg.service.Department_information;


public class Department {
    public static void main(String args[])
    {
        /** Creating the objects for each department - Admin, HR, Tech
         *
         */
        Admin admin = new Admin();
        HR hr = new HR();
        Tech tech = new Tech();

        /* pass objects to retrieve each depaertment information
         */
        Department_information show_Dep = new Department_information();
        show_Dep.Admin(admin);
        show_Dep.HR(hr);
        show_Dep.Tech(tech);
    }
}
