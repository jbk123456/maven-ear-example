package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK153 {

    @EJB
    private HelperBeanJ153 helperBeanJ153;

    public String identify() {
        return "HelperBeanK153";
    }
}
