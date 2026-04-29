package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK143 {

    @EJB
    private HelperBeanJ143 helperBeanJ143;

    public String identify() {
        return "HelperBeanK143";
    }
}
