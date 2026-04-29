package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ139 {

    @EJB
    private HelperBeanI139 helperBeanI139;

    public String identify() {
        return "HelperBeanJ139";
    }
}
