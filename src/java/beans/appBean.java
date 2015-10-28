/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import util.MyUtil;

/**
 *
 * @author lude
 */
@ManagedBean
@ApplicationScoped
public class appBean {

    public appBean() {
    }

    public String getBaseUrl()
    {
        return MyUtil.baseurl();
    }
    public String getBasePath()
    {
        return MyUtil.basepath();
    }
}