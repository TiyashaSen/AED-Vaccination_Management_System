/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.WorkQueue;

import Vaccination.UserAccount.UserAcc;
import java.util.Date;

/**
 *
 * @author tiyashasen
 */
public abstract class WorkRequest {

    private String message;
    private UserAcc provider;
    private UserAcc receiver;
    private String status;
    private Date reqDate;
    private Date resolveDate;

    public WorkRequest() {
        reqDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAcc getEndUser() {
        return provider;
    }

    public void setEndUser(UserAcc sender) {
        this.provider = sender;
    }

    public UserAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAcc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date requestDate) {
        this.reqDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
