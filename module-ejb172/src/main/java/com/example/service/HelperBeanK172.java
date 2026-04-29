package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK172 {

    @EJB
    private HelperBeanJ172 helperBeanJ172;

    public String identify() {
        return "HelperBeanK172";
    }
}
