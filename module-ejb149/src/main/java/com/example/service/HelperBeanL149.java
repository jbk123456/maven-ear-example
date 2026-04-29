package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL149 {

    @EJB
    private HelperBeanK149 helperBeanK149;

    public String identify() {
        return "HelperBeanL149";
    }
}
