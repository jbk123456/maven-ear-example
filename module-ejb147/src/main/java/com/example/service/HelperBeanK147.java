package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK147 {

    @EJB
    private HelperBeanJ147 helperBeanJ147;

    public String identify() {
        return "HelperBeanK147";
    }
}
