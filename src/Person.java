public class Person {
    private String firstName;
    private String lastName;
    private int age = 0;

    public boolean isTeen(){
        if((this.age > 12) && (this.age < 20)){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        } else if (this.firstName.isEmpty()){
            return this.lastName;
        } else if (this.lastName.isEmpty()){
            return this.firstName;
        } else return (this.firstName + " " + this.lastName);
    }

    public void setFirstName (String name){
        this.firstName = name;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName (String name){
        this.lastName = name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAge (int newAge){
        if ((newAge >= 0) && (newAge <= 100)){
            this.age = newAge;
        } else {
            this.age = 0;
        }
    }
    public int getAge(){
        return this.age;
    }


}
