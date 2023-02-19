package com.zy.oms.pojo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @Column(name = "Guid", nullable = false)
    private String guid = "newid()";

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "IsForbidden")
    private Boolean isForbidden = Boolean.FALSE;

    @Column(name = "FLevel")
    private Integer FLevel = 1;

    @Column(name = "IsDetail")
    private Boolean isDetail = Boolean.TRUE;

    @Column(name = "AccountTypeGuid")
    private String accountTypeGuid;

    @Column(name = "Direction")
    private Integer direction = 0;

    @Column(name = "AccountNatureGuid")
    private String accountNatureGuid;

    @Column(name = "IsSupplier")
    private Boolean isSupplier = Boolean.FALSE;

    @Column(name = "IsCustomer")
    private Boolean isCustomer = Boolean.FALSE;

    @Column(name = "IsDepartment")
    private Boolean isDepartment = Boolean.FALSE;

    @Column(name = "IsEmployee")
    private Boolean isEmployee = Boolean.FALSE;

    @Column(name = "IsMateriel")
    private Boolean isMateriel = Boolean.FALSE;

    @Column(name = "IsClass1")
    private Boolean isClass1 = Boolean.FALSE;

    @Column(name = "IsClass2")
    private Boolean isClass2 = Boolean.FALSE;

    @Column(name = "IsQuantity")
    private Boolean isQuantity = Boolean.FALSE;

    @Column(name = "QuantityUnit")
    private String quantityUnit;

    @Column(name = "IsMultCurrency")
    private Boolean isMultCurrency = Boolean.FALSE;

    @Column(name = "IsAllCurrency")
    private Boolean isAllCurrency = Boolean.FALSE;

    @Column(name = "IsCalcInterest")
    private Boolean isCalcInterest = Boolean.FALSE;

    @Column(name = "DebitAccountGuid")
    private String debitAccountGuid;

    @Column(name = "CreditAccountGuid")
    private String creditAccountGuid;

    @Column(name = "IsCalcExchange")
    private Boolean isCalcExchange = Boolean.FALSE;

    @Column(name = "IsProfitLoss")
    private Boolean isProfitLoss = Boolean.FALSE;

    @Column(name = "ProfitLossAccountGuid")
    private String profitLossAccountGuid;

    @Column(name = "LossDirection")
    private Integer lossDirection = 0;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "IsPreDefine")
    private Boolean isPreDefine = Boolean.FALSE;

    @Column(name = "IsCash")
    private Boolean isCash = Boolean.FALSE;

    @Column(name = "DevReserveAccountGuid")
    private String devReserveAccountGuid;

    @Column(name = "BadDebtsAccountGuid")
    private String badDebtsAccountGuid;

    @Column(name = "BadDebtsAccount2Guid")
    private String badDebtsAccount2Guid;

    @Column(name = "BadDebtsAccount3Guid")
    private String badDebtsAccount3Guid;

    @Column(name = "BadDebtsRate")
    private BigDecimal badDebtsRate = BigDecimal.ZERO;

    @Column(name = "HelpCode")
    private String helpCode;

    @Column(name = "ParentGuid")
    private String parentGuid;

    @Column(name = "IsClass3")
    private Boolean isClass3;

    @Column(name = "IsClass4")
    private Boolean isClass4;

    @Column(name = "IsClass5")
    private Boolean isClass5;

    @Column(name = "iscashaccount")
    private Boolean iscashaccount;

    @Column(name = "isbankaccount")
    private Boolean isbankaccount;

    @Column(name = "CLASS1ITEM")
    private String CLASS1ITEM;

    @Column(name = "ISCLASS6")
    private Boolean ISCLASS6 = Boolean.FALSE;

    @Column(name = "ISCLASS7")
    private Boolean ISCLASS7 = Boolean.FALSE;

    @Column(name = "ISCLASS8")
    private Boolean ISCLASS8 = Boolean.FALSE;

    @Column(name = "ISCLASS9")
    private Boolean ISCLASS9 = Boolean.FALSE;

    @Column(name = "ISCLASS10")
    private Boolean ISCLASS10 = Boolean.FALSE;

    @Column(name = "CLASSNAME1")
    private String CLASSNAME1;

    @Column(name = "CLASSNAME2")
    private String CLASSNAME2;

    @Column(name = "CLASSNAME3")
    private String CLASSNAME3;

    @Column(name = "CLASSNAME4")
    private String CLASSNAME4;

    @Column(name = "CLASSNAME5")
    private String CLASSNAME5;

    @Column(name = "CLASSNAME6")
    private String CLASSNAME6;

    @Column(name = "CLASSNAME7")
    private String CLASSNAME7;

    @Column(name = "CLASSNAME8")
    private String CLASSNAME8;

    @Column(name = "CLASSNAME9")
    private String CLASSNAME9;

    @Column(name = "CLASSNAME10")
    private String CLASSNAME10;

    @Column(name = "CLASSCODE1")
    private String CLASSCODE1;

    @Column(name = "CLASSCODE2")
    private String CLASSCODE2;

    @Column(name = "CLASSCODE3")
    private String CLASSCODE3;

    @Column(name = "CLASSCODE4")
    private String CLASSCODE4;

    @Column(name = "CLASSCODE5")
    private String CLASSCODE5;

    @Column(name = "CLASSCODE6")
    private String CLASSCODE6;

    @Column(name = "CLASSCODE7")
    private String CLASSCODE7;

    @Column(name = "CLASSCODE8")
    private String CLASSCODE8;

    @Column(name = "CLASSCODE9")
    private String CLASSCODE9;

    @Column(name = "CLASSCODE10")
    private String CLASSCODE10;

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public Boolean isIsForbidden() {
        return isForbidden;
    }

    public void setFLevel(Integer FLevel) {
        this.FLevel = FLevel;
    }

    public Integer getFLevel() {
        return FLevel;
    }

    public void setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
    }

    public Boolean isIsDetail() {
        return isDetail;
    }

    public void setAccountTypeGuid(String accountTypeGuid) {
        this.accountTypeGuid = accountTypeGuid;
    }

    public String getAccountTypeGuid() {
        return accountTypeGuid;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setAccountNatureGuid(String accountNatureGuid) {
        this.accountNatureGuid = accountNatureGuid;
    }

    public String getAccountNatureGuid() {
        return accountNatureGuid;
    }

    public void setIsSupplier(Boolean isSupplier) {
        this.isSupplier = isSupplier;
    }

    public Boolean isIsSupplier() {
        return isSupplier;
    }

    public void setIsCustomer(Boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

    public Boolean isIsCustomer() {
        return isCustomer;
    }

    public void setIsDepartment(Boolean isDepartment) {
        this.isDepartment = isDepartment;
    }

    public Boolean isIsDepartment() {
        return isDepartment;
    }

    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public Boolean isIsEmployee() {
        return isEmployee;
    }

    public void setIsMateriel(Boolean isMateriel) {
        this.isMateriel = isMateriel;
    }

    public Boolean isIsMateriel() {
        return isMateriel;
    }

    public void setIsClass1(Boolean isClass1) {
        this.isClass1 = isClass1;
    }

    public Boolean isIsClass1() {
        return isClass1;
    }

    public void setIsClass2(Boolean isClass2) {
        this.isClass2 = isClass2;
    }

    public Boolean isIsClass2() {
        return isClass2;
    }

    public void setIsQuantity(Boolean isQuantity) {
        this.isQuantity = isQuantity;
    }

    public Boolean isIsQuantity() {
        return isQuantity;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setIsMultCurrency(Boolean isMultCurrency) {
        this.isMultCurrency = isMultCurrency;
    }

    public Boolean isIsMultCurrency() {
        return isMultCurrency;
    }

    public void setIsAllCurrency(Boolean isAllCurrency) {
        this.isAllCurrency = isAllCurrency;
    }

    public Boolean isIsAllCurrency() {
        return isAllCurrency;
    }

    public void setIsCalcInterest(Boolean isCalcInterest) {
        this.isCalcInterest = isCalcInterest;
    }

    public Boolean isIsCalcInterest() {
        return isCalcInterest;
    }

    public void setDebitAccountGuid(String debitAccountGuid) {
        this.debitAccountGuid = debitAccountGuid;
    }

    public String getDebitAccountGuid() {
        return debitAccountGuid;
    }

    public void setCreditAccountGuid(String creditAccountGuid) {
        this.creditAccountGuid = creditAccountGuid;
    }

    public String getCreditAccountGuid() {
        return creditAccountGuid;
    }

    public void setIsCalcExchange(Boolean isCalcExchange) {
        this.isCalcExchange = isCalcExchange;
    }

    public Boolean isIsCalcExchange() {
        return isCalcExchange;
    }

    public void setIsProfitLoss(Boolean isProfitLoss) {
        this.isProfitLoss = isProfitLoss;
    }

    public Boolean isIsProfitLoss() {
        return isProfitLoss;
    }

    public void setProfitLossAccountGuid(String profitLossAccountGuid) {
        this.profitLossAccountGuid = profitLossAccountGuid;
    }

    public String getProfitLossAccountGuid() {
        return profitLossAccountGuid;
    }

    public void setLossDirection(Integer lossDirection) {
        this.lossDirection = lossDirection;
    }

    public Integer getLossDirection() {
        return lossDirection;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setIsPreDefine(Boolean isPreDefine) {
        this.isPreDefine = isPreDefine;
    }

    public Boolean isIsPreDefine() {
        return isPreDefine;
    }

    public void setIsCash(Boolean isCash) {
        this.isCash = isCash;
    }

    public Boolean isIsCash() {
        return isCash;
    }

    public void setDevReserveAccountGuid(String devReserveAccountGuid) {
        this.devReserveAccountGuid = devReserveAccountGuid;
    }

    public String getDevReserveAccountGuid() {
        return devReserveAccountGuid;
    }

    public void setBadDebtsAccountGuid(String badDebtsAccountGuid) {
        this.badDebtsAccountGuid = badDebtsAccountGuid;
    }

    public String getBadDebtsAccountGuid() {
        return badDebtsAccountGuid;
    }

    public void setBadDebtsAccount2Guid(String badDebtsAccount2Guid) {
        this.badDebtsAccount2Guid = badDebtsAccount2Guid;
    }

    public String getBadDebtsAccount2Guid() {
        return badDebtsAccount2Guid;
    }

    public void setBadDebtsAccount3Guid(String badDebtsAccount3Guid) {
        this.badDebtsAccount3Guid = badDebtsAccount3Guid;
    }

    public String getBadDebtsAccount3Guid() {
        return badDebtsAccount3Guid;
    }

    public void setBadDebtsRate(BigDecimal badDebtsRate) {
        this.badDebtsRate = badDebtsRate;
    }

    public BigDecimal getBadDebtsRate() {
        return badDebtsRate;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode;
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public void setIsClass3(Boolean isClass3) {
        this.isClass3 = isClass3;
    }

    public Boolean isIsClass3() {
        return isClass3;
    }

    public void setIsClass4(Boolean isClass4) {
        this.isClass4 = isClass4;
    }

    public Boolean isIsClass4() {
        return isClass4;
    }

    public void setIsClass5(Boolean isClass5) {
        this.isClass5 = isClass5;
    }

    public Boolean isIsClass5() {
        return isClass5;
    }

    public void setIscashaccount(Boolean iscashaccount) {
        this.iscashaccount = iscashaccount;
    }

    public Boolean isIscashaccount() {
        return iscashaccount;
    }

    public void setIsbankaccount(Boolean isbankaccount) {
        this.isbankaccount = isbankaccount;
    }

    public Boolean isIsbankaccount() {
        return isbankaccount;
    }

    public void setCLASS1ITEM(String CLASS1ITEM) {
        this.CLASS1ITEM = CLASS1ITEM;
    }

    public String getCLASS1ITEM() {
        return CLASS1ITEM;
    }

    public void setISCLASS6(Boolean ISCLASS6) {
        this.ISCLASS6 = ISCLASS6;
    }

    public Boolean isISCLASS6() {
        return ISCLASS6;
    }

    public void setISCLASS7(Boolean ISCLASS7) {
        this.ISCLASS7 = ISCLASS7;
    }

    public Boolean isISCLASS7() {
        return ISCLASS7;
    }

    public void setISCLASS8(Boolean ISCLASS8) {
        this.ISCLASS8 = ISCLASS8;
    }

    public Boolean isISCLASS8() {
        return ISCLASS8;
    }

    public void setISCLASS9(Boolean ISCLASS9) {
        this.ISCLASS9 = ISCLASS9;
    }

    public Boolean isISCLASS9() {
        return ISCLASS9;
    }

    public void setISCLASS10(Boolean ISCLASS10) {
        this.ISCLASS10 = ISCLASS10;
    }

    public Boolean isISCLASS10() {
        return ISCLASS10;
    }

    public void setCLASSNAME1(String CLASSNAME1) {
        this.CLASSNAME1 = CLASSNAME1;
    }

    public String getCLASSNAME1() {
        return CLASSNAME1;
    }

    public void setCLASSNAME2(String CLASSNAME2) {
        this.CLASSNAME2 = CLASSNAME2;
    }

    public String getCLASSNAME2() {
        return CLASSNAME2;
    }

    public void setCLASSNAME3(String CLASSNAME3) {
        this.CLASSNAME3 = CLASSNAME3;
    }

    public String getCLASSNAME3() {
        return CLASSNAME3;
    }

    public void setCLASSNAME4(String CLASSNAME4) {
        this.CLASSNAME4 = CLASSNAME4;
    }

    public String getCLASSNAME4() {
        return CLASSNAME4;
    }

    public void setCLASSNAME5(String CLASSNAME5) {
        this.CLASSNAME5 = CLASSNAME5;
    }

    public String getCLASSNAME5() {
        return CLASSNAME5;
    }

    public void setCLASSNAME6(String CLASSNAME6) {
        this.CLASSNAME6 = CLASSNAME6;
    }

    public String getCLASSNAME6() {
        return CLASSNAME6;
    }

    public void setCLASSNAME7(String CLASSNAME7) {
        this.CLASSNAME7 = CLASSNAME7;
    }

    public String getCLASSNAME7() {
        return CLASSNAME7;
    }

    public void setCLASSNAME8(String CLASSNAME8) {
        this.CLASSNAME8 = CLASSNAME8;
    }

    public String getCLASSNAME8() {
        return CLASSNAME8;
    }

    public void setCLASSNAME9(String CLASSNAME9) {
        this.CLASSNAME9 = CLASSNAME9;
    }

    public String getCLASSNAME9() {
        return CLASSNAME9;
    }

    public void setCLASSNAME10(String CLASSNAME10) {
        this.CLASSNAME10 = CLASSNAME10;
    }

    public String getCLASSNAME10() {
        return CLASSNAME10;
    }

    public void setCLASSCODE1(String CLASSCODE1) {
        this.CLASSCODE1 = CLASSCODE1;
    }

    public String getCLASSCODE1() {
        return CLASSCODE1;
    }

    public void setCLASSCODE2(String CLASSCODE2) {
        this.CLASSCODE2 = CLASSCODE2;
    }

    public String getCLASSCODE2() {
        return CLASSCODE2;
    }

    public void setCLASSCODE3(String CLASSCODE3) {
        this.CLASSCODE3 = CLASSCODE3;
    }

    public String getCLASSCODE3() {
        return CLASSCODE3;
    }

    public void setCLASSCODE4(String CLASSCODE4) {
        this.CLASSCODE4 = CLASSCODE4;
    }

    public String getCLASSCODE4() {
        return CLASSCODE4;
    }

    public void setCLASSCODE5(String CLASSCODE5) {
        this.CLASSCODE5 = CLASSCODE5;
    }

    public String getCLASSCODE5() {
        return CLASSCODE5;
    }

    public void setCLASSCODE6(String CLASSCODE6) {
        this.CLASSCODE6 = CLASSCODE6;
    }

    public String getCLASSCODE6() {
        return CLASSCODE6;
    }

    public void setCLASSCODE7(String CLASSCODE7) {
        this.CLASSCODE7 = CLASSCODE7;
    }

    public String getCLASSCODE7() {
        return CLASSCODE7;
    }

    public void setCLASSCODE8(String CLASSCODE8) {
        this.CLASSCODE8 = CLASSCODE8;
    }

    public String getCLASSCODE8() {
        return CLASSCODE8;
    }

    public void setCLASSCODE9(String CLASSCODE9) {
        this.CLASSCODE9 = CLASSCODE9;
    }

    public String getCLASSCODE9() {
        return CLASSCODE9;
    }

    public void setCLASSCODE10(String CLASSCODE10) {
        this.CLASSCODE10 = CLASSCODE10;
    }

    public String getCLASSCODE10() {
        return CLASSCODE10;
    }

    @Override
    public String toString() {
        return "Account{" +
                "guid=" + guid + '\'' +
                "code=" + code + '\'' +
                "name=" + name + '\'' +
                "fullName=" + fullName + '\'' +
                "isForbidden=" + isForbidden + '\'' +
                "FLevel=" + FLevel + '\'' +
                "isDetail=" + isDetail + '\'' +
                "accountTypeGuid=" + accountTypeGuid + '\'' +
                "direction=" + direction + '\'' +
                "accountNatureGuid=" + accountNatureGuid + '\'' +
                "isSupplier=" + isSupplier + '\'' +
                "isCustomer=" + isCustomer + '\'' +
                "isDepartment=" + isDepartment + '\'' +
                "isEmployee=" + isEmployee + '\'' +
                "isMateriel=" + isMateriel + '\'' +
                "isClass1=" + isClass1 + '\'' +
                "isClass2=" + isClass2 + '\'' +
                "isQuantity=" + isQuantity + '\'' +
                "quantityUnit=" + quantityUnit + '\'' +
                "isMultCurrency=" + isMultCurrency + '\'' +
                "isAllCurrency=" + isAllCurrency + '\'' +
                "isCalcInterest=" + isCalcInterest + '\'' +
                "debitAccountGuid=" + debitAccountGuid + '\'' +
                "creditAccountGuid=" + creditAccountGuid + '\'' +
                "isCalcExchange=" + isCalcExchange + '\'' +
                "isProfitLoss=" + isProfitLoss + '\'' +
                "profitLossAccountGuid=" + profitLossAccountGuid + '\'' +
                "lossDirection=" + lossDirection + '\'' +
                "startDate=" + startDate + '\'' +
                "isPreDefine=" + isPreDefine + '\'' +
                "isCash=" + isCash + '\'' +
                "devReserveAccountGuid=" + devReserveAccountGuid + '\'' +
                "badDebtsAccountGuid=" + badDebtsAccountGuid + '\'' +
                "badDebtsAccount2Guid=" + badDebtsAccount2Guid + '\'' +
                "badDebtsAccount3Guid=" + badDebtsAccount3Guid + '\'' +
                "badDebtsRate=" + badDebtsRate + '\'' +
                "helpCode=" + helpCode + '\'' +
                "parentGuid=" + parentGuid + '\'' +
                "isClass3=" + isClass3 + '\'' +
                "isClass4=" + isClass4 + '\'' +
                "isClass5=" + isClass5 + '\'' +
                "iscashaccount=" + iscashaccount + '\'' +
                "isbankaccount=" + isbankaccount + '\'' +
                "CLASS1ITEM=" + CLASS1ITEM + '\'' +
                "ISCLASS6=" + ISCLASS6 + '\'' +
                "ISCLASS7=" + ISCLASS7 + '\'' +
                "ISCLASS8=" + ISCLASS8 + '\'' +
                "ISCLASS9=" + ISCLASS9 + '\'' +
                "ISCLASS10=" + ISCLASS10 + '\'' +
                "CLASSNAME1=" + CLASSNAME1 + '\'' +
                "CLASSNAME2=" + CLASSNAME2 + '\'' +
                "CLASSNAME3=" + CLASSNAME3 + '\'' +
                "CLASSNAME4=" + CLASSNAME4 + '\'' +
                "CLASSNAME5=" + CLASSNAME5 + '\'' +
                "CLASSNAME6=" + CLASSNAME6 + '\'' +
                "CLASSNAME7=" + CLASSNAME7 + '\'' +
                "CLASSNAME8=" + CLASSNAME8 + '\'' +
                "CLASSNAME9=" + CLASSNAME9 + '\'' +
                "CLASSNAME10=" + CLASSNAME10 + '\'' +
                "CLASSCODE1=" + CLASSCODE1 + '\'' +
                "CLASSCODE2=" + CLASSCODE2 + '\'' +
                "CLASSCODE3=" + CLASSCODE3 + '\'' +
                "CLASSCODE4=" + CLASSCODE4 + '\'' +
                "CLASSCODE5=" + CLASSCODE5 + '\'' +
                "CLASSCODE6=" + CLASSCODE6 + '\'' +
                "CLASSCODE7=" + CLASSCODE7 + '\'' +
                "CLASSCODE8=" + CLASSCODE8 + '\'' +
                "CLASSCODE9=" + CLASSCODE9 + '\'' +
                "CLASSCODE10=" + CLASSCODE10 + '\'' +
                '}';
    }
}
