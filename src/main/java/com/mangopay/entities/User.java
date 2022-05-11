package com.mangopay.entities;

import com.google.gson.annotations.SerializedName;
import com.mangopay.core.EntityBase;
import com.mangopay.core.enumerations.KycLevel;
import com.mangopay.core.enumerations.PersonType;

import java.util.ArrayList;

/**
 * User entity abstract class.
 * Parent for <code>UserNatural</code> or <code>UserLegal</code> child types.
 */
public abstract class User extends EntityBase {

    /**
     * Type of user.
     */
    @SerializedName("PersonType")
    PersonType personType;

    /**
     * KYC level.
     */
    @SerializedName("KYCLevel")
    private KycLevel kycLevel;

    /**
     * Email address.
     */
    @SerializedName("Email")
    private String email;

    @SerializedName("TermsAndConditionsAccepted")
    private boolean termsAndConditionsAccepted;

    /**
     * TermsAndConditionsAcceptedDate (UNIX timestamp).
     */
    @SerializedName("TermsAndConditionsAcceptedDate")
    private long termsAndConditionsAcceptedDate;

    public User(PersonType personType) {
        this.personType = personType;
    }

    /**
     * Descendant classes overrides it.
     */
    protected User() {
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public KycLevel getKycLevel() {
        return kycLevel;
    }

    public void setKycLevel(KycLevel kycLevel) {
        this.kycLevel = kycLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }

    public void setTermsAndConditionsAccepted(boolean termsAndConditionsAccepted) {
        this.termsAndConditionsAccepted = termsAndConditionsAccepted;
    }

    public long getTermsAndConditionsAcceptedDate() {
        return termsAndConditionsAcceptedDate;
    }

    /**
     * Gets the collection of read-only fields names.
     *
     * @return List of field names.
     */
    @Override
    public ArrayList<String> getReadOnlyProperties() {

        ArrayList<String> result = super.getReadOnlyProperties();

        result.add("PersonType");
        result.add("KYCLevel");
        result.add("TermsAndConditionsAcceptedDate");

        return result;
    }
}
