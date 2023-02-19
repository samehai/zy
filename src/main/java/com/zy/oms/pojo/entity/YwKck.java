package com.zy.oms.pojo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "YW_KCK")
//@Data
public class YwKck {

    @Column(name = "LB", nullable = false)
    private String lb;

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getPdw() {
        return pdw;
    }

    public void setPdw(String pdw) {
        this.pdw = pdw;
    }

    public String getLdw() {
        return ldw;
    }

    public void setLdw(String ldw) {
        this.ldw = ldw;
    }

    public BigDecimal getMjl() {
        return mjl;
    }

    public void setMjl(BigDecimal mjl) {
        this.mjl = mjl;
    }

    public String getMjzl() {
        return mjzl;
    }

    public void setMjzl(String mjzl) {
        this.mjzl = mjzl;
    }

    public BigDecimal getJj() {
        return jj;
    }

    public void setJj(BigDecimal jj) {
        this.jj = jj;
    }

    public BigDecimal getJjCkj() {
        return jjCkj;
    }

    public void setJjCkj(BigDecimal jjCkj) {
        this.jjCkj = jjCkj;
    }

    public BigDecimal getCkj() {
        return ckj;
    }

    public void setCkj(BigDecimal ckj) {
        this.ckj = ckj;
    }

    public BigDecimal getPfj() {
        return pfj;
    }

    public void setPfj(BigDecimal pfj) {
        this.pfj = pfj;
    }

    public BigDecimal getLsj() {
        return lsj;
    }

    public void setLsj(BigDecimal lsj) {
        this.lsj = lsj;
    }

    public BigDecimal getCbj() {
        return cbj;
    }

    public void setCbj(BigDecimal cbj) {
        this.cbj = cbj;
    }

    public BigDecimal getYcbj() {
        return ycbj;
    }

    public void setYcbj(BigDecimal ycbj) {
        this.ycbj = ycbj;
    }

    public BigDecimal getQckc() {
        return qckc;
    }

    public void setQckc(BigDecimal qckc) {
        this.qckc = qckc;
    }

    public BigDecimal getSjsl() {
        return sjsl;
    }

    public void setSjsl(BigDecimal sjsl) {
        this.sjsl = sjsl;
    }

    public BigDecimal getXhsl() {
        return xhsl;
    }

