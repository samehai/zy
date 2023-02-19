package com.zy.oms.pojo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "SUBPHK")
public class Subphk {
    @EmbeddedId
    private SubphkId id;

    @Column(name = "HH", nullable = false, length = 30)
    private String hh;

    @Column(name = "PH", nullable = false, length = 30)
    private String ph;

    @Column(name = "STOCKID", nullable = false, length = 30)
    private String stockid;

    @Column(name = "SL", precision = 18, scale = 6)
    private BigDecimal sl;

    @Column(name = "XQ")
    private Instant xq;

    @Column(name = "JHDJ", precision = 18, scale = 8)
    private BigDecimal jhdj;

    @Column(name = "SCRQ")
    private Instant scrq;

    @Column(name = "YHRQ")
    private Instant yhrq;

    @Column(name = "SPBZ")
    private Integer spbz;

    @Column(name = "QCKC", precision = 18, scale = 6)
    private BigDecimal qckc;

    @Column(name = "SUPPLIERCODE", length = 50)
    private String suppliercode;

    @Column(name = "SENDERORGCODE", length = 50)
    private String senderorgcode;

    @Column(name = "JHSL", precision = 18, scale = 6)
    private BigDecimal jhsl;

    @Column(name = "XHSL", precision = 18, scale = 6)
    private BigDecimal xhsl;

    @Column(name = "BRSL", precision = 18, scale = 6)
    private BigDecimal brsl;

    @Column(name = "BCSL", precision = 18, scale = 6)
    private BigDecimal bcsl;

    @Column(name = "QTSRSL", precision = 18, scale = 6)
    private BigDecimal qtsrsl;

    @Column(name = "QTFCSL", precision = 18, scale = 6)
    private BigDecimal qtfcsl;

    @Column(name = "THSL", precision = 18, scale = 6)
    private BigDecimal thsl;

    @Column(name = "XH", length = 30)
    private String xh;

    @Column(name = "SELLPRICE", precision = 18, scale = 6)
    private BigDecimal sellprice;

    @Column(name = "KH", length = 30)
    private String kh;

    @Column(name = "REJECTFLAG")
    private Integer rejectflag;

    @Column(name = "TM", length = 30)
    private String tm;

    @Column(name = "HEADBATCHNUMBER", length = 50)
    private String headbatchnumber;

    @Column(name = "LASTPURCHASEPRICE", precision = 18, scale = 6)
    private BigDecimal lastpurchaseprice;

    @Column(name = "YXQ", length = 50)
    private String yxq;

    @Column(name = "HYJ", precision = 18, scale = 6)
    private BigDecimal hyj;

    @Column(name = "LOCKNUMBER", precision = 18, scale = 6)
    private BigDecimal locknumber;

    @Column(name = "NOTSALEREASON", length = 200)
    private String notsalereason;

    @Column(name = "UNELIGIBILITYQUANTITY", precision = 18, scale = 6)
    private BigDecimal uneligibilityquantity;

    @Column(name = "STOCKTAXRATE", precision = 18, scale = 6)
    private BigDecimal stocktaxrate;

    @Column(name = "GUID", length = 50)
    private String guid;

    @Column(name = "NOTES", length = 200)
    private String notes;

    @Column(name = "DWBH", length = 50)
    private String dwbh;

    @Column(name = "ZBJHDJ", precision = 18, scale = 6)
    private BigDecimal zbjhdj;

    @Column(name = "ZBLASTPURCHASEPRICE", precision = 18, scale = 6)
    private BigDecimal zblastpurchaseprice;

    @Column(name = "ZBYHRQ")
    private Instant zbyhrq;

    @Column(name = "SCDW", length = 100)
    private String scdw;

    @Column(name = "CD", length = 500)
    private String cd;

    @Column(name = "BALANCEBASEPRICE", precision = 18, scale = 6)
    private BigDecimal balancebaseprice;

    @Column(name = "ISSTOPSELL")
    private Integer isstopsell;

    @Column(name = "CONVERSIONCONNECTION", precision = 18, scale = 6)
    private BigDecimal conversionconnection;

    @Column(name = "SPLITFRONTHH", length = 50)
    private String splitfronthh;

    @Column(name = "isdp", length = 10)
    private String isdp;

    public String getIsdp() {
        return isdp;
    }

    public void setIsdp(String isdp) {
        this.isdp = isdp;
    }

    public String getSplitfronthh() {
        return splitfronthh;
    }

    public void setSplitfronthh(String splitfronthh) {
        this.splitfronthh = splitfronthh;
    }

    public BigDecimal getConversionconnection() {
        return conversionconnection;
    }

    public void setConversionconnection(BigDecimal conversionconnection) {
        this.conversionconnection = conversionconnection;
    }

    public Integer getIsstopsell() {
        return isstopsell;
    }

    public void setIsstopsell(Integer isstopsell) {
        this.isstopsell = isstopsell;
    }

    public BigDecimal getBalancebaseprice() {
        return balancebaseprice;
    }

