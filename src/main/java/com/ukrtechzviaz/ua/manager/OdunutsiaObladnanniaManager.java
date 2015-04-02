package com.ukrtechzviaz.ua.manager;

/**
 * Created by andrey on 02.04.15.
 */
public interface OdunutsiaObladnanniaManager {

    void add(String tupPeretvoriuvacha, String vurobnuk, int zavodskuiNomer, String konstr_anodnogo_zahusty, int ktElectrodiv, int vidstanGazoprovody, int vidstanDoUKZ, int dovzhunaAnodnogoPolia, int opirRoztikanniy, int putOpirGrynty);

    void change(int id, String tupPeretvoriuvacha, String vurobnuk, int zavodskuiNomer, String konstr_anodnogo_zahusty, int ktElectrodiv, int vidstanGazoprovody, int vidstanDoUKZ, int dovzhunaAnodnogoPolia, int opirRoztikanniy, int putOpirGrynty);
}
