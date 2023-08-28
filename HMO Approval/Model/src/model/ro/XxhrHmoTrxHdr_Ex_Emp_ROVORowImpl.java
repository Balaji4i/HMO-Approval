package model.ro;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 01 12:49:10 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxhrHmoTrxHdr_Ex_Emp_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HmoTrxHdrId,
        BusinessUnitId,
        HmoRequestNo,
        HmoRequestDate,
        HmoMasterHdrId,
        HmoType,
        PersonId,
        MobileNo,
        MaritalStatus,
        ResiAddress,
        HmoCategory,
        HmoOption,
        HmoPlanTotal,
        HmoPlanDeduction,
        HmoAcceptanceFlag,
        ContactPartyNumber,
        PersonFirstName,
        PersonLastName,
        ContactPartyName,
        DateOfBirth,
        EmailAddress,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        ApprovalStatus,
        HmoPlan,
        PartyId;
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


    public static final int HMOTRXHDRID = AttributesEnum.HmoTrxHdrId.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int HMOREQUESTNO = AttributesEnum.HmoRequestNo.index();
    public static final int HMOREQUESTDATE = AttributesEnum.HmoRequestDate.index();
    public static final int HMOMASTERHDRID = AttributesEnum.HmoMasterHdrId.index();
    public static final int HMOTYPE = AttributesEnum.HmoType.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int MARITALSTATUS = AttributesEnum.MaritalStatus.index();
    public static final int RESIADDRESS = AttributesEnum.ResiAddress.index();
    public static final int HMOCATEGORY = AttributesEnum.HmoCategory.index();
    public static final int HMOOPTION = AttributesEnum.HmoOption.index();
    public static final int HMOPLANTOTAL = AttributesEnum.HmoPlanTotal.index();
    public static final int HMOPLANDEDUCTION = AttributesEnum.HmoPlanDeduction.index();
    public static final int HMOACCEPTANCEFLAG = AttributesEnum.HmoAcceptanceFlag.index();
    public static final int CONTACTPARTYNUMBER = AttributesEnum.ContactPartyNumber.index();
    public static final int PERSONFIRSTNAME = AttributesEnum.PersonFirstName.index();
    public static final int PERSONLASTNAME = AttributesEnum.PersonLastName.index();
    public static final int CONTACTPARTYNAME = AttributesEnum.ContactPartyName.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int EMAILADDRESS = AttributesEnum.EmailAddress.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int HMOPLAN = AttributesEnum.HmoPlan.index();
    public static final int PARTYID = AttributesEnum.PartyId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxhrHmoTrxHdr_Ex_Emp_ROVORowImpl() {
    }
}

