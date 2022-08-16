public class Account {

//    Properties
    String id;
    String name;
    int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //     Methods
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }
}
