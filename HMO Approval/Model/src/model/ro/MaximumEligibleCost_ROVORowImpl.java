package model.ro;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 29 19:43:17 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MaximumEligibleCost_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HmoCategoryId,
        HmoOptionsId,
        HmoOptions,
        HmoCategory,
        DependentOptions,
        MaxEligibiltyCost,
        Currency,
        ActiveFlag,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        Attribute1,
        PlanName,
        HmoMasterHdrId;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int HMOCATEGORYID = AttributesEnum.HmoCategoryId.index();
    public static final int HMOOPTIONSID = AttributesEnum.HmoOptionsId.index();
    public static final int HMOOPTIONS = AttributesEnum.HmoOptions.index();
    public static final int HMOCATEGORY = AttributesEnum.HmoCategory.index();
    public static final int DEPENDENTOPTIONS = AttributesEnum.DependentOptions.index();
    public static final int MAXELIGIBILTYCOST = AttributesEnum.MaxEligibiltyCost.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int PLANNAME = AttributesEnum.PlanName.index();
    public static final int HMOMASTERHDRID = AttributesEnum.HmoMasterHdrId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MaximumEligibleCost_ROVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute HmoCategoryId.
     * @return the HmoCategoryId
     */
    public BigDecimal getHmoCategoryId() {
        return (BigDecimal) getAttributeInternal(HMOCATEGORYID);
    }

    /**
     * Gets the attribute value for the calculated attribute HmoOptionsId.
     * @return the HmoOptionsId
     */
    public BigDecimal getHmoOptionsId() {
        return (BigDecimal) getAttributeInternal(HMOOPTIONSID);
    }

    /**
     * Gets the attribute value for the calculated attribute HmoOptions.
     * @return the HmoOptions
     */
    public String getHmoOptions() {
        return (String) getAttributeInternal(HMOOPTIONS);
    }

    /**
     * Gets the attribute value for the calculated attribute HmoCategory.
     * @return the HmoCategory
     */
    public String getHmoCategory() {
        return (String) getAttributeInternal(HMOCATEGORY);
    }

    /**
     * Gets the attribute value for the calculated attribute DependentOptions.
     * @return the DependentOptions
     */
    public String getDependentOptions() {
        return (String) getAttributeInternal(DEPENDENTOPTIONS);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxEligibiltyCost.
     * @return the MaxEligibiltyCost
     */
    public BigDecimal getMaxEligibiltyCost() {
        return (BigDecimal) getAttributeInternal(MAXELIGIBILTYCOST);
    }

    /**
     * Gets the attribute value for the calculated attribute Currency.
     * @return the Currency
     */
    public String getCurrency() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**
     * Gets the attribute value for the calculated attribute ActiveFlag.
     * @return the ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Gets the attribute value for the calculated attribute CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for the calculated attribute CreationDate.
     * @return the CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Gets the attribute value for the calculated attribute LastUpdateLogin.
     * @return the LastUpdateLogin
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Gets the attribute value for the calculated attribute Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Gets the attribute value for the calculated attribute PlanName.
     * @return the PlanName
     */
    public String getPlanName() {
        return (String) getAttributeInternal(PLANNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute HmoMasterHdrId.
     * @return the HmoMasterHdrId
     */
    public BigDecimal getHmoMasterHdrId() {
        return (BigDecimal) getAttributeInternal(HMOMASTERHDRID);
    }
}

