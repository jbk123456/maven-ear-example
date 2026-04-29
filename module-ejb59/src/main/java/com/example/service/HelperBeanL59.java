package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL59 {

    @EJB
    private HelperBeanK59 helperBeanK59;

    public String identify() {
        return "HelperBeanL59";
    }
}
