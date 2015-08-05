package com.ghca.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by lvg on 2014/8/28.
 */
@WebService
public interface IVMService {

    @WebMethod
    public void startProcess(String key, String params);

    @WebMethod
    public String getProcessDifine();

}
