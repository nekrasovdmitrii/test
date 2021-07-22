package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class Account {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("AccountId")
    private String accountId;
    @JsonProperty("ContactId")
    private String contactId;
    @JsonProperty("LeadId")
    private String leadId;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Mobile")
    private String mobile;
    @JsonProperty("OtherPhone")
    private String otherPhone;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Birthdate")
    private String Birthdate;
    @JsonProperty("VKAccount")
    private String vkAccount;
    @JsonProperty("FBAccount")
    private String fbAccount;
    @JsonProperty("TelegramAccount")
    private String telegramAccount;
    @JsonProperty("LinkedInAccount")
    private String linkedInAccount;
    @JsonProperty("ClothingSize")
    private String clothingSize;
    @JsonProperty("CreatedTimeStamp")
    private LocalDateTime createdTimeStamp;
    @JsonProperty("LastModificationTimeStamp")
    private LocalDateTime lastModificationTimeStamp;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getContactId() {
        return contactId;
    }
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    public String getLeadId() {
        return leadId;
    }
    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getOtherPhone() {
        return otherPhone;
    }
    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getBirthdate() {
        return Birthdate;
    }
    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }
    public String getVkAccount() {
        return vkAccount;
    }
    public void setVkAccount(String vkAccount) {
        this.vkAccount = vkAccount;
    }
    public String getFbAccount() {
        return fbAccount;
    }
    public void setFbAccount(String fbAccount) {
        this.fbAccount = fbAccount;
    }
    public String getTelegramAccount() {
        return telegramAccount;
    }
    public void setTelegramAccount(String telegramAccount) {
        this.telegramAccount = telegramAccount;
    }
    public String getLinkedInAccount() {
        return linkedInAccount;
    }
    public void setLinkedInAccount(String linkedInAccount) {
        this.linkedInAccount = linkedInAccount;
    }
    public String getClothingSize() {
        return clothingSize;
    }
    public void setClothingSize(String clothingSize) {
        this.clothingSize = clothingSize;
    }
    public LocalDateTime getCreatedTimeStamp() {
        return createdTimeStamp;
    }
    public void setCreatedTimeStamp(LocalDateTime createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }
    public LocalDateTime getLastModificationTimeStamp() {
        return lastModificationTimeStamp;
    }
    public void setLastModificationTimeStamp(LocalDateTime lastModificationTimeStamp) {
        this.lastModificationTimeStamp = lastModificationTimeStamp;
    }
}