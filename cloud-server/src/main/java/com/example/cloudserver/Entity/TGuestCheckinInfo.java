package com.example.cloudserver.Entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cjw
 * @since 2018-10-12
 */
public class TGuestCheckinInfo{

    private static final long serialVersionUID = 1L;

    private String checkinsn;
    private String gasthausid;
    private Date checkintime;
    private String name;
    private String sexid;
    private Date birthdate;
    private String papertypeid;
    private String paperid;
    private String cityid;
    private String address;
    private String roomid;
    private String checkinmodeid;
    private String checkintypeid;
    private String deposit;
    private String balance;
    private String teamid;
    private Date canceltime;
    private Date carrytime;
    private String username;
    private String uploaded;
    private String hadcar;
    private String carno;
    private String down;
    private String downloaded;
    private String validate1;
    private String validate2;
    private String is2ndcard;
    private String authority;
    private String guesttype;
    private String semblance;
    private String faceresult;
    private String txzhm;
    private String qfcs;


    public String getCheckinsn() {
        return checkinsn;
    }

    public void setCheckinsn(String checkinsn) {
        this.checkinsn = checkinsn;
    }

    public String getGasthausid() {
        return gasthausid;
    }

    public void setGasthausid(String gasthausid) {
        this.gasthausid = gasthausid;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexid() {
        return sexid;
    }

    public void setSexid(String sexid) {
        this.sexid = sexid;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPapertypeid() {
        return papertypeid;
    }

    public void setPapertypeid(String papertypeid) {
        this.papertypeid = papertypeid;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getCheckinmodeid() {
        return checkinmodeid;
    }

    public void setCheckinmodeid(String checkinmodeid) {
        this.checkinmodeid = checkinmodeid;
    }

    public String getCheckintypeid() {
        return checkintypeid;
    }

    public void setCheckintypeid(String checkintypeid) {
        this.checkintypeid = checkintypeid;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public Date getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    public Date getCarrytime() {
        return carrytime;
    }

    public void setCarrytime(Date carrytime) {
        this.carrytime = carrytime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getHadcar() {
        return hadcar;
    }

    public void setHadcar(String hadcar) {
        this.hadcar = hadcar;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(String downloaded) {
        this.downloaded = downloaded;
    }

    public String getValidate1() {
        return validate1;
    }

    public void setValidate1(String validate1) {
        this.validate1 = validate1;
    }

    public String getValidate2() {
        return validate2;
    }

    public void setValidate2(String validate2) {
        this.validate2 = validate2;
    }

    public String getIs2ndcard() {
        return is2ndcard;
    }

    public void setIs2ndcard(String is2ndcard) {
        this.is2ndcard = is2ndcard;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getGuesttype() {
        return guesttype;
    }

    public void setGuesttype(String guesttype) {
        this.guesttype = guesttype;
    }

    public String getSemblance() {
        return semblance;
    }

    public void setSemblance(String semblance) {
        this.semblance = semblance;
    }

    public String getFaceresult() {
        return faceresult;
    }

    public void setFaceresult(String faceresult) {
        this.faceresult = faceresult;
    }

    public String getTxzhm() {
        return txzhm;
    }

    public void setTxzhm(String txzhm) {
        this.txzhm = txzhm;
    }

    public String getQfcs() {
        return qfcs;
    }

    public void setQfcs(String qfcs) {
        this.qfcs = qfcs;
    }

    public String getPaperid() {
        return paperid;
    }

    public void setPaperid(String paperid) {
        this.paperid=paperid;
    }

    @Override
    public String toString() {
        return "TGuestCheckinInfo{" +
        ", checkinsn=" + checkinsn +
        ", gasthausid=" + gasthausid +
        ", checkintime=" + checkintime +
        ", name=" + name +
        ", sexid=" + sexid +
        ", birthdate=" + birthdate +
        ", papertypeid=" + papertypeid +
        ", cityid=" + cityid +
        ", address=" + address +
        ", roomid=" + roomid +
        ", checkinmodeid=" + checkinmodeid +
        ", checkintypeid=" + checkintypeid +
        ", deposit=" + deposit +
        ", balance=" + balance +
        ", paperid=" + paperid +
        ", teamid=" + teamid +
        ", canceltime=" + canceltime +
        ", carrytime=" + carrytime +
        ", username=" + username +
        ", uploaded=" + uploaded +
        ", hadcar=" + hadcar +
        ", carno=" + carno +
        ", down=" + down +
        ", downloaded=" + downloaded +
        ", validate1=" + validate1 +
        ", validate2=" + validate2 +
        ", is2ndcard=" + is2ndcard +
        ", authority=" + authority +
        ", guesttype=" + guesttype +
        ", semblance=" + semblance +
        ", faceresult=" + faceresult +
        ", txzhm=" + txzhm +
        ", qfcs=" + qfcs +
        "}";
    }
}
