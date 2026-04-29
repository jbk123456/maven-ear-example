package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK139 {

    @EJB
    private HelperBeanJ139 helperBeanJ139;

    public String identify() {
        return "HelperBeanK139";
    }
}
