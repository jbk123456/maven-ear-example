package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK51 {

    @EJB
    private HelperBeanJ51 helperBeanJ51;

    public String identify() {
        return "HelperBeanK51";
    }
}
