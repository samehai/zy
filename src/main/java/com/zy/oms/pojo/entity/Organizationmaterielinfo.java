package com.zy.oms.pojo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORGANIZATIONMATERIELINFO")
public class Organizationmaterielinfo {

    @Id
    @Column(name = "GUID", nullable = false)
    private String guid = "newid()";

    @Column(name = "MATERIELGUID")
    private String materielguid;

    @Column(name = "MATERIELCODE")
    private String materielcode;

    @Column(name = "RETAILPRICE")
    private BigDecimal retailprice = BigDecimal.ZERO;

    @Column(name = "TRADEPRICE")
    private BigDecimal tradeprice = BigDecimal.ZERO;

    @Column(name = "FACTPRICE")
    private BigDecimal factprice = BigDecimal.ZERO;

    @Column(name = "MEMBERPRICE")
    private BigDecimal memberprice = BigDecimal.ZERO;

    @Column(name = "TAXRATE")
    private BigDecimal taxrate = new BigDecimal("17");

    @Column(name = "COSTPRICE")
    private BigDecimal costprice = BigDecimal.ZERO;

    @Column(name = "LASTPRICE")
    private BigDecimal lastprice = BigDecimal.ZERO;

    @Column(name = "LASTPURCHASEINDATE")
    private LocalDateTime lastpurchaseindate;

    @Column(name = "LASTSELLDATE")
    private LocalDateTime lastselldate;

    @Column(name = "BASESELLPRICE")
    private BigDecimal basesellprice = BigDecimal.ZERO;

    @Column(name = "TAKEMONEYINFO")
    private BigDecimal takemoneyinfo = BigDecimal.ZERO;

    @Column(name = "UNLINEARITYMATERIEL_TAG")
    private Integer unlinearitymaterielTag = 0;

    @Column(name = "RETAILNOTABATE_TAG")
    private Integer retailnotabateTag = 0;

    @Column(name = "FAVOURABLETYPE")
    private String favourabletype;

    @Column(name = "RETAILPRICEMANAGETYPE")
    private String retailpricemanagetype;

    @Column(name = "SENDGOODSNOTSPLIT_TAG")
    private Integer sendgoodsnotsplitTag = 0;

    @Column(name = "NOTJOINADDCONSUME_TAG")
    private Integer notjoinaddconsumeTag = 0;

    @Column(name = "NOTJOINMEMBERINTEGRAL_TAG")
    private Integer notjoinmemberintegralTag = 0;

    @Column(name = "MEMBERMATERIELREBATETYPE")
    private String membermaterielrebatetype;

