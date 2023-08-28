package model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 28 13:25:33 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxhrHmoComplaint_EOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ComplaintId,
        HmoTransYear,
        HmoTransReference,
        PersonId,
        PersonNumber,
        Title,
        FirstName,
        LastName,
        HmoOption,
        StateOfResidence,
        Hospital,
        DateIssueOccurred,
        Complaint,
        RequestType,
        ActiveFlag,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        PayrollBatchName,
        SoaFlowid,
        ErrorMsg,
        ApproverComments,
        ApprovalStatus,
        ComplaintNo,
        DeleteFlag;
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
    public static final int COMPLAINTID = AttributesEnum.ComplaintId.index();
    public static final int HMOTRANSYEAR = AttributesEnum.HmoTransYear.index();
    public static final int HMOTRANSREFERENCE = AttributesEnum.HmoTransReference.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int PERSONNUMBER = AttributesEnum.PersonNumber.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int HMOOPTION = AttributesEnum.HmoOption.index();
    public static final int STATEOFRESIDENCE = AttributesEnum.StateOfResidence.index();
    public static final int HOSPITAL = AttributesEnum.Hospital.index();
    public static final int DATEISSUEOCCURRED = AttributesEnum.DateIssueOccurred.index();
    public static final int COMPLAINT = AttributesEnum.Complaint.index();
    public static final int REQUESTTYPE = AttributesEnum.RequestType.index();
    public static final int ACTIVEFLAG = AttributesEnum.ActiveFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int PAYROLLBATCHNAME = AttributesEnum.PayrollBatchName.index();
    public static final int SOAFLOWID = AttributesEnum.SoaFlowid.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int APPROVERCOMMENTS = AttributesEnum.ApproverComments.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int COMPLAINTNO = AttributesEnum.ComplaintNo.index();
    public static final int DELETEFLAG = AttributesEnum.DeleteFlag.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxhrHmoComplaint_EOImpl() {
    }

    /**
     * Gets the attribute value for ComplaintId, using the alias name ComplaintId.
     * @return the value of ComplaintId
     */
    public BigDecimal getComplaintId() {
        return (BigDecimal) getAttributeInternal(COMPLAINTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ComplaintId.
     * @param value value to set the ComplaintId
     */
    public void setComplaintId(BigDecimal value) {
        setAttributeInternal(COMPLAINTID, value);
    }

    /**
     * Gets the attribute value for HmoTransYear, using the alias name HmoTransYear.
     * @return the value of HmoTransYear
     */
    public BigDecimal getHmoTransYear() {
        return (BigDecimal) getAttributeInternal(HMOTRANSYEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for HmoTransYear.
     * @param value value to set the HmoTransYear
     */
    public void setHmoTransYear(BigDecimal value) {
        setAttributeInternal(HMOTRANSYEAR, value);
    }

    /**
     * Gets the attribute value for HmoTransReference, using the alias name HmoTransReference.
     * @return the value of HmoTransReference
     */
    public BigDecimal getHmoTransReference() {
        return (BigDecimal) getAttributeInternal(HMOTRANSREFERENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HmoTransReference.
     * @param value value to set the HmoTransReference
     */
    public void setHmoTransReference(BigDecimal value) {
        setAttributeInternal(HMOTRANSREFERENCE, value);
    }

    /**
     * Gets the attribute value for PersonId, using the alias name PersonId.
     * @return the value of PersonId
     */
    public BigDecimal getPersonId() {
        return (BigDecimal) getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonId.
     * @param value value to set the PersonId
     */
    public void setPersonId(BigDecimal value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for PersonNumber, using the alias name PersonNumber.
     * @return the value of PersonNumber
     */
    public BigDecimal getPersonNumber() {
        return (BigDecimal) getAttributeInternal(PERSONNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonNumber.
     * @param value value to set the PersonNumber
     */
    public void setPersonNumber(BigDecimal value) {
        setAttributeInternal(PERSONNUMBER, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the value of Title
     */
    public String getTitle() {
        return (String) getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for HmoOption, using the alias name HmoOption.
     * @return the value of HmoOption
     */
    public String getHmoOption() {
        return (String) getAttributeInternal(HMOOPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for HmoOption.
     * @param value value to set the HmoOption
     */
    public void setHmoOption(String value) {
        setAttributeInternal(HMOOPTION, value);
    }

    /**
     * Gets the attribute value for StateOfResidence, using the alias name StateOfResidence.
     * @return the value of StateOfResidence
     */
    public String getStateOfResidence() {
        return (String) getAttributeInternal(STATEOFRESIDENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StateOfResidence.
     * @param value value to set the StateOfResidence
     */
    public void setStateOfResidence(String value) {
        setAttributeInternal(STATEOFRESIDENCE, value);
    }

    /**
     * Gets the attribute value for Hospital, using the alias name Hospital.
     * @return the value of Hospital
     */
    public String getHospital() {
        return (String) getAttributeInternal(HOSPITAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Hospital.
     * @param value value to set the Hospital
     */
    public void setHospital(String value) {
        setAttributeInternal(HOSPITAL, value);
    }

    /**
     * Gets the attribute value for DateIssueOccurred, using the alias name DateIssueOccurred.
     * @return the value of DateIssueOccurred
     */
    public Timestamp getDateIssueOccurred() {
        return (Timestamp) getAttributeInternal(DATEISSUEOCCURRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateIssueOccurred.
     * @param value value to set the DateIssueOccurred
     */
    public void setDateIssueOccurred(Timestamp value) {
        setAttributeInternal(DATEISSUEOCCURRED, value);
    }

    /**
     * Gets the attribute value for Complaint, using the alias name Complaint.
     * @return the value of Complaint
     */
    public String getComplaint() {
        return (String) getAttributeInternal(COMPLAINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Complaint.
     * @param value value to set the Complaint
     */
    public void setComplaint(String value) {
        setAttributeInternal(COMPLAINT, value);
    }

    /**
     * Gets the attribute value for RequestType, using the alias name RequestType.
     * @return the value of RequestType
     */
    public String getRequestType() {
        return (String) getAttributeInternal(REQUESTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequestType.
     * @param value value to set the RequestType
     */
    public void setRequestType(String value) {
        setAttributeInternal(REQUESTTYPE, value);
    }

    /**
     * Gets the attribute value for ActiveFlag, using the alias name ActiveFlag.
     * @return the value of ActiveFlag
     */
    public String getActiveFlag() {
        return (String) getAttributeInternal(ACTIVEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActiveFlag.
     * @param value value to set the ActiveFlag
     */
    public void setActiveFlag(String value) {
        setAttributeInternal(ACTIVEFLAG, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the value of LastUpdateLogin
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateLogin.
     * @param value value to set the LastUpdateLogin
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for PayrollBatchName, using the alias name PayrollBatchName.
     * @return the value of PayrollBatchName
     */
    public String getPayrollBatchName() {
        return (String) getAttributeInternal(PAYROLLBATCHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PayrollBatchName.
     * @param value value to set the PayrollBatchName
     */
    public void setPayrollBatchName(String value) {
        setAttributeInternal(PAYROLLBATCHNAME, value);
    }

    /**
     * Gets the attribute value for SoaFlowid, using the alias name SoaFlowid.
     * @return the value of SoaFlowid
     */
    public BigDecimal getSoaFlowid() {
        return (BigDecimal) getAttributeInternal(SOAFLOWID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SoaFlowid.
     * @param value value to set the SoaFlowid
     */
    public void setSoaFlowid(BigDecimal value) {
        setAttributeInternal(SOAFLOWID, value);
    }

    /**
     * Gets the attribute value for ErrorMsg, using the alias name ErrorMsg.
     * @return the value of ErrorMsg
     */
    public ClobDomain getErrorMsg() {
        return (ClobDomain) getAttributeInternal(ERRORMSG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ErrorMsg.
     * @param value value to set the ErrorMsg
     */
    public void setErrorMsg(ClobDomain value) {
        setAttributeInternal(ERRORMSG, value);
    }

    /**
     * Gets the attribute value for ApproverComments, using the alias name ApproverComments.
     * @return the value of ApproverComments
     */
    public String getApproverComments() {
        return (String) getAttributeInternal(APPROVERCOMMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApproverComments.
     * @param value value to set the ApproverComments
     */
    public void setApproverComments(String value) {
        setAttributeInternal(APPROVERCOMMENTS, value);
    }

    /**
     * Gets the attribute value for ApprovalStatus, using the alias name ApprovalStatus.
     * @return the value of ApprovalStatus
     */
    public String getApprovalStatus() {
        return (String) getAttributeInternal(APPROVALSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovalStatus.
     * @param value value to set the ApprovalStatus
     */
    public void setApprovalStatus(String value) {
        setAttributeInternal(APPROVALSTATUS, value);
    }

    /**
     * Gets the attribute value for ComplaintNo, using the alias name ComplaintNo.
     * @return the value of ComplaintNo
     */
    public String getComplaintNo() {
        return (String) getAttributeInternal(COMPLAINTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ComplaintNo.
     * @param value value to set the ComplaintNo
     */
    public void setComplaintNo(String value) {
        setAttributeInternal(COMPLAINTNO, value);
    }

    /**
     * Gets the attribute value for DeleteFlag, using the alias name DeleteFlag.
     * @return the value of DeleteFlag
     */
    public String getDeleteFlag() {
        return (String) getAttributeInternal(DELETEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeleteFlag.
     * @param value value to set the DeleteFlag
     */
    public void setDeleteFlag(String value) {
        setAttributeInternal(DELETEFLAG, value);
    }

    /**
     * @param complaintId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal complaintId) {
        return new Key(new Object[] { complaintId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.eo.XxhrHmoComplaint_EO");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == EntityImpl.DML_UPDATE) {
           this.setLastUpdatedBy(ADFContext.getCurrent().getSessionScope().get("userName").toString());
           this.setLastUpdateLogin(ADFContext.getCurrent().getSessionScope().get("userName").toString());
           this.setLastUpdateDate(new Timestamp(System.currentTimeMillis()));
        }
        super.doDML(operation, e);
    }
}

