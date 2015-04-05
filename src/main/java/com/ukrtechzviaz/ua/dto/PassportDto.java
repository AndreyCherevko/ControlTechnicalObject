package com.ukrtechzviaz.ua.dto;

import com.ukrtechzviaz.ua.model.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by andrey on 04.04.15.
 */
public class PassportDto {

    @NotNull
    private NazvuKompanii companyName;

    @NotNull
    private NazvuFilii filialName;

    @NotEmpty
    private String pidrozdilName;

    @NotEmpty
    private String gazoprovidName;

    @Min(value = 0)
    private int kmGazoprovid;

    @NotEmpty
    private String misto;

    @NotNull
    private Integer anod;

    @NotNull
    private Integer katod;


    public PassportDto() {
    }

    public NazvuKompanii getCompanyName() {
        return companyName;
    }

    public void setCompanyName(NazvuKompanii companyName) {
        this.companyName = companyName;
    }

    public NazvuFilii getFilialName() {
        return filialName;
    }

    public void setFilialName(NazvuFilii filialName) {
        this.filialName = filialName;
    }

    public String getPidrozdilName() {
        return pidrozdilName;
    }

    public void setPidrozdilName(String pidrozdilName) {
        this.pidrozdilName = pidrozdilName;
    }

    public String getGazoprovidName() {
        return gazoprovidName;
    }

    public void setGazoprovidName(String gazoprovidName) {
        this.gazoprovidName = gazoprovidName;
    }

    public int getKmGazoprovid() {
        return kmGazoprovid;
    }

    public void setKmGazoprovid(int kmGazoprovid) {
        this.kmGazoprovid = kmGazoprovid;
    }

    public String getMisto() {
        return misto;
    }

    public void setMisto(String misto) {
        this.misto = misto;
    }

    public Integer getAnod() {
        return anod;
    }

    public void setAnod(Integer anod) {
        this.anod = anod;
    }

    public Integer getKatod() {
        return katod;
    }

    public void setKatod(Integer katod) {
        this.katod = katod;
    }
}
