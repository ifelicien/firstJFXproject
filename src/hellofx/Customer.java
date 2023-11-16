package hellofx;
/**
 * The Customer class represents a customer with properties such as first name, last name, phone
 * number, email, insurance name, and policy number, along with getter and setter methods for each
 * property.
 */
public class Customer {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String cusAddress;
        private String email;
        private String insuranceName;
        private String policyNum;

        Customer(String firstName, String lastName, String phoneNumber, String cusAddress, String email, String insuranceName, String policyNum){
                this.setFirstName(firstName);
                this.setLastName(lastName);
                this.setPhoneNumber(phoneNumber);
                this.setPolicyNum(cusAddress);
                this.setEmail(email);
                this.setInsuranceName(insuranceName);
                this.setPolicyNum(policyNum);
        }

        //getter      
        public String getFName(){
                return firstName;
        }
        public String getLastName(){
                return lastName;
        }
        public String getPhoneNumber(){
                return phoneNumber;
        }
        public String cusAddress(){
                return cusAddress;
        }
        public String getemail(){
                return email;
        }
        public String getInsuranceName(){
                return insuranceName;
        }
        public String getPolicyNumber(){
                return policyNum;
        }

        // setter
        public void setFirstName(String newFirstName){
                this.firstName = newFirstName;
        }
        public void setLastName(String newLastName){
                this.lastName = newLastName;
        }
        public void setPhoneNumber(String newPhoneNumber){
                this.phoneNumber = newPhoneNumber;
        }
        public void setCusAddress(String newCusAddress){
                this.cusAddress = newCusAddress;
        }
        public void setEmail(String newEmail){
                this.email = newEmail;
        }
        public void setInsuranceName(String newInsuranceName){
                this.insuranceName = newInsuranceName;
        }
        public void setPolicyNum(String newPolicyNum){
                this.policyNum = newPolicyNum;
        }
};
