package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL131 {

    @EJB
    private HelperBeanK131 helperBeanK131;

    public String identify() {
        return "HelperBeanL131";
    }
}
