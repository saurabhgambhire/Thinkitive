package com.thinkitive.task1.entity;

public class EligibilityRequest {
    private String providerName;
    private String providerNpi;
    private String payerName;
    private String payerEdiCode;
    private String patientMemberId;
    private String patientFirstName;
    private String patientLastName;
    private String patientDob;
    private String patientRelationship;

    public EligibilityRequest() {
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderNpi() {
        return providerNpi;
    }

    public void setProviderNpi(String providerNpi) {
        this.providerNpi = providerNpi;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerEdiCode() {
        return payerEdiCode;
    }

    public void setPayerEdiCode(String payerEdiCode) {
        this.payerEdiCode = payerEdiCode;
    }

    public String getPatientMemberId() {
        return patientMemberId;
    }

    public void setPatientMemberId(String patientMemberId) {
        this.patientMemberId = patientMemberId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(String patientDob) {
        this.patientDob = patientDob;
    }

    public String getPatientRelationship() {
        return patientRelationship;
    }

    public void setPatientRelationship(String patientRelationship) {
        this.patientRelationship = patientRelationship;
    }

    @Override
    public String toString() {
        return "EligibilityRequest{" +
                "providerName='" + providerName + '\'' +
                ", providerNpi='" + providerNpi + '\'' +
                ", payerName='" + payerName + '\'' +
                ", payerEdiCode='" + payerEdiCode + '\'' +
                ", patientMemberId='" + patientMemberId + '\'' +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", patientDob='" + patientDob + '\'' +
                ", patientRelationship='" + patientRelationship + '\'' +
                '}';
    }

    public String getSenderId() {
        return "<?senderId>";
    }

    public String getReceiverId() {
        return "<?receiverId>";
    }

    public String getTransactionControlNumber() {
        return "<?transactionControlNumber>";
    }
}
