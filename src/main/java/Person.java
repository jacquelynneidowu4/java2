public class Person extends Animal{
    private String firstName="";
    private String lastName;
    private int socialSecurityNumber;
    private byte age;
    private static int count;

    public Person(){
       /* firstName="";
        lastName="";
        socialSecurityNumber="";
        age=0; */
        count++;

    }
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        age=0;
        count++;

    }
    public Person(String firstName, String lastName, byte age, int socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.socialSecurityNumber=socialSecurityNumber;
        count++;
    }
    public String speak(){
        if(!firstName.isEmpty()) {
            return "My name is " + firstName + " " + lastName + " and I am "
                    + this.getAge() + " years old";
        }
        return "I don't have a name";
    }
    public static int getPersonCount(){
        return count;
    }


}


