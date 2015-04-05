package com.ukrtechzviaz.ua.dto;

import com.ukrtechzviaz.ua.model.TupRemonty;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by andrey on 05.04.15.
 */
public class ZagalniDaniDto {

    @NotEmpty
    String protectType;

    @NotEmpty
    private String geografichnaPriviazhka;

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date startEcspl;

    @NotEmpty
    private String projectOrganization;

    @NotEmpty
    private String bmOrganization;

    @NotEmpty
    private String zemlekorustyvach;

    public ZagalniDaniDto() {
    }

    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public String getGeografichnaPriviazhka() {
        return geografichnaPriviazhka;
    }

    public void setGeografichnaPriviazhka(String geografichnaPriviazhka) {
        this.geografichnaPriviazhka = geografichnaPriviazhka;
    }

    public Date getStartEcspl() {
        return startEcspl;
    }

    public void setStartEcspl(Date startEcspl) {
        this.startEcspl = startEcspl;
    }

    public String getProjectOrganization() {
        return projectOrganization;
    }

    public void setProjectOrganization(String projectOrganization) {
        this.projectOrganization = projectOrganization;
    }

    public String getBmOrganization() {
        return bmOrganization;
    }

    public void setBmOrganization(String bmOrganization) {
        this.bmOrganization = bmOrganization;
    }

    public String getZemlekorustyvach() {
        return zemlekorustyvach;
    }

    public void setZemlekorustyvach(String zemlekorustyvach) {
        this.zemlekorustyvach = zemlekorustyvach;
    }
}
