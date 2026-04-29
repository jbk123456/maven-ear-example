package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ172 {

    @EJB
    private HelperBeanI172 helperBeanI172;

    public String identify() {
        return "HelperBeanJ172";
    }
}
