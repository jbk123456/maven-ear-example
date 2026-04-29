package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL147 {

    @EJB
    private HelperBeanK147 helperBeanK147;

    public String identify() {
        return "HelperBeanL147";
    }
}
