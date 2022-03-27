package com.glearning.pg.model;

/* Creating the class and methods for Super Dep */
/* The Super class can be kept as Abstract as well since it's being inherited by other classes */
/* in this case, since there're some methods of Super Class that return a String, we are keeping as non-abstract
as abstract classes cannot be instantiated
 */
public class Super {

    /** Defining the methods of Super Class
     *  This is a Super Class and it's going to be inherited by other classes.
     */
    public String departmentName()
    {
        return "Super Department";
    }
    public String getTodaysWork()
    {
        return "No Work as of now";
    }
    public String getWorkDeadline()
    {
        return "Nil";
    }
    public String isTodayAHoliday()
    {
        return "Today is not a holiday";
    }
}