    public void setXhsl(BigDecimal xhsl) {
        this.xhsl = xhsl;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public BigDecimal getJhsl() {
        return jhsl;
    }

    public void setJhsl(BigDecimal jhsl) {
        this.jhsl = jhsl;
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

    public BigDecimal getMaxSl() {
        return maxSl;
    }

    public void setMaxSl(BigDecimal maxSl) {
        this.maxSl = maxSl;
    }

    public BigDecimal getMinSl() {
        return minSl;
    }

    public void setMinSl(BigDecimal minSl) {
        this.minSl = minSl;
    }

    public Boolean getDyTag() {
        return dyTag;
    }

    public void setDyTag(Boolean dyTag) {
        this.dyTag = dyTag;
    }

    public Boolean getTjTag() {
        return tjTag;
    }

    public void setTjTag(Boolean tjTag) {
        this.tjTag = tjTag;
    }

    public Boolean getHsTag() {
        return hsTag;
    }

    public void setHsTag(Boolean hsTag) {
        this.hsTag = hsTag;
    }

    public Boolean getCkjTag() {
        return ckjTag;
    }

    public void setCkjTag(Boolean ckjTag) {
        this.ckjTag = ckjTag;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public LocalDateTime getXqDate() {
        return xqDate;
    }

    public void setXqDate(LocalDateTime xqDate) {
        this.xqDate = xqDate;
    }

    public LocalDateTime getJhDate() {
        return jhDate;
    }

    public void setJhDate(LocalDateTime jhDate) {
        this.jhDate = jhDate;
    }

    public LocalDateTime getXhDate() {
        return xhDate;
    }

    public void setXhDate(LocalDateTime xhDate) {
        this.xhDate = xhDate;
    }

    public BigDecimal getPFJ1() {
        return PFJ1;
    }

    public void setPFJ1(BigDecimal PFJ1) {
        this.PFJ1 = PFJ1;
    }

    public BigDecimal getSj() {
        return sj;
    }

    public void setSj(BigDecimal sj) {
        this.sj = sj;
    }

    public BigDecimal getLsJj1() {
        return lsJj1;
    }

    public void setLsJj1(BigDecimal lsJj1) {
        this.lsJj1 = lsJj1;
    }

    public BigDecimal getLsJj2() {
        return lsJj2;
    }

    public void setLsJj2(BigDecimal lsJj2) {
        this.lsJj2 = lsJj2;
    }

    public BigDecimal getLsJj3() {
        return lsJj3;
    }

    public void setLsJj3(BigDecimal lsJj3) {
        this.lsJj3 = lsJj3;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public BigDecimal getZk() {
        return zk;
    }

    public void setZk(BigDecimal zk) {
        this.zk = zk;
    }

    public BigDecimal getZzsl() {
        return zzsl;
    }

    public void setZzsl(BigDecimal zzsl) {
        this.zzsl = zzsl;
    }

    public String getPmZjm() {
        return pmZjm;
    }

    public void setPmZjm(String pmZjm) {
        this.pmZjm = pmZjm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getHhTmp() {
        return hhTmp;
    }

    public void setHhTmp(String hhTmp) {
        this.hhTmp = hhTmp;
    }

    public BigDecimal getSjslLs() {
        return sjslLs;
    }

    public void setSjslLs(BigDecimal sjslLs) {
        this.sjslLs = sjslLs;
    }

    public BigDecimal getTCBL1() {
        return TCBL1;
    }

    public void setTCBL1(BigDecimal TCBL1) {
        this.TCBL1 = TCBL1;
    }

    public BigDecimal getTCBL2() {
        return TCBL2;
    }

    public void setTCBL2(BigDecimal TCBL2) {
        this.TCBL2 = TCBL2;
    }

    public BigDecimal getTCBL3() {
        return TCBL3;
    }

    public void setTCBL3(BigDecimal TCBL3) {
        this.TCBL3 = TCBL3;
    }

    public String getPH1() {
        return PH1;
    }

    public void setPH1(String PH1) {
        this.PH1 = PH1;
    }

    public String getPH2() {
        return PH2;
    }

    public void setPH2(String PH2) {
        this.PH2 = PH2;
    }

    public String getPH3() {
        return PH3;
    }

    public void setPH3(String PH3) {
        this.PH3 = PH3;
    }

    public BigDecimal getPh1Sl() {
        return ph1Sl;
    }

    public void setPh1Sl(BigDecimal ph1Sl) {
        this.ph1Sl = ph1Sl;
    }

    public BigDecimal getPh2Sl() {
        return ph2Sl;
    }

    public void setPh2Sl(BigDecimal ph2Sl) {
        this.ph2Sl = ph2Sl;
    }

    public BigDecimal getPh3Sl() {
        return ph3Sl;
    }

    public void setPh3Sl(BigDecimal ph3Sl) {
        this.ph3Sl = ph3Sl;
    }

    public BigDecimal getLSJ1() {
        return LSJ1;
    }

    public void setLSJ1(BigDecimal LSJ1) {
        this.LSJ1 = LSJ1;
    }

    public BigDecimal getBzsl() {
        return bzsl;
    }

    public void setBzsl(BigDecimal bzsl) {
        this.bzsl = bzsl;
    }

    public BigDecimal getSJ1() {
        return SJ1;
    }

    public void setSJ1(BigDecimal SJ1) {
        this.SJ1 = SJ1;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public BigDecimal getPj() {
        return pj;
    }

    public void setPj(BigDecimal pj) {
        this.pj = pj;
    }

    public BigDecimal getPdsl() {
        return pdsl;
    }

    public void setPdsl(BigDecimal pdsl) {
        this.pdsl = pdsl;
    }

    public BigDecimal getSysl() {
        return sysl;
    }

    public void setSysl(BigDecimal sysl) {
        this.sysl = sysl;
    }

    public String getSx() {
        return sx;
    }

    public void setSx(String sx) {
        this.sx = sx;
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public Boolean getSfcf() {
        return sfcf;
    }

    public void setSfcf(Boolean sfcf) {
        this.sfcf = sfcf;
    }

    public String getPzwh() {
        return pzwh;
    }

    public void setPzwh(String pzwh) {
        this.pzwh = pzwh;
    }

    public String getScdw() {
        return scdw;
    }

    public void setScdw(String scdw) {
        this.scdw = scdw;
    }

    public LocalDateTime getScrq() {
        return scrq;
    }

    public void setScrq(LocalDateTime scrq) {
        this.scrq = scrq;
    }

    public String getZcsb() {
        return zcsb;
    }

    public void setZcsb(String zcsb) {
        this.zcsb = zcsb;
    }

    public String getJjff() {
        return jjff;
    }

    public void setJjff(String jjff) {
        this.jjff = jjff;
    }

    public Boolean getFDeleted() {
        return FDeleted;
    }

    public void setFDeleted(Boolean FDeleted) {
        this.FDeleted = FDeleted;
    }

    public String getSX1() {
        return SX1;
    }

    public void setSX1(String SX1) {
        this.SX1 = SX1;
    }

    public String getSX2() {
        return SX2;
    }

    public void setSX2(String SX2) {
        this.SX2 = SX2;
    }

    public String getDWMC1() {
        return DWMC1;
    }

    public void setDWMC1(String DWMC1) {
        this.DWMC1 = DWMC1;
    }

    public String getDWMC2() {
        return DWMC2;
    }

    public void setDWMC2(String DWMC2) {
        this.DWMC2 = DWMC2;
    }

    public String getJx() {
        return jx;
    }

    public void setJx(String jx) {
        this.jx = jx;
    }

    public String getYsbz() {
        return ysbz;
    }

    public void setYsbz(String ysbz) {
        this.ysbz = ysbz;
    }

    public String getCctj() {
        return cctj;
    }

    public void setCctj(String cctj) {
        this.cctj = cctj;
    }

    public Boolean getTybz() {
        return tybz;
    }

    public void setTybz(Boolean tybz) {
        this.tybz = tybz;
    }

    public Boolean getSybz() {
        return sybz;
    }

    public void setSybz(Boolean sybz) {
        this.sybz = sybz;
    }

    public String getDls() {
        return dls;
    }

    public void setDls(String dls) {
        this.dls = dls;
    }

    public String getBzgg() {
        return bzgg;
    }

    public void setBzgg(String bzgg) {
        this.bzgg = bzgg;
    }

    public String getBZ1() {
        return BZ1;
    }

    public void setBZ1(String BZ1) {
        this.BZ1 = BZ1;
    }

    public String getBZ2() {
        return BZ2;
    }

    public void setBZ2(String BZ2) {
        this.BZ2 = BZ2;
    }

    public String getBZ3() {
        return BZ3;
    }

    public void setBZ3(String BZ3) {
        this.BZ3 = BZ3;
    }

    public String getBZ4() {
        return BZ4;
    }

    public void setBZ4(String BZ4) {
        this.BZ4 = BZ4;
    }

    public String getBZ5() {
        return BZ5;
    }

    public void setBZ5(String BZ5) {
        this.BZ5 = BZ5;
    }

    public Boolean getBzbz() {
        return bzbz;
    }

    public void setBzbz(Boolean bzbz) {
        this.bzbz = bzbz;
    }

    public String getBzhh() {
        return bzhh;
    }

    public void setBzhh(String bzhh) {
        this.bzhh = bzhh;
    }

    public BigDecimal getBzl() {
        return bzl;
    }

    public void setBzl(BigDecimal bzl) {
        this.bzl = bzl;
    }

    public BigDecimal getZbzl() {
        return zbzl;
    }

    public void setZbzl(BigDecimal zbzl) {
        this.zbzl = zbzl;
    }

    public BigDecimal getXq() {
        return xq;
    }

    public void setXq(BigDecimal xq) {
        this.xq = xq;
    }

    public String getKcspid() {
        return kcspid;
    }

    public void setKcspid(String kcspid) {
        this.kcspid = kcspid;
    }

    public String getXssrid() {
        return xssrid;
    }

    public void setXssrid(String xssrid) {
        this.xssrid = xssrid;
    }

    public String getXscbid() {
        return xscbid;
    }

    public void setXscbid(String xscbid) {
        this.xscbid = xscbid;
    }

    public String getKM1() {
        return KM1;
    }

    public void setKM1(String KM1) {
        this.KM1 = KM1;
    }

    public String getKM2() {
        return KM2;
    }

    public void setKM2(String KM2) {
        this.KM2 = KM2;
    }

    public String getKM3() {
        return KM3;
    }

    public void setKM3(String KM3) {
        this.KM3 = KM3;
    }

    public String getKM4() {
        return KM4;
    }

    public void setKM4(String KM4) {
        this.KM4 = KM4;
    }

    public String getKM5() {
        return KM5;
    }

    public void setKM5(String KM5) {
        this.KM5 = KM5;
    }

    public Boolean getFOnlyMoney() {
        return FOnlyMoney;
    }

    public void setFOnlyMoney(Boolean FOnlyMoney) {
        this.FOnlyMoney = FOnlyMoney;
    }

    public Boolean getFIsYBPZ() {
        return FIsYBPZ;
    }

    public void setFIsYBPZ(Boolean FIsYBPZ) {
        this.FIsYBPZ = FIsYBPZ;
    }

    public Boolean getFIsGMP() {
        return FIsGMP;
    }

    public void setFIsGMP(Boolean FIsGMP) {
        this.FIsGMP = FIsGMP;
    }

    public Integer getSCRQRequest() {
        return SCRQRequest;
    }

    public void setSCRQRequest(Integer SCRQRequest) {
        this.SCRQRequest = SCRQRequest;
    }

    public Integer getYXQRequest() {
        return YXQRequest;
    }

    public void setYXQRequest(Integer YXQRequest) {
        this.YXQRequest = YXQRequest;
    }

    public BigDecimal getTcbl() {
        return tcbl;
    }

    public void setTcbl(BigDecimal tcbl) {
        this.tcbl = tcbl;
    }

    public Boolean getFIsRecipe() {
        return FIsRecipe;
    }

    public void setFIsRecipe(Boolean FIsRecipe) {
        this.FIsRecipe = FIsRecipe;
    }

    public BigDecimal getFSjbl() {
        return FSjbl;
    }

    public void setFSjbl(BigDecimal FSjbl) {
        this.FSjbl = FSjbl;
    }

    public Boolean getFTsbz() {
        return FTsbz;
    }

    public void setFTsbz(Boolean FTsbz) {
        this.FTsbz = FTsbz;
    }

    public BigDecimal getHyj() {
        return hyj;
    }

    public void setHyj(BigDecimal hyj) {
        this.hyj = hyj;
    }

    public Boolean getColorSize() {
        return isColorSize;
    }

    public void setColorSize(Boolean colorSize) {
        isColorSize = colorSize;
    }

    public Boolean getNoAbate() {
        return noAbate;
    }

    public void setNoAbate(Boolean noAbate) {
        this.noAbate = noAbate;
    }

    public String getcGx() {
        return cGx;
    }

    public void setcGx(String cGx) {
        this.cGx = cGx;
    }

    public String getcXz() {
        return cXz;
    }

    public void setcXz(String cXz) {
        this.cXz = cXz;
    }

    public String getcYhly() {
        return cYhly;
    }

    public void setcYhly(String cYhly) {
        this.cYhly = cYhly;
    }

    public Boolean getcZdyh() {
        return cZdyh;
    }

    public void setcZdyh(Boolean cZdyh) {
        this.cZdyh = cZdyh;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getcYpfl() {
        return cYpfl;
    }

    public void setcYpfl(String cYpfl) {
        this.cYpfl = cYpfl;
    }

    public BigDecimal getStockTaxRate() {
        return stockTaxRate;
    }

    public void setStockTaxRate(BigDecimal stockTaxRate) {
        this.stockTaxRate = stockTaxRate;
    }

    public BigDecimal getHyzk() {
        return hyzk;
    }

    public void setHyzk(BigDecimal hyzk) {
        this.hyzk = hyzk;
    }

    public String getMaterielDiscountRateID() {
        return materielDiscountRateID;
    }

    public void setMaterielDiscountRateID(String materielDiscountRateID) {
        this.materielDiscountRateID = materielDiscountRateID;
    }

    public String getGSPSortID() {
        return GSPSortID;
    }

    public void setGSPSortID(String GSPSortID) {
        this.GSPSortID = GSPSortID;
    }

    public String getMaterielImage() {
        return materielImage;
    }

    public void setMaterielImage(String materielImage) {
        this.materielImage = materielImage;
    }

    public Boolean getCourtesyCard() {
        return isCourtesyCard;
    }

    public void setCourtesyCard(Boolean courtesyCard) {
        isCourtesyCard = courtesyCard;
    }

    public String getCourtesyCardTypeID() {
        return courtesyCardTypeID;
    }

    public void setCourtesyCardTypeID(String courtesyCardTypeID) {
        this.courtesyCardTypeID = courtesyCardTypeID;
    }

    public BigDecimal getParValue() {
        return parValue;
    }

    public void setParValue(BigDecimal parValue) {
        this.parValue = parValue;
    }

    public Boolean getSalesPromotion() {
        return isSalesPromotion;
    }

    public void setSalesPromotion(Boolean salesPromotion) {
        isSalesPromotion = salesPromotion;
    }

    public Integer getInOutStatus() {
        return inOutStatus;
    }

    public void setInOutStatus(Integer inOutStatus) {
        this.inOutStatus = inOutStatus;
    }

    public String getBranchGuid() {
        return branchGuid;
    }

    public void setBranchGuid(String branchGuid) {
        this.branchGuid = branchGuid;
    }

    public LocalDateTime getFdate() {
        return fdate;
    }

    public void setFdate(LocalDateTime fdate) {
        this.fdate = fdate;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getGhqy() {
        return ghqy;
    }

    public void setGhqy(String ghqy) {
        this.ghqy = ghqy;
    }

    public String getGmpzsh() {
        return gmpzsh;
    }

    public void setGmpzsh(String gmpzsh) {
        this.gmpzsh = gmpzsh;
    }

    public LocalDateTime getGmprzrq() {
        return gmprzrq;
    }

    public void setGmprzrq(LocalDateTime gmprzrq) {
        this.gmprzrq = gmprzrq;
    }

    public LocalDateTime getGmprzxq() {
        return gmprzxq;
    }

    public void setGmprzxq(LocalDateTime gmprzxq) {
        this.gmprzxq = gmprzxq;
    }

    public String getCcjybgs() {
        return ccjybgs;
    }

    public void setCcjybgs(String ccjybgs) {
        this.ccjybgs = ccjybgs;
    }

    public String getSyjybgs() {
        return syjybgs;
    }

    public void setSyjybgs(String syjybgs) {
        this.syjybgs = syjybgs;
    }

    public String getSyjyjl() {
        return syjyjl;
    }

    public void setSyjyjl(String syjyjl) {
        this.syjyjl = syjyjl;
    }

    public String getCgyy() {
        return cgyy;
    }

    public void setCgyy(String cgyy) {
        this.cgyy = cgyy;
    }

    public String getCgy() {
        return cgy;
    }

    public void setCgy(String cgy) {
        this.cgy = cgy;
    }

    public String getYjYw() {
        return yjYw;
    }

    public void setYjYw(String yjYw) {
        this.yjYw = yjYw;
    }

    public String getJlYw() {
        return jlYw;
    }

    public void setJlYw(String jlYw) {
        this.jlYw = jlYw;
    }

    public LocalDateTime getRqYw() {
        return rqYw;
    }

    public void setRqYw(LocalDateTime rqYw) {
        this.rqYw = rqYw;
    }

    public String getYjZg() {
        return yjZg;
    }

    public void setYjZg(String yjZg) {
        this.yjZg = yjZg;
    }

    public String getJlZg() {
        return jlZg;
    }

    public void setJlZg(String jlZg) {
        this.jlZg = jlZg;
    }

    public LocalDateTime getRqZg() {
        return rqZg;
    }

    public void setRqZg(LocalDateTime rqZg) {
        this.rqZg = rqZg;
    }

    public String getYjWj() {
        return yjWj;
    }

    public void setYjWj(String yjWj) {
        this.yjWj = yjWj;
    }

    public String getJlWj() {
        return jlWj;
    }

    public void setJlWj(String jlWj) {
        this.jlWj = jlWj;
    }

    public LocalDateTime getRqWj() {
        return rqWj;
    }

    public void setRqWj(LocalDateTime rqWj) {
        this.rqWj = rqWj;
    }

    public String getYjJl() {
        return yjJl;
    }

    public void setYjJl(String yjJl) {
        this.yjJl = yjJl;
    }

    public String getYpqk() {
        return ypqk;
    }

    public void setYpqk(String ypqk) {
        this.ypqk = ypqk;
    }

    public String getZYX1() {
        return ZYX1;
    }

    public void setZYX1(String ZYX1) {
        this.ZYX1 = ZYX1;
    }

    public String getZYX2() {
        return ZYX2;
    }

    public void setZYX2(String ZYX2) {
        this.ZYX2 = ZYX2;
    }

    public String getZYX3() {
        return ZYX3;
    }

    public void setZYX3(String ZYX3) {
        this.ZYX3 = ZYX3;
    }

    public String getZYX4() {
        return ZYX4;
    }

    public void setZYX4(String ZYX4) {
        this.ZYX4 = ZYX4;
    }

    public Boolean getHgbz() {
        return hgbz;
    }

    public void setHgbz(Boolean hgbz) {
        this.hgbz = hgbz;
    }

    public String getSpry() {
        return spry;
    }

    public void setSpry(String spry) {
        this.spry = spry;
    }

    public String getBqsms() {
        return bqsms;
    }

    public void setBqsms(String bqsms) {
        this.bqsms = bqsms;
    }

    public Boolean getWcbz() {
        return wcbz;
    }

    public void setWcbz(Boolean wcbz) {
        this.wcbz = wcbz;
    }

    public BigDecimal getGjxj() {
        return gjxj;
    }

    public void setGjxj(BigDecimal gjxj) {
        this.gjxj = gjxj;
    }

    public BigDecimal getCkjj() {
        return ckjj;
    }

    public void setCkjj(BigDecimal ckjj) {
        this.ckjj = ckjj;
    }

    public String getGys() {
        return gys;
    }

    public void setGys(String gys) {
        this.gys = gys;
    }

    public String getGyslb() {
        return gyslb;
    }

    public void setGyslb(String gyslb) {
        this.gyslb = gyslb;
    }

    public String getGysdb() {
        return gysdb;
    }

    public void setGysdb(String gysdb) {
        this.gysdb = gysdb;
    }

    public LocalDateTime getSqwtqx() {
        return sqwtqx;
    }

    public void setSqwtqx(LocalDateTime sqwtqx) {
        this.sqwtqx = sqwtqx;
    }

    public String getCkgl() {
        return ckgl;
    }

    public void setCkgl(String ckgl) {
        this.ckgl = ckgl;
    }

    public String getGndls() {
        return gndls;
    }

    public void setGndls(String gndls) {
        this.gndls = gndls;
    }

    public String getJkzczh() {
        return jkzczh;
    }

    public void setJkzczh(String jkzczh) {
        this.jkzczh = jkzczh;
    }

    public String getJkka() {
        return jkka;
    }

    public void setJkka(String jkka) {
        this.jkka = jkka;
    }

    public LocalDateTime getXkzqx() {
        return xkzqx;
    }

    public void setXkzqx(LocalDateTime xkzqx) {
        this.xkzqx = xkzqx;
    }

    public String getYhcs() {
        return yhcs;
    }

    public void setYhcs(String yhcs) {
        this.yhcs = yhcs;
    }

    public String getWjpw() {
        return wjpw;
    }

    public void setWjpw(String wjpw) {
        this.wjpw = wjpw;
    }

    public Boolean getYpbz() {
        return ypbz;
    }

    public void setYpbz(Boolean ypbz) {
        this.ypbz = ypbz;
    }

    public Boolean getYsrkyxqbz() {
        return ysrkyxqbz;
    }

    public void setYsrkyxqbz(Boolean ysrkyxqbz) {
        this.ysrkyxqbz = ysrkyxqbz;
    }

    public Boolean getSyystxbz() {
        return syystxbz;
    }

    public void setSyystxbz(Boolean syystxbz) {
        this.syystxbz = syystxbz;
    }

    public Boolean getYszdbz() {
        return yszdbz;
    }

    public void setYszdbz(Boolean yszdbz) {
        this.yszdbz = yszdbz;
    }

    public Boolean getSrysfhbz() {
        return srysfhbz;
    }

    public void setSrysfhbz(Boolean srysfhbz) {
        this.srysfhbz = srysfhbz;
    }

    public Boolean getBcyhyjfbz() {
        return bcyhyjfbz;
    }

    public void setBcyhyjfbz(Boolean bcyhyjfbz) {
        this.bcyhyjfbz = bcyhyjfbz;
    }

    public Boolean getChdsdzbz() {
        return chdsdzbz;
    }

    public void setChdsdzbz(Boolean chdsdzbz) {
        this.chdsdzbz = chdsdzbz;
    }

    public String getCfhjdw() {
        return cfhjdw;
    }

    public void setCfhjdw(String cfhjdw) {
        this.cfhjdw = cfhjdw;
    }

    public BigDecimal getCfhjlsj() {
        return cfhjlsj;
    }

    public void setCfhjlsj(BigDecimal cfhjlsj) {
        this.cfhjlsj = cfhjlsj;
    }

    public Integer getChdyjdhsgx() {
        return chdyjdhsgx;
    }

    public void setChdyjdhsgx(Integer chdyjdhsgx) {
        this.chdyjdhsgx = chdyjdhsgx;
    }

    public Integer getXpzgzbz() {
        return xpzgzbz;
    }

    public void setXpzgzbz(Integer xpzgzbz) {
        this.xpzgzbz = xpzgzbz;
    }

    public LocalDateTime getXpzgzqx() {
        return xpzgzqx;
    }

    public void setXpzgzqx(LocalDateTime xpzgzqx) {
        this.xpzgzqx = xpzgzqx;
    }

    public String getLsjgllb() {
        return lsjgllb;
    }

    public void setLsjgllb(String lsjgllb) {
        this.lsjgllb = lsjgllb;
    }

    public BigDecimal getCgxj() {
        return cgxj;
    }

    public void setCgxj(BigDecimal cgxj) {
        this.cgxj = cgxj;
    }

    public Boolean getCgjccgxjbz() {
        return cgjccgxjbz;
    }

    public void setCgjccgxjbz(Boolean cgjccgxjbz) {
        this.cgjccgxjbz = cgjccgxjbz;
    }

    public Boolean getXjsbz() {
        return xjsbz;
    }

    public void setXjsbz(Boolean xjsbz) {
        this.xjsbz = xjsbz;
    }

    public Boolean getRjksxbz() {
        return rjksxbz;
    }

    public void setRjksxbz(Boolean rjksxbz) {
        this.rjksxbz = rjksxbz;
    }

    public BigDecimal getKcsx() {
        return kcsx;
    }

    public void setKcsx(BigDecimal kcsx) {
        this.kcsx = kcsx;
    }

    public BigDecimal getKcxx() {
        return kcxx;
    }

    public void setKcxx(BigDecimal kcxx) {
        this.kcxx = kcxx;
    }

    public Boolean getXjkxxbz() {
        return xjkxxbz;
    }

    public void setXjkxxbz(Boolean xjkxxbz) {
        this.xjkxxbz = xjkxxbz;
    }

    public String getAbcflsx() {
        return abcflsx;
    }

    public void setAbcflsx(String abcflsx) {
        this.abcflsx = abcflsx;
    }

    public String getZtflsx() {
        return ztflsx;
    }

    public void setZtflsx(String ztflsx) {
        this.ztflsx = ztflsx;
    }

    public String getFZFLSX1() {
        return FZFLSX1;
    }

    public void setFZFLSX1(String FZFLSX1) {
        this.FZFLSX1 = FZFLSX1;
    }

    public String getFZFLSX2() {
        return FZFLSX2;
    }

    public void setFZFLSX2(String FZFLSX2) {
        this.FZFLSX2 = FZFLSX2;
    }

    public String getFZFLSX3() {
        return FZFLSX3;
    }

    public void setFZFLSX3(String FZFLSX3) {
        this.FZFLSX3 = FZFLSX3;
    }

    public String getFZFLSX4() {
        return FZFLSX4;
    }

    public void setFZFLSX4(String FZFLSX4) {
        this.FZFLSX4 = FZFLSX4;
    }

    public String getFZFLSX5() {
        return FZFLSX5;
    }

    public void setFZFLSX5(String FZFLSX5) {
        this.FZFLSX5 = FZFLSX5;
    }

    public Boolean getAuditing() {
        return isAuditing;
    }

    public void setAuditing(Boolean auditing) {
        isAuditing = auditing;
    }

    public Boolean getCancel() {
        return isCancel;
    }

    public void setCancel(Boolean cancel) {
        isCancel = cancel;
    }

    public String getLxtjbh() {
        return lxtjbh;
    }

    public void setLxtjbh(String lxtjbh) {
        this.lxtjbh = lxtjbh;
    }

    public String getSaleChannel() {
        return saleChannel;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public String getSaleArea() {
        return saleArea;
    }

    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }

    public String getOperatorGuid() {
        return operatorGuid;
    }

    public void setOperatorGuid(String operatorGuid) {
        this.operatorGuid = operatorGuid;
    }

    public String getAuditingGuid() {
        return auditingGuid;
    }

    public void setAuditingGuid(String auditingGuid) {
        this.auditingGuid = auditingGuid;
    }

    public Boolean getDjzt() {
        return djzt;
    }

    public void setDjzt(Boolean djzt) {
        this.djzt = djzt;
    }

    public String getVIPIntegralType() {
        return VIPIntegralType;
    }

    public void setVIPIntegralType(String VIPIntegralType) {
        this.VIPIntegralType = VIPIntegralType;
    }

    public Boolean getNeBalance() {
        return isNeBalance;
    }

    public void setNeBalance(Boolean neBalance) {
        isNeBalance = neBalance;
    }

    public LocalDateTime getAuditingDate() {
        return auditingDate;
    }

    public void setAuditingDate(LocalDateTime auditingDate) {
        this.auditingDate = auditingDate;
    }

    public Boolean getJkpzbz() {
        return jkpzbz;
    }

    public void setJkpzbz(Boolean jkpzbz) {
        this.jkpzbz = jkpzbz;
    }

    public Boolean getZybz() {
        return zybz;
    }

    public void setZybz(Boolean zybz) {
        this.zybz = zybz;
    }

    public Boolean getLspszbzTag() {
        return lspszbzTag;
    }

    public void setLspszbzTag(Boolean lspszbzTag) {
        this.lspszbzTag = lspszbzTag;
    }

    public String getLargePackUnit() {
        return largePackUnit;
    }

    public void setLargePackUnit(String largePackUnit) {
        this.largePackUnit = largePackUnit;
    }

    public String getLargePackBarCode() {
        return largePackBarCode;
    }

    public void setLargePackBarCode(String largePackBarCode) {
        this.largePackBarCode = largePackBarCode;
    }

    public String getMiddlePackUnit() {
        return middlePackUnit;
    }

    public void setMiddlePackUnit(String middlePackUnit) {
        this.middlePackUnit = middlePackUnit;
    }

    public String getMiddlePackBarCode() {
        return middlePackBarCode;
    }

    public void setMiddlePackBarCode(String middlePackBarCode) {
        this.middlePackBarCode = middlePackBarCode;
    }

    public Integer getBalanceProperty() {
        return balanceProperty;
    }

    public void setBalanceProperty(Integer balanceProperty) {
        this.balanceProperty = balanceProperty;
    }

    public String getMedicalInstrumentType() {
        return medicalInstrumentType;
    }

    public void setMedicalInstrumentType(String medicalInstrumentType) {
        this.medicalInstrumentType = medicalInstrumentType;
    }

    public Boolean getIseggPreparation() {
        return iseggPreparation;
    }

    public void setIseggPreparation(Boolean iseggPreparation) {
        this.iseggPreparation = iseggPreparation;
    }

    public Boolean getTwoClassMentalDrug() {
        return isTwoClassMentalDrug;
    }

    public void setTwoClassMentalDrug(Boolean twoClassMentalDrug) {
        isTwoClassMentalDrug = twoClassMentalDrug;
    }

    public Boolean getEphedrine() {
        return isEphedrine;
    }

    public void setEphedrine(Boolean ephedrine) {
        isEphedrine = ephedrine;
    }

    public Boolean getTLHormone() {
        return isTLHormone;
    }

    public void setTLHormone(Boolean TLHormone) {
        isTLHormone = TLHormone;
    }

    public Boolean getMindDrug() {
        return isMindDrug;
    }

    public void setMindDrug(Boolean mindDrug) {
        isMindDrug = mindDrug;
    }

    public Boolean getDangerChemistry() {
        return isDangerChemistry;
    }

    public void setDangerChemistry(Boolean dangerChemistry) {
        isDangerChemistry = dangerChemistry;
    }

    public String getMaterialImage() {
        return materialImage;
    }

    public void setMaterialImage(String materialImage) {
        this.materialImage = materialImage;
    }

    public Boolean getPick() {
        return isPick;
    }

    public void setPick(Boolean pick) {
        isPick = pick;
    }

    public Integer getIsselectbatch() {
        return isselectbatch;
    }

    public void setIsselectbatch(Integer isselectbatch) {
        this.isselectbatch = isselectbatch;
    }

    public Boolean getStockRecAllRegJJ() {
        return stockRecAllRegJJ;
    }

    public void setStockRecAllRegJJ(Boolean stockRecAllRegJJ) {
        this.stockRecAllRegJJ = stockRecAllRegJJ;
    }

    public Boolean getGift() {
        return isGift;
    }

    public void setGift(Boolean gift) {
        isGift = gift;
    }

    public String getDefaultStockId() {
        return defaultStockId;
    }

    public void setDefaultStockId(String defaultStockId) {
        this.defaultStockId = defaultStockId;
    }

    public String getTcfs() {
        return tcfs;
    }

    public void setTcfs(String tcfs) {
        this.tcfs = tcfs;
    }

    public String getJgd() {
        return jgd;
    }

    public void setJgd(String jgd) {
        this.jgd = jgd;
    }

    public String getPriceBeltType() {
        return priceBeltType;
    }

    public void setPriceBeltType(String priceBeltType) {
        this.priceBeltType = priceBeltType;
    }

    public String getSalespromotiontypeid() {
        return salespromotiontypeid;
    }

    public void setSalespromotiontypeid(String salespromotiontypeid) {
        this.salespromotiontypeid = salespromotiontypeid;
    }

    public Boolean getIsmonitor() {
        return ismonitor;
    }

    public void setIsmonitor(Boolean ismonitor) {
        this.ismonitor = ismonitor;
    }

    public String getEssentialdruglist() {
        return essentialdruglist;
    }

    public void setEssentialdruglist(String essentialdruglist) {
        this.essentialdruglist = essentialdruglist;
    }

    public Integer getIsControlSellScope() {
        return isControlSellScope;
    }

    public void setIsControlSellScope(Integer isControlSellScope) {
        this.isControlSellScope = isControlSellScope;
    }

    public Integer getIsSellSplitSmallPack() {
        return isSellSplitSmallPack;
    }

    public void setIsSellSplitSmallPack(Integer isSellSplitSmallPack) {
        this.isSellSplitSmallPack = isSellSplitSmallPack;
    }

    public BigDecimal getSmallPackage() {
        return smallPackage;
    }

    public void setSmallPackage(BigDecimal smallPackage) {
        this.smallPackage = smallPackage;
    }

    public Boolean getAgreementbreed() {
        return isAgreementbreed;
    }

    public void setAgreementbreed(Boolean agreementbreed) {
        isAgreementbreed = agreementbreed;
    }

    public String getMaterielStatus() {
        return materielStatus;
    }

    public void setMaterielStatus(String materielStatus) {
        this.materielStatus = materielStatus;
    }

    public String getMaterielDescAwake() {
        return materielDescAwake;
    }

    public void setMaterielDescAwake(String materielDescAwake) {
        this.materielDescAwake = materielDescAwake;
    }

    public String getGroupcontrolpurtype() {
        return groupcontrolpurtype;
    }

    public void setGroupcontrolpurtype(String groupcontrolpurtype) {
        this.groupcontrolpurtype = groupcontrolpurtype;
    }

    public String getSeasonClass() {
        return seasonClass;
    }

    public void setSeasonClass(String seasonClass) {
        this.seasonClass = seasonClass;
    }

    public String getCoreItemsClass() {
        return coreItemsClass;
    }

    public void setCoreItemsClass(String coreItemsClass) {
        this.coreItemsClass = coreItemsClass;
    }

    public String getRequireClass() {
        return requireClass;
    }

    public void setRequireClass(String requireClass) {
        this.requireClass = requireClass;
    }

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public String getArearangedescibeid() {
        return arearangedescibeid;
    }

    public void setArearangedescibeid(String arearangedescibeid) {
        this.arearangedescibeid = arearangedescibeid;
    }

    public String getBrandattribute() {
        return brandattribute;
    }

    public void setBrandattribute(String brandattribute) {
        this.brandattribute = brandattribute;
    }

    public String getForbiddenreason() {
        return forbiddenreason;
    }

    public void setForbiddenreason(String forbiddenreason) {
        this.forbiddenreason = forbiddenreason;
    }

    public String getStoppurchasereason() {
        return stoppurchasereason;
    }

    public void setStoppurchasereason(String stoppurchasereason) {
        this.stoppurchasereason = stoppurchasereason;
    }

    public Boolean getIsanaesthetic() {
        return isanaesthetic;
    }

    public void setIsanaesthetic(Boolean isanaesthetic) {
        this.isanaesthetic = isanaesthetic;
    }

    public Boolean getIslowtemperature() {
        return islowtemperature;
    }

    public void setIslowtemperature(Boolean islowtemperature) {
        this.islowtemperature = islowtemperature;
    }

    public String getAutoCode() {
        return autoCode;
    }

    public void setAutoCode(String autoCode) {
        this.autoCode = autoCode;
    }

    public Boolean getMedicaltoxicity() {
        return isMedicaltoxicity;
    }

    public void setMedicaltoxicity(Boolean medicaltoxicity) {
        isMedicaltoxicity = medicaltoxicity;
    }

    public Boolean getVaccine() {
        return isVaccine;
    }

    public void setVaccine(Boolean vaccine) {
        isVaccine = vaccine;
    }

    public Boolean getDiagnosticreagent() {
        return isDiagnosticreagent;
    }

    public void setDiagnosticreagent(Boolean diagnosticreagent) {
        isDiagnosticreagent = diagnosticreagent;
    }

    public Boolean getStimulant() {
        return isStimulant;
    }

    public void setStimulant(Boolean stimulant) {
        isStimulant = stimulant;
    }

    public Boolean getEan1() {
        return isEan1;
    }

    public void setEan1(Boolean ean1) {
        isEan1 = ean1;
    }

    public Boolean getEan2() {
        return isEan2;
    }

    public void setEan2(Boolean ean2) {
        isEan2 = ean2;
    }

    public Boolean getISHealthFoods() {
        return ISHealthFoods;
    }

    public void setISHealthFoods(Boolean ISHealthFoods) {
        this.ISHealthFoods = ISHealthFoods;
    }

    public Boolean getIsfood() {
        return isfood;
    }

    public void setIsfood(Boolean isfood) {
        this.isfood = isfood;
    }

    public Boolean getValuAbleBreed() {
        return isValuAbleBreed;
    }

    public void setValuAbleBreed(Boolean valuAbleBreed) {
        isValuAbleBreed = valuAbleBreed;
    }

    public Boolean getRecordBigLsh() {
        return isRecordBigLsh;
    }

    public void setRecordBigLsh(Boolean recordBigLsh) {
        isRecordBigLsh = recordBigLsh;
    }

    public Boolean getKeepPriceBreed() {
        return isKeepPriceBreed;
    }

    public void setKeepPriceBreed(Boolean keepPriceBreed) {
        isKeepPriceBreed = keepPriceBreed;
    }

    public Boolean getSubDirct() {
        return subDirct;
    }

    public void setSubDirct(Boolean subDirct) {
        this.subDirct = subDirct;
    }

    public Integer getIsSalePromotion() {
        return isSalePromotion;
    }

    public void setIsSalePromotion(Integer isSalePromotion) {
        this.isSalePromotion = isSalePromotion;
    }

    public Boolean getPriceSetByFactory() {
        return isPriceSetByFactory;
    }

    public void setPriceSetByFactory(Boolean priceSetByFactory) {
        isPriceSetByFactory = priceSetByFactory;
    }

    public BigDecimal getMaterielLong() {
        return materielLong;
    }

    public void setMaterielLong(BigDecimal materielLong) {
        this.materielLong = materielLong;
    }

    public BigDecimal getMaterielWidth() {
        return materielWidth;
    }

    public void setMaterielWidth(BigDecimal materielWidth) {
        this.materielWidth = materielWidth;
    }

    public BigDecimal getMaterielhigh() {
        return materielhigh;
    }

    public void setMaterielhigh(BigDecimal materielhigh) {
        this.materielhigh = materielhigh;
    }

    public String getHistoryCode() {
        return historyCode;
    }

    public void setHistoryCode(String historyCode) {
        this.historyCode = historyCode;
    }

    public String getReserveListCode() {
        return reserveListCode;
    }

    public void setReserveListCode(String reserveListCode) {
        this.reserveListCode = reserveListCode;
    }

    public String getGrossRateType() {
        return grossRateType;
    }

    public void setGrossRateType(String grossRateType) {
        this.grossRateType = grossRateType;
    }

    public String getGroupPurchBranchGuid() {
        return groupPurchBranchGuid;
    }

    public void setGroupPurchBranchGuid(String groupPurchBranchGuid) {
        this.groupPurchBranchGuid = groupPurchBranchGuid;
    }

    public String getFinanceType() {
        return financeType;
    }

    public void setFinanceType(String financeType) {
        this.financeType = financeType;
    }

    public String getPurchaseBalance() {
        return purchaseBalance;
    }

    public void setPurchaseBalance(String purchaseBalance) {
        this.purchaseBalance = purchaseBalance;
    }

    public String getTakeMoneyType() {
        return takeMoneyType;
    }

    public void setTakeMoneyType(String takeMoneyType) {
        this.takeMoneyType = takeMoneyType;
    }

    public String getStoreSreQuireClass() {
        return storeSreQuireClass;
    }

    public void setStoreSreQuireClass(String storeSreQuireClass) {
        this.storeSreQuireClass = storeSreQuireClass;
    }

    public LocalDateTime getPzwhxq() {
        return pzwhxq;
    }

    public void setPzwhxq(LocalDateTime pzwhxq) {
        this.pzwhxq = pzwhxq;
    }

    public LocalDateTime getZzqx() {
        return zzqx;
    }

    public void setZzqx(LocalDateTime zzqx) {
        this.zzqx = zzqx;
    }

    public LocalDateTime getYyzyxkzxq() {
        return yyzyxkzxq;
    }

    public void setYyzyxkzxq(LocalDateTime yyzyxkzxq) {
        this.yyzyxkzxq = yyzyxkzxq;
    }

    public LocalDateTime getPropricemakedate() {
        return propricemakedate;
    }

    public void setPropricemakedate(LocalDateTime propricemakedate) {
        this.propricemakedate = propricemakedate;
    }

    public String getArearangedescibe() {
        return arearangedescibe;
    }

    public void setArearangedescibe(String arearangedescibe) {
        this.arearangedescibe = arearangedescibe;
    }

    public String getMaterieldescawakeid() {
        return materieldescawakeid;
    }

    public void setMaterieldescawakeid(String materieldescawakeid) {
        this.materieldescawakeid = materieldescawakeid;
    }

    public BigDecimal getProManageRetailPrice() {
        return proManageRetailPrice;
    }

    public void setProManageRetailPrice(BigDecimal proManageRetailPrice) {
        this.proManageRetailPrice = proManageRetailPrice;
    }

    public BigDecimal getBaseMaterielRetailPrice() {
        return baseMaterielRetailPrice;
    }

    public void setBaseMaterielRetailPrice(BigDecimal baseMaterielRetailPrice) {
        this.baseMaterielRetailPrice = baseMaterielRetailPrice;
    }

    public BigDecimal getTrayQuantity() {
        return trayQuantity;
    }

    public void setTrayQuantity(BigDecimal trayQuantity) {
        this.trayQuantity = trayQuantity;
    }

    public BigDecimal getBaseMaterielGuidePrice() {
        return baseMaterielGuidePrice;
    }

    public void setBaseMaterielGuidePrice(BigDecimal baseMaterielGuidePrice) {
        this.baseMaterielGuidePrice = baseMaterielGuidePrice;
    }

    public LocalDateTime getCountryLimitPriceAdjustDate() {
        return countryLimitPriceAdjustDate;
    }

    public void setCountryLimitPriceAdjustDate(LocalDateTime countryLimitPriceAdjustDate) {
        this.countryLimitPriceAdjustDate = countryLimitPriceAdjustDate;
    }

    public String getSmallPackUnit() {
        return smallPackUnit;
    }

    public void setSmallPackUnit(String smallPackUnit) {
        this.smallPackUnit = smallPackUnit;
    }

    public String getYsry() {
        return ysry;
    }

    public void setYsry(String ysry) {
        this.ysry = ysry;
    }

    public String getYsywy() {
        return ysywy;
    }

    public void setYsywy(String ysywy) {
        this.ysywy = ysywy;
    }

    public BigDecimal getLastbalanceprice() {
        return lastbalanceprice;
    }

    public void setLastbalanceprice(BigDecimal lastbalanceprice) {
        this.lastbalanceprice = lastbalanceprice;
    }

    public String getCfflsx() {
        return cfflsx;
    }

    public void setCfflsx(String cfflsx) {
        this.cfflsx = cfflsx;
    }

    public String getLcyyfl() {
        return lcyyfl;
    }

    public void setLcyyfl(String lcyyfl) {
        this.lcyyfl = lcyyfl;
    }

    public Integer getKfyts() {
        return kfyts;
    }

    public void setKfyts(Integer kfyts) {
        this.kfyts = kfyts;
    }

    public Boolean getZzrsTag() {
        return zzrsTag;
    }

    public void setZzrsTag(Boolean zzrsTag) {
        this.zzrsTag = zzrsTag;
    }

    public Boolean getZycTag() {
        return zycTag;
    }

    public void setZycTag(Boolean zycTag) {
        this.zycTag = zycTag;
    }

    public Integer getIsCheckMediDevices() {
        return isCheckMediDevices;
    }

    public void setIsCheckMediDevices(Integer isCheckMediDevices) {
        this.isCheckMediDevices = isCheckMediDevices;
    }

    public Boolean getInvoice() {
        return isInvoice;
    }

    public void setInvoice(Boolean invoice) {
        isInvoice = invoice;
    }

    public Boolean getRWP() {
        return isRWP;
    }

    public void setRWP(Boolean RWP) {
        isRWP = RWP;
    }

    public Boolean getJJP() {
        return isJJP;
    }

    public void setJJP(Boolean JJP) {
        isJJP = JJP;
    }

    public Boolean getHDP() {
        return isHDP;
    }

    public void setHDP(Boolean HDP) {
        isHDP = HDP;
    }

    public Boolean getZDP() {
        return isZDP;
    }

    public void setZDP(Boolean ZDP) {
        isZDP = ZDP;
    }

    public Boolean getMDQH() {
        return isMDQH;
    }

    public void setMDQH(Boolean MDQH) {
        isMDQH = MDQH;
    }

    public String getUpdateOperatorGUID() {
        return updateOperatorGUID;
    }

    public void setUpdateOperatorGUID(String updateOperatorGUID) {
        this.updateOperatorGUID = updateOperatorGUID;
    }

    public String getFyts() {
        return fyts;
    }

    public void setFyts(String fyts) {
        this.fyts = fyts;
    }

    public Integer getLchs() {
        return lchs;
    }

    public void setLchs(Integer lchs) {
        this.lchs = lchs;
    }

    public String getZtsm() {
        return ztsm;
    }

    public void setZtsm(String ztsm) {
        this.ztsm = ztsm;
    }

    public String getClsm() {
        return clsm;
    }

    public void setClsm(String clsm) {
        this.clsm = clsm;
    }

    public Boolean getTSKD() {
        return isTSKD;
    }

    public void setTSKD(Boolean TSKD) {
        isTSKD = TSKD;
    }

    public Integer getWaydaynum() {
        return waydaynum;
    }

    public void setWaydaynum(Integer waydaynum) {
        this.waydaynum = waydaynum;
    }

    public BigDecimal getFlje() {
        return flje;
    }

    public void setFlje(BigDecimal flje) {
        this.flje = flje;
    }

    public Boolean getBXP() {
        return isBXP;
    }

    public void setBXP(Boolean BXP) {
        isBXP = BXP;
    }

    public String getGnsxfl() {
        return gnsxfl;
    }

    public void setGnsxfl(String gnsxfl) {
        this.gnsxfl = gnsxfl;
    }

    public Boolean getMDDH() {
        return isMDDH;
    }

    public void setMDDH(Boolean MDDH) {
        isMDDH = MDDH;
    }

    public String getFxyhh() {
        return fxyhh;
    }

    public void setFxyhh(String fxyhh) {
        this.fxyhh = fxyhh;
    }

    public String getSsxkcyr() {
        return ssxkcyr;
    }

    public void setSsxkcyr(String ssxkcyr) {
        this.ssxkcyr = ssxkcyr;
    }

    public Boolean getNetSale() {
        return isNetSale;
    }

    public void setNetSale(Boolean netSale) {
        isNetSale = netSale;
    }

    public String getNetSaleNotes() {
        return netSaleNotes;
    }

    public void setNetSaleNotes(String netSaleNotes) {
        this.netSaleNotes = netSaleNotes;
    }

    public String getGG2() {
        return GG2;
    }

    public void setGG2(String GG2) {
        this.GG2 = GG2;
    }

    public Boolean getKHMZL() {
        return isKHMZL;
    }

    public void setKHMZL(Boolean KHMZL) {
        isKHMZL = KHMZL;
    }

    public String getFlxs() {
        return flxs;
    }

    public void setFlxs(String flxs) {
        this.flxs = flxs;
    }

    public String getFlxynr() {
        return flxynr;
    }

    public void setFlxynr(String flxynr) {
        this.flxynr = flxynr;
    }

    public String getFljhqd() {
        return fljhqd;
    }

    public void setFljhqd(String fljhqd) {
        this.fljhqd = fljhqd;
    }

    public BigDecimal getFlzsjj() {
        return flzsjj;
    }

    public void setFlzsjj(BigDecimal flzsjj) {
        this.flzsjj = flzsjj;
    }

    public LocalDate getFlrq() {
        return flrq;
    }

    public void setFlrq(LocalDate flrq) {
        this.flrq = flrq;
    }

    @Id
    @Column(name = "HH", nullable = false)
    private String hh;

    @Column(name = "PM")
    private String pm;

    @Column(name = "BM")
    private String bm;

    @Column(name = "CD")
    private String cd;

    @Column(name = "DWBH")
    private String dwbh;

    @Column(name = "DWMC")
    private String dwmc;

    @Column(name = "GG")
    private String gg;

    @Column(name = "PDW")
    private String pdw;

    @Column(name = "LDW")
    private String ldw;

    @Column(name = "MJL", nullable = false)
    private BigDecimal mjl = BigDecimal.ZERO;

    @Column(name = "MJZL")
    private String mjzl = "0";

    @Column(name = "JJ", nullable = false)
    private BigDecimal jj = BigDecimal.ZERO;

    @Column(name = "JJ_CKJ", nullable = false)
    private BigDecimal jjCkj = BigDecimal.ZERO;

    @Column(name = "CKJ", nullable = false)
    private BigDecimal ckj = BigDecimal.ZERO;

    @Column(name = "PFJ", nullable = false)
    private BigDecimal pfj = BigDecimal.ZERO;

    @Column(name = "LSJ", nullable = false)
    private BigDecimal lsj = BigDecimal.ZERO;

    @Column(name = "CBJ", nullable = false)
    private BigDecimal cbj = BigDecimal.ZERO;

    @Column(name = "YCBJ", nullable = false)
    private BigDecimal ycbj = BigDecimal.ZERO;

    @Column(name = "QCKC")
    private BigDecimal qckc = BigDecimal.ZERO;

    @Column(name = "SJSL")
    private BigDecimal sjsl = BigDecimal.ZERO;

    @Column(name = "XHSL")
    private BigDecimal xhsl = BigDecimal.ZERO;

    @Column(name = "XH")
    private BigDecimal xh = BigDecimal.ZERO;

    @Column(name = "JHSL")
    private BigDecimal jhsl = BigDecimal.ZERO;

    @Column(name = "QTFCSL")
    private BigDecimal qtfcsl = BigDecimal.ZERO;

    @Column(name = "QTSRSL")
    private BigDecimal qtsrsl = BigDecimal.ZERO;

    @Column(name = "MAX_SL")
    private BigDecimal maxSl = BigDecimal.ZERO;

    @Column(name = "MIN_SL")
    private BigDecimal minSl = BigDecimal.ZERO;

    @Column(name = "DY_TAG", nullable = false)
    private Boolean dyTag = Boolean.FALSE;

    @Column(name = "TJ_TAG", nullable = false)
    private Boolean tjTag = Boolean.FALSE;

    @Column(name = "HS_TAG", nullable = false)
    private Boolean hsTag = Boolean.FALSE;

    @Column(name = "CKJ_TAG", nullable = false)
    private Boolean ckjTag = Boolean.FALSE;

    @Column(name = "ZY")
    private String zy;

    @Column(name = "XQ_DATE")
    private LocalDateTime xqDate;

    @Column(name = "JH_DATE")
    private LocalDateTime jhDate;

    @Column(name = "XH_DATE")
    private LocalDateTime xhDate;

    @Column(name = "PFJ1", nullable = false)
    private BigDecimal PFJ1 = BigDecimal.ZERO;

    @Column(name = "SJ", nullable = false)
    private BigDecimal sj = BigDecimal.ZERO;

    @Column(name = "LS_JJ1", nullable = false)
    private BigDecimal lsJj1 = BigDecimal.ZERO;

    @Column(name = "LS_JJ2", nullable = false)
    private BigDecimal lsJj2 = BigDecimal.ZERO;

    @Column(name = "LS_JJ3", nullable = false)
    private BigDecimal lsJj3 = BigDecimal.ZERO;

    @Column(name = "KH")
    private String kh;

    @Column(name = "ZK")
    private BigDecimal zk = BigDecimal.ZERO;

    @Column(name = "ZZSL", nullable = false)
    private BigDecimal zzsl = BigDecimal.ZERO;

    @Column(name = "PM_ZJM")
    private String pmZjm;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "HH_TMP")
    private String hhTmp;

    @Column(name = "SJSL_LS")
    private BigDecimal sjslLs = BigDecimal.ZERO;

    @Column(name = "TCBL1")
    private BigDecimal TCBL1 = BigDecimal.ZERO;

    @Column(name = "TCBL2")
    private BigDecimal TCBL2 = BigDecimal.ZERO;

    @Column(name = "TCBL3")
    private BigDecimal TCBL3 = BigDecimal.ZERO;

    @Column(name = "PH1")
    private String PH1;

    @Column(name = "PH2")
    private String PH2;

    @Column(name = "PH3")
    private String PH3;

    @Column(name = "PH1_SL")
    private BigDecimal ph1Sl = BigDecimal.ZERO;

    @Column(name = "PH2_SL")
    private BigDecimal ph2Sl = BigDecimal.ZERO;

    @Column(name = "PH3_SL")
    private BigDecimal ph3Sl = BigDecimal.ZERO;

    @Column(name = "LSJ1", nullable = false)
    private BigDecimal LSJ1 = BigDecimal.ZERO;

    @Column(name = "BZSL")
    private BigDecimal bzsl = BigDecimal.ZERO;

    @Column(name = "SJ1", nullable = false)
    private BigDecimal SJ1 = BigDecimal.ZERO;

    @Column(name = "TM")
    private String tm;

    @Column(name = "PJ", nullable = false)
    private BigDecimal pj = BigDecimal.ZERO;

    @Column(name = "PDSL")
    private BigDecimal pdsl = BigDecimal.ZERO;

    @Column(name = "SYSL")
    private BigDecimal sysl = BigDecimal.ZERO;

    @Column(name = "SX")
    private String sx;

    @Column(name = "SPID")
    private String spid;

    @Column(name = "SFCF")
    private Boolean sfcf = Boolean.FALSE;

    @Column(name = "PZWH")
    private String pzwh;

    @Column(name = "SCDW")
    private String scdw;

    @Column(name = "SCRQ")
    private LocalDateTime scrq;

    @Column(name = "ZCSB")
    private String zcsb;

    @Column(name = "JJFF", nullable = false)
    private String jjff = "5";

    @Column(name = "FDeleted")
    private Boolean FDeleted = Boolean.FALSE;

    @Column(name = "SX1")
    private String SX1;

    @Column(name = "SX2")
    private String SX2;

    @Column(name = "DWMC1")
    private String DWMC1;

    @Column(name = "DWMC2")
    private String DWMC2;

    @Column(name = "JX")
    private String jx;

    @Column(name = "YSBZ")
    private String ysbz;

    @Column(name = "CCTJ")
    private String cctj;

    @Column(name = "TYBZ")
    private Boolean tybz = Boolean.FALSE;

    @Column(name = "SYBZ")
    private Boolean sybz = Boolean.FALSE;

    @Column(name = "DLS")
    private String dls;

    @Column(name = "BZGG")
    private String bzgg;

    @Column(name = "BZ1")
    private String BZ1;

    @Column(name = "BZ2")
    private String BZ2;

    @Column(name = "BZ3")
    private String BZ3;

    @Column(name = "BZ4")
    private String BZ4;

    @Column(name = "BZ5")
    private String BZ5;

    @Column(name = "BZBZ")
    private Boolean bzbz = Boolean.FALSE;

    @Column(name = "BZHH")
    private String bzhh;

    @Column(name = "BZL")
    private BigDecimal bzl = BigDecimal.ZERO;

    @Column(name = "ZBZL")
    private BigDecimal zbzl = BigDecimal.ZERO;

    @Column(name = "XQ")
    private BigDecimal xq = BigDecimal.ZERO;

    @Column(name = "KCSPID")
    private String kcspid;

    @Column(name = "XSSRID")
    private String xssrid;

    @Column(name = "XSCBID")
    private String xscbid;

    @Column(name = "KM1")
    private String KM1;

    @Column(name = "KM2")
    private String KM2;

    @Column(name = "KM3")
    private String KM3;

    @Column(name = "KM4")
    private String KM4;

    @Column(name = "KM5")
    private String KM5;

    @Column(name = "FOnlyMoney")
    private Boolean FOnlyMoney = Boolean.FALSE;

    @Column(name = "FIsYBPZ")
    private Boolean FIsYBPZ = Boolean.FALSE;

    @Column(name = "FIsGMP")
    private Boolean FIsGMP = Boolean.FALSE;

    @Column(name = "SCRQRequest")
    private Integer SCRQRequest = 0;

    @Column(name = "YXQRequest")
    private Integer YXQRequest = 0;

    @Column(name = "TCBL")
    private BigDecimal tcbl = BigDecimal.ZERO;

    @Column(name = "FIsRecipe")
    private Boolean FIsRecipe = Boolean.TRUE;

    @Column(name = "FSjbl")
    private BigDecimal FSjbl = BigDecimal.ZERO;

    @Column(name = "FTsbz")
    private Boolean FTsbz = Boolean.FALSE;

    @Column(name = "HYJ", nullable = false)
    private BigDecimal hyj = BigDecimal.ZERO;

    @Column(name = "IsColorSize")
    private Boolean isColorSize = Boolean.FALSE;

    @Column(name = "NoAbate")
    private Boolean noAbate = Boolean.FALSE;

    @Column(name = "c_gx")
    private String cGx;

    @Column(name = "c_xz")
    private String cXz;

    @Column(name = "c_yhly")
    private String cYhly;

    @Column(name = "c_zdyh")
    private Boolean cZdyh = Boolean.FALSE;

    @Column(name = "Guid", nullable = false)
    private String guid = "newid()";

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Column(name = "UpdateDate")
    private LocalDateTime updateDate;

    @Column(name = "C_ypfl")
    private String cYpfl;

    @Column(name = "StockTaxRate")
    private BigDecimal stockTaxRate = BigDecimal.ZERO;

    @Column(name = "HYZK")
    private BigDecimal hyzk = BigDecimal.ZERO;

    @Column(name = "MaterielDiscountRateID")
    private String materielDiscountRateID;

    @Column(name = "GSPSortID")
    private String GSPSortID;

    @Column(name = "MaterielImage")
    private String materielImage;

    @Column(name = "IsCourtesyCard")
    private Boolean isCourtesyCard = Boolean.FALSE;

    @Column(name = "CourtesyCardTypeID")
    private String courtesyCardTypeID;

    @Column(name = "ParValue")
    private BigDecimal parValue = BigDecimal.ZERO;

    @Column(name = "IsSalesPromotion")
    private Boolean isSalesPromotion = Boolean.FALSE;

    @Column(name = "InOutStatus")
    private Integer inOutStatus = 0;

    @Column(name = "BranchGuid")
    private String branchGuid;

    @Column(name = "FDATE")
    private LocalDateTime fdate;

    @Column(name = "BH")
    private String bh;

    @Column(name = "GHQY")
    private String ghqy;

    @Column(name = "GMPZSH")
    private String gmpzsh;

    @Column(name = "GMPRZRQ")
    private LocalDateTime gmprzrq;

    @Column(name = "GMPRZXQ")
    private LocalDateTime gmprzxq;

    @Column(name = "CCJYBGS")
    private String ccjybgs;

    @Column(name = "SYJYBGS")
    private String syjybgs;

    @Column(name = "SYJYJL")
    private String syjyjl;

    @Column(name = "CGYY")
    private String cgyy;

    @Column(name = "CGY")
    private String cgy;

    @Column(name = "YJ_YW")
    private String yjYw;

    @Column(name = "JL_YW")
    private String jlYw;

    @Column(name = "RQ_YW")
    private LocalDateTime rqYw;

    @Column(name = "YJ_ZG")
    private String yjZg;

    @Column(name = "JL_ZG")
    private String jlZg;

    @Column(name = "RQ_ZG")
    private LocalDateTime rqZg;

    @Column(name = "YJ_WJ")
    private String yjWj;

    @Column(name = "JL_WJ")
    private String jlWj;

    @Column(name = "RQ_WJ")
    private LocalDateTime rqWj;

    @Column(name = "YJ_JL")
    private String yjJl;

    @Column(name = "YPQK")
    private String ypqk;

    @Column(name = "ZYX1")
    private String ZYX1;

    @Column(name = "ZYX2")
    private String ZYX2;

    @Column(name = "ZYX3")
    private String ZYX3;

    @Column(name = "ZYX4")
    private String ZYX4;

    @Column(name = "HGBZ")
    private Boolean hgbz = Boolean.FALSE;

    @Column(name = "SPRY")
    private String spry;

    @Column(name = "bqsms")
    private String bqsms;

    @Column(name = "wcbz")
    private Boolean wcbz = Boolean.FALSE;

    @Column(name = "GJXJ")
    private BigDecimal gjxj = BigDecimal.ZERO;

    @Column(name = "CKJJ")
    private BigDecimal ckjj = BigDecimal.ZERO;

    @Column(name = "GYS")
    private String gys;

    @Column(name = "GYSLB")
    private String gyslb;

    @Column(name = "GYSDB")
    private String gysdb;

    @Column(name = "SQWTQX")
    private LocalDateTime sqwtqx;

    @Column(name = "CKGL")
    private String ckgl;

    @Column(name = "GNDLS")
    private String gndls;

    @Column(name = "JKZCZH")
    private String jkzczh;

    @Column(name = "JKKA")
    private String jkka;

    @Column(name = "XKZQX")
    private LocalDateTime xkzqx;

    @Column(name = "YHCS")
    private String yhcs;

    @Column(name = "WJPW")
    private String wjpw;

    @Column(name = "YPBZ")
    private Boolean ypbz = Boolean.FALSE;

    @Column(name = "YSRKYXQBZ")
    private Boolean ysrkyxqbz = Boolean.FALSE;

    @Column(name = "SYYSTXBZ")
    private Boolean syystxbz = Boolean.FALSE;

    @Column(name = "YSZDBZ")
    private Boolean yszdbz = Boolean.FALSE;

    @Column(name = "SRYSFHBZ")
    private Boolean srysfhbz = Boolean.FALSE;

    @Column(name = "BCYHYJFBZ")
    private Boolean bcyhyjfbz = Boolean.FALSE;

    @Column(name = "CHDSDZBZ")
    private Boolean chdsdzbz = Boolean.FALSE;

    @Column(name = "CFHJDW")
    private String cfhjdw;

    @Column(name = "CFHJLSJ")
    private BigDecimal cfhjlsj = BigDecimal.ZERO;

    @Column(name = "CHDYJDHSGX")
    private Integer chdyjdhsgx = 0;

    @Column(name = "XPZGZBZ")
    private Integer xpzgzbz = 0;

    @Column(name = "XPZGZQX")
    private LocalDateTime xpzgzqx;

    @Column(name = "LSJGLLB")
    private String lsjgllb;

    @Column(name = "CGXJ")
    private BigDecimal cgxj = BigDecimal.ZERO;

    @Column(name = "CGJCCGXJBZ")
    private Boolean cgjccgxjbz = Boolean.FALSE;

    @Column(name = "XJSBZ")
    private Boolean xjsbz = Boolean.FALSE;

    @Column(name = "RJKSXBZ")
    private Boolean rjksxbz = Boolean.FALSE;

    @Column(name = "KCSX")
    private BigDecimal kcsx = BigDecimal.ZERO;

    @Column(name = "KCXX")
    private BigDecimal kcxx = BigDecimal.ZERO;

    @Column(name = "XJKXXBZ")
    private Boolean xjkxxbz = Boolean.FALSE;

    @Column(name = "ABCFLSX")
    private String abcflsx;

    @Column(name = "ZTFLSX")
    private String ztflsx;

    @Column(name = "FZFLSX1")
    private String FZFLSX1;

    @Column(name = "FZFLSX2")
    private String FZFLSX2;

    @Column(name = "FZFLSX3")
    private String FZFLSX3;

    @Column(name = "FZFLSX4")
    private String FZFLSX4;

    @Column(name = "FZFLSX5")
    private String FZFLSX5;

    @Column(name = "IsAuditing")
    private Boolean isAuditing = Boolean.FALSE;

    @Column(name = "IsCancel")
    private Boolean isCancel = Boolean.FALSE;

    @Column(name = "LXTJBH")
    private String lxtjbh;

    @Column(name = "SaleChannel")
    private String saleChannel;

    @Column(name = "SaleArea")
    private String saleArea;

    @Column(name = "OperatorGuid")
    private String operatorGuid;

    @Column(name = "AuditingGuid")
    private String auditingGuid;

    @Column(name = "DJZT")
    private Boolean djzt = Boolean.FALSE;

    @Column(name = "VIPIntegralType")
    private String VIPIntegralType;

    @Column(name = "IsNeBalance")
    private Boolean isNeBalance = Boolean.FALSE;

    @Column(name = "AuditingDate")
    private LocalDateTime auditingDate;

    @Column(name = "jkpzbz")
    private Boolean jkpzbz = Boolean.FALSE;

    @Column(name = "zybz")
    private Boolean zybz = Boolean.FALSE;

    @Column(name = "lspszbz_tag")
    private Boolean lspszbzTag = Boolean.FALSE;

    @Column(name = "LargePackUnit")
    private String largePackUnit;

    @Column(name = "LargePackBarCode")
    private String largePackBarCode;

    @Column(name = "MiddlePackUnit")
    private String middlePackUnit;

    @Column(name = "MiddlePackBarCode")
    private String middlePackBarCode;

    @Column(name = "BalanceProperty")
    private Integer balanceProperty = 0;

    @Column(name = "MedicalInstrumentType")
    private String medicalInstrumentType;

    @Column(name = "IseggPreparation")
    private Boolean iseggPreparation = Boolean.FALSE;

    @Column(name = "IsTwoClassMentalDrug")
    private Boolean isTwoClassMentalDrug = Boolean.FALSE;

    @Column(name = "IsEphedrine")
    private Boolean isEphedrine = Boolean.FALSE;

    @Column(name = "IsTLHormone")
    private Boolean isTLHormone = Boolean.FALSE;

    @Column(name = "IsMindDrug")
    private Boolean isMindDrug = Boolean.FALSE;

    @Column(name = "IsDangerChemistry")
    private Boolean isDangerChemistry = Boolean.FALSE;

    @Column(name = "MaterialImage")
    private String materialImage;

    @Column(name = "IsPick")
    private Boolean isPick = Boolean.FALSE;

    @Column(name = "ISSELECTBATCH")
    private Integer isselectbatch = 0;

    @Column(name = "StockRecAllRegJJ")
    private Boolean stockRecAllRegJJ = Boolean.FALSE;

    @Column(name = "IsGift")
    private Boolean isGift = Boolean.FALSE;

    @Column(name = "DefaultStockId")
    private String defaultStockId;

    @Column(name = "tcfs")
    private String tcfs;

    @Column(name = "jgd")
    private String jgd;

    @Column(name = "PriceBeltType")
    private String priceBeltType;

    @Column(name = "salespromotiontypeid")
    private String salespromotiontypeid;

    @Column(name = "ismonitor")
    private Boolean ismonitor = Boolean.FALSE;

    @Column(name = "ESSENTIALDRUGLIST")
    private String essentialdruglist;

    @Column(name = "IsControlSellScope")
    private Integer isControlSellScope;

    @Column(name = "IsSellSplitSmallPack")
    private Integer isSellSplitSmallPack;

    @Column(name = "SmallPackage")
    private BigDecimal smallPackage = BigDecimal.ZERO;

    @Column(name = "IsAgreementbreed")
    private Boolean isAgreementbreed = Boolean.FALSE;

    @Column(name = "MaterielStatus")
    private String materielStatus;

    @Column(name = "MaterielDescAwake")
    private String materielDescAwake;

    @Column(name = "GROUPCONTROLPURTYPE")
    private String groupcontrolpurtype;

    @Column(name = "SeasonClass")
    private String seasonClass;

    @Column(name = "CoreItemsClass")
    private String coreItemsClass;

    @Column(name = "RequireClass")
    private String requireClass;

    @Column(name = "Stockid")
    private String stockid;

    @Column(name = "AREARANGEDESCIBEID")
    private String arearangedescibeid;

    @Column(name = "BRANDATTRIBUTE")
    private String brandattribute;

    @Column(name = "forbiddenreason")
    private String forbiddenreason;

    @Column(name = "stoppurchasereason")
    private String stoppurchasereason;

    @Column(name = "ISANAESTHETIC")
    private Boolean isanaesthetic = Boolean.FALSE;

    @Column(name = "ISLOWTEMPERATURE")
    private Boolean islowtemperature = Boolean.FALSE;

    @Column(name = "AutoCode")
    private String autoCode;

    @Column(name = "IsMedicaltoxicity")
    private Boolean isMedicaltoxicity = Boolean.FALSE;

    @Column(name = "IsVaccine")
    private Boolean isVaccine = Boolean.FALSE;

    @Column(name = "IsDiagnosticreagent")
    private Boolean isDiagnosticreagent = Boolean.FALSE;

    @Column(name = "IsStimulant")
    private Boolean isStimulant = Boolean.FALSE;

    @Column(name = "IsEan1")
    private Boolean isEan1 = Boolean.FALSE;

    @Column(name = "IsEan2")
    private Boolean isEan2 = Boolean.FALSE;

    @Column(name = "ISHealthFoods")
    private Boolean ISHealthFoods = Boolean.FALSE;

    @Column(name = "ISFOOD")
    private Boolean isfood = Boolean.FALSE;

    @Column(name = "IsValuAbleBreed")
    private Boolean isValuAbleBreed = Boolean.FALSE;

    @Column(name = "IsRecordBigLsh")
    private Boolean isRecordBigLsh = Boolean.FALSE;

    @Column(name = "IsKeepPriceBreed")
    private Boolean isKeepPriceBreed = Boolean.FALSE;

    @Column(name = "SubDirct")
    private Boolean subDirct = Boolean.FALSE;

    @Column(name = "IsSalePromotion")
    private Integer isSalePromotion;

    @Column(name = "IsPriceSetByFactory")
    private Boolean isPriceSetByFactory = Boolean.FALSE;

    @Column(name = "MaterielLong")
    private BigDecimal materielLong = BigDecimal.ZERO;

    @Column(name = "MaterielWidth")
    private BigDecimal materielWidth = BigDecimal.ZERO;

    @Column(name = "Materielhigh")
    private BigDecimal materielhigh = BigDecimal.ZERO;

    @Column(name = "HistoryCode")
    private String historyCode;

    @Column(name = "ReserveListCode")
    private String reserveListCode;

    @Column(name = "GrossRateType")
    private String grossRateType;

    @Column(name = "GroupPurchBranchGuid")
    private String groupPurchBranchGuid;

    @Column(name = "FinanceType")
    private String financeType;

    @Column(name = "PurchaseBalance")
    private String purchaseBalance;

    @Column(name = "TakeMoneyType")
    private String takeMoneyType;

    @Column(name = "StoreSreQuireClass")
    private String storeSreQuireClass;

    @Column(name = "PZWHXQ")
    private LocalDateTime pzwhxq;

    @Column(name = "ZZQX")
    private LocalDateTime zzqx;

    @Column(name = "YYZYXKZXQ")
    private LocalDateTime yyzyxkzxq;

    @Column(name = "PROPRICEMAKEDATE")
    private LocalDateTime propricemakedate;

    @Column(name = "AREARANGEDESCIBE")
    private String arearangedescibe;

    @Column(name = "MATERIELDESCAWAKEID")
    private String materieldescawakeid;

    @Column(name = "ProManageRetailPrice")
    private BigDecimal proManageRetailPrice = BigDecimal.ZERO;

    @Column(name = "BaseMaterielRetailPrice")
    private BigDecimal baseMaterielRetailPrice = BigDecimal.ZERO;

    @Column(name = "TrayQuantity")
    private BigDecimal trayQuantity = BigDecimal.ZERO;

    @Column(name = "BaseMaterielGuidePrice")
    private BigDecimal baseMaterielGuidePrice = BigDecimal.ZERO;

    @Column(name = "CountryLimitPriceAdjustDate")
    private LocalDateTime countryLimitPriceAdjustDate;

    @Column(name = "SmallPackUnit")
    private String smallPackUnit;

    @Column(name = "YSRY")
    private String ysry;

    @Column(name = "YSYWY")
    private String ysywy;

    @Column(name = "LASTBALANCEPRICE")
    private BigDecimal lastbalanceprice;

    @Column(name = "CFFLSX")
    private String cfflsx;

    @Column(name = "LCYYFL")
    private String lcyyfl;

    @Column(name = "KFYTS")
    private Integer kfyts;

    @Column(name = "ZZRS_TAG")
    private Boolean zzrsTag = Boolean.FALSE;

    @Column(name = "ZYC_TAG")
    private Boolean zycTag = Boolean.FALSE;

    @Column(name = "IsCheckMediDevices")
    private Integer isCheckMediDevices = 0;

    @Column(name = "IsInvoice")
    private Boolean isInvoice = Boolean.FALSE;

    /**
     * 任务品
     */
    @Column(name = "IsRWP")
    private Boolean isRWP = Boolean.FALSE;

    /**
     * 竞价品
     */
    @Column(name = "IsJJP")
    private Boolean isJJP = Boolean.FALSE;

    /**
     * 活动品
     */
    @Column(name = "IsHDP")
    private Boolean isHDP = Boolean.FALSE;

    /**
     * 重点品
     */
    @Column(name = "IsZDP")
    private Boolean isZDP = Boolean.FALSE;

    /**
     * 是否允许门店请货
     */
    @Column(name = "IsMDQH")
    private Boolean isMDQH = Boolean.TRUE;

    /**
     * 最后修改档案人员GUID
     */
    @Column(name = "UpdateOperatorGUID")
    private String updateOperatorGUID;

    @Column(name = "FYTS", nullable = false)
    private String fyts = "0";

    /**
     * 疗程盒数
     */
    @Column(name = "LCHS", nullable = false)
    private Integer lchs = 0;

    /**
     * 主推说明
     */
    @Column(name = "ZTSM")
    private String ztsm;

    /**
     * 陈列说明
     */
    @Column(name = "CLSM")
    private String clsm;

    /**
     * 门店销售特殊开单
     */
    @Column(name = "IsTSKD")
    private Boolean isTSKD = Boolean.FALSE;

    /**
     * 采购在途
     */
    @Column(name = "WAYDAYNUM")
    private Integer waydaynum = 0;

    /**
     * 返利金额
     */
    @Column(name = "FLJE")
    private BigDecimal flje = BigDecimal.ZERO;

    /**
     * 备选品
     */
    @Column(name = "IsBXP")
    private Boolean isBXP = Boolean.FALSE;

    /**
     * 商品功能属性分类
     */
    @Column(name = "GNSXFL")
    private String gnsxfl;

    /**
     * 是否门店订货
     */
    @Column(name = "IsMDDH")
    private Boolean isMDDH = Boolean.FALSE;

    /**
     * 分析用货号
     */
    @Column(name = "FXYHH")
    private String fxyhh;

    /**
     * 上市许可持有人
     */
    @Column(name = "SSXKCYR")
    private String ssxkcyr;

    /**
     * 是否允许网络销售
     */
    @Column(name = "IsNetSale")
    private Boolean isNetSale = Boolean.TRUE;

    @Column(name = "NetSaleNotes")
    private String netSaleNotes;

    @Column(name = "GG2")
    private String GG2;

    /**
     * 考核满足率
     */
    @Column(name = "IsKHMZL")
    private Boolean isKHMZL = Boolean.TRUE;

    /**
     * 返利形式
     */
    @Column(name = "flxs")
    private String flxs;

    /**
     * 返利协议内容
     */
    @Column(name = "flxynr")
    private String flxynr;

    /**
     * 返利进货渠道
     */
    @Column(name = "fljhqd")
    private String fljhqd;

    /**
     * 返利真实进价
     */
    @Column(name = "flzsjj")
    private BigDecimal flzsjj;

    /**
     * 返利日期
     */
    @Column(name = "flrq")
    private LocalDate flrq;
}
