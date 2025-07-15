public class workshop {
    private String name;
    private String address;
    private Double age;
    private String phoneNumber;
    private Double pin;
    private Double accountNumber;
    private Double balance;

   public static void main  (String[] args) {
        workshop myWorkshop = new workshop();
        myWorkshop.setName("Tech Workshop");
        myWorkshop.setAddress("123 Tech Lane");
        myWorkshop.setAge(5.0);
        myWorkshop.setPhoneNumber("123-456-7890");
        myWorkshop.setPin(12345.0);
        myWorkshop.setAccountNumber(987654321.0);
        myWorkshop.setBalance(10000.0);

        System.out.println("Workshop Name: " + myWorkshop.getName());
        System.out.println("Address: " + myWorkshop.getAddress());
        System.out.println("Age: " + myWorkshop.getAge());
        System.out.println("Phone Number: " + myWorkshop.getPhoneNumber());
        System.out.println("PIN: " + myWorkshop.getPin());
        System.out.println("Account Number: " + myWorkshop.getAccountNumber());
        System.out.println("Balance: " + myWorkshop.getBalance());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getPin() {
        return pin;
    }

    public void setPin(Double pin) {
        this.pin = pin;
    }

    public Double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}




    