    public void setBalancebaseprice(BigDecimal balancebaseprice) {
        this.balancebaseprice = balancebaseprice;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getScdw() {
        return scdw;
    }

    public void setScdw(String scdw) {
        this.scdw = scdw;
    }

    public Instant getZbyhrq() {
        return zbyhrq;
    }

    public void setZbyhrq(Instant zbyhrq) {
        this.zbyhrq = zbyhrq;
    }

    public BigDecimal getZblastpurchaseprice() {
        return zblastpurchaseprice;
    }

    public void setZblastpurchaseprice(BigDecimal zblastpurchaseprice) {
        this.zblastpurchaseprice = zblastpurchaseprice;
    }

    public BigDecimal getZbjhdj() {
        return zbjhdj;
    }

    public void setZbjhdj(BigDecimal zbjhdj) {
        this.zbjhdj = zbjhdj;
    }

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public BigDecimal getStocktaxrate() {
        return stocktaxrate;
    }

    public void setStocktaxrate(BigDecimal stocktaxrate) {
        this.stocktaxrate = stocktaxrate;
    }

    public BigDecimal getUneligibilityquantity() {
        return uneligibilityquantity;
    }

    public void setUneligibilityquantity(BigDecimal uneligibilityquantity) {
        this.uneligibilityquantity = uneligibilityquantity;
    }

    public String getNotsalereason() {
        return notsalereason;
    }

    public void setNotsalereason(String notsalereason) {
        this.notsalereason = notsalereason;
    }

    public BigDecimal getLocknumber() {
        return locknumber;
    }

    public void setLocknumber(BigDecimal locknumber) {
        this.locknumber = locknumber;
    }

    public BigDecimal getHyj() {
        return hyj;
    }

    public void setHyj(BigDecimal hyj) {
        this.hyj = hyj;
    }

    public String getYxq() {
        return yxq;
    }

    public void setYxq(String yxq) {
        this.yxq = yxq;
    }

    public BigDecimal getLastpurchaseprice() {
        return lastpurchaseprice;
    }

    public void setLastpurchaseprice(BigDecimal lastpurchaseprice) {
        this.lastpurchaseprice = lastpurchaseprice;
    }

    public String getHeadbatchnumber() {
        return headbatchnumber;
    }

    public void setHeadbatchnumber(String headbatchnumber) {
        this.headbatchnumber = headbatchnumber;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public Integer getRejectflag() {
        return rejectflag;
    }

    public void setRejectflag(Integer rejectflag) {
        this.rejectflag = rejectflag;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public BigDecimal getThsl() {
        return thsl;
    }

    public void setThsl(BigDecimal thsl) {
        this.thsl = thsl;
    }

    public BigDecimal getQtfcsl() {
        return qtfcsl;
    }

    public void setQtfcsl(BigDecimal qtfcsl) {
        this.qtfcsl = qtfcsl;
    }

    public BigDecimal getQtsrsl() {
        return qtsrsl;
    }

    public void setQtsrsl(BigDecimal qtsrsl) {
        this.qtsrsl = qtsrsl;
    }

    public BigDecimal getBcsl() {
        return bcsl;
    }

    public void setBcsl(BigDecimal bcsl) {
        this.bcsl = bcsl;
    }

    public BigDecimal getBrsl() {
        return brsl;
    }

    public void setBrsl(BigDecimal brsl) {
        this.brsl = brsl;
    }

    public BigDecimal getXhsl() {
        return xhsl;
    }

    public void setXhsl(BigDecimal xhsl) {
        this.xhsl = xhsl;
    }

    public BigDecimal getJhsl() {
        return jhsl;
    }

    public void setJhsl(BigDecimal jhsl) {
        this.jhsl = jhsl;
    }

    public String getSenderorgcode() {
        return senderorgcode;
    }

    public void setSenderorgcode(String senderorgcode) {
        this.senderorgcode = senderorgcode;
    }

    public String getSuppliercode() {
        return suppliercode;
    }

    public void setSuppliercode(String suppliercode) {
        this.suppliercode = suppliercode;
    }

    public BigDecimal getQckc() {
        return qckc;
    }

    public void setQckc(BigDecimal qckc) {
        this.qckc = qckc;
    }

    public Integer getSpbz() {
        return spbz;
    }

    public void setSpbz(Integer spbz) {
        this.spbz = spbz;
    }

    public Instant getYhrq() {
        return yhrq;
    }

    public void setYhrq(Instant yhrq) {
        this.yhrq = yhrq;
    }

    public Instant getScrq() {
        return scrq;
    }

    public void setScrq(Instant scrq) {
        this.scrq = scrq;
    }

    public BigDecimal getJhdj() {
        return jhdj;
    }

    public void setJhdj(BigDecimal jhdj) {
        this.jhdj = jhdj;
    }

    public Instant getXq() {
        return xq;
    }

    public void setXq(Instant xq) {
        this.xq = xq;
    }

    public BigDecimal getSl() {
        return sl;
    }

    public void setSl(BigDecimal sl) {
        this.sl = sl;
    }

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public SubphkId getId() {
        return id;
    }

    public void setId(SubphkId id) {
        this.id = id;
    }
}