    @Column(name = "MEMBERINTEGRALTYPE")
    private String memberintegraltype;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "CREATEDATE")
    private LocalDateTime createdate;

    @Column(name = "UPDATEDATE")
    private LocalDateTime updatedate;

    @Column(name = "ISSTOPSELL")
    private Integer isstopsell = 0;

    @Column(name = "STOPSELLDATE")
    private LocalDateTime stopselldate;

    @Column(name = "STOPSELLGUID")
    private String stopsellguid;

    @Column(name = "ISSTOPSTOCK")
    private Integer isstopstock = 0;

    @Column(name = "STOPSTOCKDATE")
    private LocalDateTime stopstockdate;

    @Column(name = "STOPSTOCKGUID")
    private String stopstockguid;

    @Column(name = "FDELETE")
    private Integer fdelete = 0;

    @Column(name = "FDELETEDATE")
    private LocalDateTime fdeletedate;

    @Column(name = "FDELETEGUID")
    private String fdeleteguid;

    @Column(name = "OPERATORGUID")
    private String operatorguid;

    @Column(name = "BRANCHGUID")
    private String branchguid;

    @Column(name = "LIMITDAYS")
    private Integer limitdays = 0;

    @Column(name = "MINIMUMDAYS")
    private Integer minimumdays = 0;

    @Column(name = "HALFQUARTERSALES")
    private BigDecimal halfquartersales = BigDecimal.ZERO;

    @Column(name = "AVERAGEMONTHLYSALES")
    private BigDecimal averagemonthlysales = BigDecimal.ZERO;

    @Column(name = "AVERAGEDAYSALES")
    private BigDecimal averagedaysales = BigDecimal.ZERO;

    @Column(name = "AVERAGEMOTHLYSTOCK")
    private BigDecimal averagemothlystock = BigDecimal.ZERO;

    @Column(name = "AVERAGEWEEKLYSTOCK")
    private BigDecimal averageweeklystock = BigDecimal.ZERO;

    @Column(name = "FIRSTSTORAGEDATE")
    private LocalDateTime firststoragedate;

    @Column(name = "MINQUANTITY")
    private BigDecimal minquantity = BigDecimal.ZERO;

    @Column(name = "MAXQUANTITY")
    private BigDecimal maxquantity = BigDecimal.ZERO;

    @Column(name = "CURRNETSTOCK")
    private BigDecimal currnetstock = BigDecimal.ZERO;

    @Column(name = "PLANQUANTITY")
    private BigDecimal planquantity = BigDecimal.ZERO;

    @Column(name = "CALCUTEQUANTITY")
    private BigDecimal calcutequantity = BigDecimal.ZERO;

    @Column(name = "LASTSTOCK")
    private String laststock;

    @Column(name = "APPLYABCLB")
    private String applyabclb;

    @Column(name = "AVEMONTHAMOUNT")
    private BigDecimal avemonthamount = BigDecimal.ZERO;

    @Column(name = "AMONTPERCENTAGE")
    private BigDecimal amontpercentage = BigDecimal.ZERO;

    @Column(name = "AMONTPERCENTAGECUMUL")
    private BigDecimal amontpercentagecumul = BigDecimal.ZERO;

    @Column(name = "HISTORYCODE")
    private String historycode;

    @Column(name = "AVERAGEALLSALES")
    private BigDecimal averageallsales = BigDecimal.ZERO;

    @Column(name = "AVERAGEALLSTOCK")
    private BigDecimal averageallstock = BigDecimal.ZERO;

    @Column(name = "ISNEWPRICETAG")
    private Integer isnewpricetag = 0;

    @Column(name = "KH")
    private String kh;

    @Column(name = "GJXJ")
    private BigDecimal gjxj = BigDecimal.ZERO;

    @Column(name = "TAKEMONEYTYPE")
    private String takemoneytype = "NULL";

    @Column(name = "SELLCOSTREBATE")
    private BigDecimal sellcostrebate = BigDecimal.ZERO;

    @Column(name = "SUPPERCODE")
    private String suppercode;

    @Column(name = "EMPLOYEECODE")
    private String employeecode;

    @Column(name = "ISNOTUSEING")
    private Integer isnotuseing;

    @Column(name = "MAXDISPLAY")
    private BigDecimal maxdisplay;

    @Column(name = "SUBDIRCT")
    private Integer subdirct = 0;

    @Column(name = "THISMONTHSELLQUANTITY")
    private BigDecimal thismonthsellquantity = BigDecimal.ZERO;

    @Column(name = "PREMONTHSELLQUANTITY")
    private BigDecimal premonthsellquantity = BigDecimal.ZERO;

    @Column(name = "FORBIDDENREASON")
    private String forbiddenreason;

    @Column(name = "STOPPURCHASEREASON")
    private String stoppurchasereason;

    @Column(name = "STOPSALEREASON")
    private String stopsalereason;

    @Column(name = "IsMustPurchase")
    private Integer isMustPurchase = 0;

    @Column(name = "SplitRetailPrice")
    private BigDecimal splitRetailPrice = BigDecimal.ZERO;

    @Column(name = "SplitMemberPrice")
    private BigDecimal splitMemberPrice = BigDecimal.ZERO;

    @Column(name = "SALESPROMOTIONTYPEID")
    private String salespromotiontypeid;

    @Column(name = "SaleAnalyzeResult")
    private String saleAnalyzeResult;

    @Column(name = "IsChanged")
    private Boolean isChanged;

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setMaterielguid(String materielguid) {
        this.materielguid = materielguid;
    }

    public String getMaterielguid() {
        return materielguid;
    }

    public void setMaterielcode(String materielcode) {
        this.materielcode = materielcode;
    }

    public String getMaterielcode() {
        return materielcode;
    }

    public void setRetailprice(BigDecimal retailprice) {
        this.retailprice = retailprice;
    }

    public BigDecimal getRetailprice() {
        return retailprice;
    }

    public void setTradeprice(BigDecimal tradeprice) {
        this.tradeprice = tradeprice;
    }

    public BigDecimal getTradeprice() {
        return tradeprice;
    }

    public void setFactprice(BigDecimal factprice) {
        this.factprice = factprice;
    }

    public BigDecimal getFactprice() {
        return factprice;
    }

    public void setMemberprice(BigDecimal memberprice) {
        this.memberprice = memberprice;
    }

    public BigDecimal getMemberprice() {
        return memberprice;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setLastprice(BigDecimal lastprice) {
        this.lastprice = lastprice;
    }

    public BigDecimal getLastprice() {
        return lastprice;
    }

    public void setLastpurchaseindate(LocalDateTime lastpurchaseindate) {
        this.lastpurchaseindate = lastpurchaseindate;
    }

    public LocalDateTime getLastpurchaseindate() {
        return lastpurchaseindate;
    }

    public void setLastselldate(LocalDateTime lastselldate) {
        this.lastselldate = lastselldate;
    }

    public LocalDateTime getLastselldate() {
        return lastselldate;
    }

    public void setBasesellprice(BigDecimal basesellprice) {
        this.basesellprice = basesellprice;
    }

    public BigDecimal getBasesellprice() {
        return basesellprice;
    }

    public void setTakemoneyinfo(BigDecimal takemoneyinfo) {
        this.takemoneyinfo = takemoneyinfo;
    }

    public BigDecimal getTakemoneyinfo() {
        return takemoneyinfo;
    }

    public void setUnlinearitymaterielTag(Integer unlinearitymaterielTag) {
        this.unlinearitymaterielTag = unlinearitymaterielTag;
    }

    public Integer getUnlinearitymaterielTag() {
        return unlinearitymaterielTag;
    }

    public void setRetailnotabateTag(Integer retailnotabateTag) {
        this.retailnotabateTag = retailnotabateTag;
    }

    public Integer getRetailnotabateTag() {
        return retailnotabateTag;
    }

    public void setFavourabletype(String favourabletype) {
        this.favourabletype = favourabletype;
    }

    public String getFavourabletype() {
        return favourabletype;
    }

    public void setRetailpricemanagetype(String retailpricemanagetype) {
        this.retailpricemanagetype = retailpricemanagetype;
    }

    public String getRetailpricemanagetype() {
        return retailpricemanagetype;
    }

    public void setSendgoodsnotsplitTag(Integer sendgoodsnotsplitTag) {
        this.sendgoodsnotsplitTag = sendgoodsnotsplitTag;
    }

    public Integer getSendgoodsnotsplitTag() {
        return sendgoodsnotsplitTag;
    }

    public void setNotjoinaddconsumeTag(Integer notjoinaddconsumeTag) {
        this.notjoinaddconsumeTag = notjoinaddconsumeTag;
    }

    public Integer getNotjoinaddconsumeTag() {
        return notjoinaddconsumeTag;
    }

    public void setNotjoinmemberintegralTag(Integer notjoinmemberintegralTag) {
        this.notjoinmemberintegralTag = notjoinmemberintegralTag;
    }

    public Integer getNotjoinmemberintegralTag() {
        return notjoinmemberintegralTag;
    }

    public void setMembermaterielrebatetype(String membermaterielrebatetype) {
        this.membermaterielrebatetype = membermaterielrebatetype;
    }

    public String getMembermaterielrebatetype() {
        return membermaterielrebatetype;
    }

    public void setMemberintegraltype(String memberintegraltype) {
        this.memberintegraltype = memberintegraltype;
    }

    public String getMemberintegraltype() {
        return memberintegraltype;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setUpdatedate(LocalDateTime updatedate) {
        this.updatedate = updatedate;
    }

    public LocalDateTime getUpdatedate() {
        return updatedate;
    }

    public void setIsstopsell(Integer isstopsell) {
        this.isstopsell = isstopsell;
    }

    public Integer getIsstopsell() {
        return isstopsell;
    }

    public void setStopselldate(LocalDateTime stopselldate) {
        this.stopselldate = stopselldate;
    }

    public LocalDateTime getStopselldate() {
        return stopselldate;
    }

    public void setStopsellguid(String stopsellguid) {
        this.stopsellguid = stopsellguid;
    }

    public String getStopsellguid() {
        return stopsellguid;
    }

    public void setIsstopstock(Integer isstopstock) {
        this.isstopstock = isstopstock;
    }

    public Integer getIsstopstock() {
        return isstopstock;
    }

    public void setStopstockdate(LocalDateTime stopstockdate) {
        this.stopstockdate = stopstockdate;
    }

    public LocalDateTime getStopstockdate() {
        return stopstockdate;
    }

    public void setStopstockguid(String stopstockguid) {
        this.stopstockguid = stopstockguid;
    }

    public String getStopstockguid() {
        return stopstockguid;
    }

    public void setFdelete(Integer fdelete) {
        this.fdelete = fdelete;
    }

    public Integer getFdelete() {
        return fdelete;
    }

    public void setFdeletedate(LocalDateTime fdeletedate) {
        this.fdeletedate = fdeletedate;
    }

    public LocalDateTime getFdeletedate() {
        return fdeletedate;
    }

    public void setFdeleteguid(String fdeleteguid) {
        this.fdeleteguid = fdeleteguid;
    }

    public String getFdeleteguid() {
        return fdeleteguid;
    }

    public void setOperatorguid(String operatorguid) {
        this.operatorguid = operatorguid;
    }

    public String getOperatorguid() {
        return operatorguid;
    }

    public void setBranchguid(String branchguid) {
        this.branchguid = branchguid;
    }

    public String getBranchguid() {
        return branchguid;
    }

    public void setLimitdays(Integer limitdays) {
        this.limitdays = limitdays;
    }

    public Integer getLimitdays() {
        return limitdays;
    }

    public void setMinimumdays(Integer minimumdays) {
        this.minimumdays = minimumdays;
    }

    public Integer getMinimumdays() {
        return minimumdays;
    }

    public void setHalfquartersales(BigDecimal halfquartersales) {
        this.halfquartersales = halfquartersales;
    }

    public BigDecimal getHalfquartersales() {
        return halfquartersales;
    }

    public void setAveragemonthlysales(BigDecimal averagemonthlysales) {
        this.averagemonthlysales = averagemonthlysales;
    }

    public BigDecimal getAveragemonthlysales() {
        return averagemonthlysales;
    }

    public void setAveragedaysales(BigDecimal averagedaysales) {
        this.averagedaysales = averagedaysales;
    }

    public BigDecimal getAveragedaysales() {
        return averagedaysales;
    }

    public void setAveragemothlystock(BigDecimal averagemothlystock) {
        this.averagemothlystock = averagemothlystock;
    }

    public BigDecimal getAveragemothlystock() {
        return averagemothlystock;
    }

    public void setAverageweeklystock(BigDecimal averageweeklystock) {
        this.averageweeklystock = averageweeklystock;
    }

    public BigDecimal getAverageweeklystock() {
        return averageweeklystock;
    }

    public void setFirststoragedate(LocalDateTime firststoragedate) {
        this.firststoragedate = firststoragedate;
    }

    public LocalDateTime getFirststoragedate() {
        return firststoragedate;
    }

    public void setMinquantity(BigDecimal minquantity) {
        this.minquantity = minquantity;
    }

    public BigDecimal getMinquantity() {
        return minquantity;
    }

    public void setMaxquantity(BigDecimal maxquantity) {
        this.maxquantity = maxquantity;
    }

    public BigDecimal getMaxquantity() {
        return maxquantity;
    }

    public void setCurrnetstock(BigDecimal currnetstock) {
        this.currnetstock = currnetstock;
    }

    public BigDecimal getCurrnetstock() {
        return currnetstock;
    }

    public void setPlanquantity(BigDecimal planquantity) {
        this.planquantity = planquantity;
    }

    public BigDecimal getPlanquantity() {
        return planquantity;
    }

    public void setCalcutequantity(BigDecimal calcutequantity) {
        this.calcutequantity = calcutequantity;
    }

    public BigDecimal getCalcutequantity() {
        return calcutequantity;
    }

    public void setLaststock(String laststock) {
        this.laststock = laststock;
    }

    public String getLaststock() {
        return laststock;
    }

    public void setApplyabclb(String applyabclb) {
        this.applyabclb = applyabclb;
    }

    public String getApplyabclb() {
        return applyabclb;
    }

    public void setAvemonthamount(BigDecimal avemonthamount) {
        this.avemonthamount = avemonthamount;
    }

    public BigDecimal getAvemonthamount() {
        return avemonthamount;
    }

    public void setAmontpercentage(BigDecimal amontpercentage) {
        this.amontpercentage = amontpercentage;
    }

    public BigDecimal getAmontpercentage() {
        return amontpercentage;
    }

    public void setAmontpercentagecumul(BigDecimal amontpercentagecumul) {
        this.amontpercentagecumul = amontpercentagecumul;
    }

    public BigDecimal getAmontpercentagecumul() {
        return amontpercentagecumul;
    }

    public void setHistorycode(String historycode) {
        this.historycode = historycode;
    }

    public String getHistorycode() {
        return historycode;
    }

    public void setAverageallsales(BigDecimal averageallsales) {
        this.averageallsales = averageallsales;
    }

    public BigDecimal getAverageallsales() {
        return averageallsales;
    }

    public void setAverageallstock(BigDecimal averageallstock) {
        this.averageallstock = averageallstock;
    }

    public BigDecimal getAverageallstock() {
        return averageallstock;
    }

    public void setIsnewpricetag(Integer isnewpricetag) {
        this.isnewpricetag = isnewpricetag;
    }

    public Integer getIsnewpricetag() {
        return isnewpricetag;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getKh() {
        return kh;
    }

    public void setGjxj(BigDecimal gjxj) {
        this.gjxj = gjxj;
    }

    public BigDecimal getGjxj() {
        return gjxj;
    }

    public void setTakemoneytype(String takemoneytype) {
        this.takemoneytype = takemoneytype;
    }

    public String getTakemoneytype() {
        return takemoneytype;
    }

    public void setSellcostrebate(BigDecimal sellcostrebate) {
        this.sellcostrebate = sellcostrebate;
    }

    public BigDecimal getSellcostrebate() {
        return sellcostrebate;
    }

    public void setSuppercode(String suppercode) {
        this.suppercode = suppercode;
    }

    public String getSuppercode() {
        return suppercode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setIsnotuseing(Integer isnotuseing) {
        this.isnotuseing = isnotuseing;
    }

    public Integer getIsnotuseing() {
        return isnotuseing;
    }

    public void setMaxdisplay(BigDecimal maxdisplay) {
        this.maxdisplay = maxdisplay;
    }

    public BigDecimal getMaxdisplay() {
        return maxdisplay;
    }

    public void setSubdirct(Integer subdirct) {
        this.subdirct = subdirct;
    }

    public Integer getSubdirct() {
        return subdirct;
    }

    public void setThismonthsellquantity(BigDecimal thismonthsellquantity) {
        this.thismonthsellquantity = thismonthsellquantity;
    }

    public BigDecimal getThismonthsellquantity() {
        return thismonthsellquantity;
    }

    public void setPremonthsellquantity(BigDecimal premonthsellquantity) {
        this.premonthsellquantity = premonthsellquantity;
    }

    public BigDecimal getPremonthsellquantity() {
        return premonthsellquantity;
    }

    public void setForbiddenreason(String forbiddenreason) {
        this.forbiddenreason = forbiddenreason;
    }

    public String getForbiddenreason() {
        return forbiddenreason;
    }

    public void setStoppurchasereason(String stoppurchasereason) {
        this.stoppurchasereason = stoppurchasereason;
    }

    public String getStoppurchasereason() {
        return stoppurchasereason;
    }

    public void setStopsalereason(String stopsalereason) {
        this.stopsalereason = stopsalereason;
    }

    public String getStopsalereason() {
        return stopsalereason;
    }

    public void setIsMustPurchase(Integer isMustPurchase) {
        this.isMustPurchase = isMustPurchase;
    }

    public Integer getIsMustPurchase() {
        return isMustPurchase;
    }

    public void setSplitRetailPrice(BigDecimal splitRetailPrice) {
        this.splitRetailPrice = splitRetailPrice;
    }

    public BigDecimal getSplitRetailPrice() {
        return splitRetailPrice;
    }

    public void setSplitMemberPrice(BigDecimal splitMemberPrice) {
        this.splitMemberPrice = splitMemberPrice;
    }

    public BigDecimal getSplitMemberPrice() {
        return splitMemberPrice;
    }

    public void setSalespromotiontypeid(String salespromotiontypeid) {
        this.salespromotiontypeid = salespromotiontypeid;
    }

    public String getSalespromotiontypeid() {
        return salespromotiontypeid;
    }

    public void setSaleAnalyzeResult(String saleAnalyzeResult) {
        this.saleAnalyzeResult = saleAnalyzeResult;
    }

    public String getSaleAnalyzeResult() {
        return saleAnalyzeResult;
    }

    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
    }

    public Boolean isIsChanged() {
        return isChanged;
    }

    @Override
    public String toString() {
        return "Organizationmaterielinfo{" +
                "guid=" + guid + '\'' +
                "materielguid=" + materielguid + '\'' +
                "materielcode=" + materielcode + '\'' +
                "retailprice=" + retailprice + '\'' +
                "tradeprice=" + tradeprice + '\'' +
                "factprice=" + factprice + '\'' +
                "memberprice=" + memberprice + '\'' +
                "taxrate=" + taxrate + '\'' +
                "costprice=" + costprice + '\'' +
                "lastprice=" + lastprice + '\'' +
                "lastpurchaseindate=" + lastpurchaseindate + '\'' +
                "lastselldate=" + lastselldate + '\'' +
                "basesellprice=" + basesellprice + '\'' +
                "takemoneyinfo=" + takemoneyinfo + '\'' +
                "unlinearitymaterielTag=" + unlinearitymaterielTag + '\'' +
                "retailnotabateTag=" + retailnotabateTag + '\'' +
                "favourabletype=" + favourabletype + '\'' +
                "retailpricemanagetype=" + retailpricemanagetype + '\'' +
                "sendgoodsnotsplitTag=" + sendgoodsnotsplitTag + '\'' +
                "notjoinaddconsumeTag=" + notjoinaddconsumeTag + '\'' +
                "notjoinmemberintegralTag=" + notjoinmemberintegralTag + '\'' +
                "membermaterielrebatetype=" + membermaterielrebatetype + '\'' +
                "memberintegraltype=" + memberintegraltype + '\'' +
                "notes=" + notes + '\'' +
                "createdate=" + createdate + '\'' +
                "updatedate=" + updatedate + '\'' +
                "isstopsell=" + isstopsell + '\'' +
                "stopselldate=" + stopselldate + '\'' +
                "stopsellguid=" + stopsellguid + '\'' +
                "isstopstock=" + isstopstock + '\'' +
                "stopstockdate=" + stopstockdate + '\'' +
                "stopstockguid=" + stopstockguid + '\'' +
                "fdelete=" + fdelete + '\'' +
                "fdeletedate=" + fdeletedate + '\'' +
                "fdeleteguid=" + fdeleteguid + '\'' +
                "operatorguid=" + operatorguid + '\'' +
                "branchguid=" + branchguid + '\'' +
                "limitdays=" + limitdays + '\'' +
                "minimumdays=" + minimumdays + '\'' +
                "halfquartersales=" + halfquartersales + '\'' +
                "averagemonthlysales=" + averagemonthlysales + '\'' +
                "averagedaysales=" + averagedaysales + '\'' +
                "averagemothlystock=" + averagemothlystock + '\'' +
                "averageweeklystock=" + averageweeklystock + '\'' +
                "firststoragedate=" + firststoragedate + '\'' +
                "minquantity=" + minquantity + '\'' +
                "maxquantity=" + maxquantity + '\'' +
                "currnetstock=" + currnetstock + '\'' +
                "planquantity=" + planquantity + '\'' +
                "calcutequantity=" + calcutequantity + '\'' +
                "laststock=" + laststock + '\'' +
                "applyabclb=" + applyabclb + '\'' +
                "avemonthamount=" + avemonthamount + '\'' +
                "amontpercentage=" + amontpercentage + '\'' +
                "amontpercentagecumul=" + amontpercentagecumul + '\'' +
                "historycode=" + historycode + '\'' +
                "averageallsales=" + averageallsales + '\'' +
                "averageallstock=" + averageallstock + '\'' +
                "isnewpricetag=" + isnewpricetag + '\'' +
                "kh=" + kh + '\'' +
                "gjxj=" + gjxj + '\'' +
                "takemoneytype=" + takemoneytype + '\'' +
                "sellcostrebate=" + sellcostrebate + '\'' +
                "suppercode=" + suppercode + '\'' +
                "employeecode=" + employeecode + '\'' +
                "isnotuseing=" + isnotuseing + '\'' +
                "maxdisplay=" + maxdisplay + '\'' +
                "subdirct=" + subdirct + '\'' +
                "thismonthsellquantity=" + thismonthsellquantity + '\'' +
                "premonthsellquantity=" + premonthsellquantity + '\'' +
                "forbiddenreason=" + forbiddenreason + '\'' +
                "stoppurchasereason=" + stoppurchasereason + '\'' +
                "stopsalereason=" + stopsalereason + '\'' +
                "isMustPurchase=" + isMustPurchase + '\'' +
                "splitRetailPrice=" + splitRetailPrice + '\'' +
                "splitMemberPrice=" + splitMemberPrice + '\'' +
                "salespromotiontypeid=" + salespromotiontypeid + '\'' +
                "saleAnalyzeResult=" + saleAnalyzeResult + '\'' +
                "isChanged=" + isChanged + '\'' +
                '}';
    }
}
