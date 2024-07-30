/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtb.occupier;

import java.util.Date;


/**
 *
 * @author INDIA
 */
public class userLogoutTime {
    private String lid, mailid;
    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }
    Date login,logout;
    
    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public Date getLogin() {
        return login;
    }

    public void setLogin(Date Login) {
        this.login = Login;
    }

    public Date getLogout() {
        return logout;
    }

    public void setLogout(Date Logout) {
        this.logout = Logout;
    }
 
}
