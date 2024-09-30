public class UserAccount {
    // Fields
    private String fName;
    private String lName;
    private String username;
    private String password;
    private boolean businessActive;
    private boolean communityActive;
    private boolean clientActive;
    
    // Account types
    private AccountType businessAcc;  
    private AccountType communityAcc; 
    private AccountType clientAcc;   

    // Constructor 
    public UserAccount(String fName, String lName, String username, String password) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.businessActive = false;
        this.communityActive = false;
        this.clientActive = false;
    }

    // Getters and Setters for all fields 
    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBusinessActive() {
        return businessActive;
    }

    public void setBusinessActive(boolean businessActive) {
        this.businessActive = businessActive;
    }

    public boolean isCommunityActive() {
        return communityActive;
    }

    public void setCommunityActive(boolean communityActive) {
        this.communityActive = communityActive;
    }

    public boolean isClientActive() {
        return clientActive;
    }

    public void setClientActive(boolean clientActive) {
        this.clientActive = clientActive;
    }

    public AccountType getBusinessAcc() {
        return businessAcc;
    }

    public void setBusinessAcc(AccountType businessAcc) {
        this.businessAcc = businessAcc;
    }

    public AccountType getCommunityAcc() {
        return communityAcc;
    }

    public void setCommunityAcc(AccountType communityAcc) {
        this.communityAcc = communityAcc;
    }

    public AccountType getClientAcc() {
        return clientAcc;
    }

    public void setClientAcc(AccountType clientAcc) {
        this.clientAcc = clientAcc;
    }

}

// REMOVE LATER
// Assuming AccountType is an enum or class defined elsewhere.
class AccountType {
    // Add your logic here
}
