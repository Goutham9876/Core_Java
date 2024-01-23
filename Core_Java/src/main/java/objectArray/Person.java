public class Person{

    private String ssn,phoneNumber;
    private double height,weight;
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Person(String ssn, String phoneNumber, double height, double weight) {
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return ssn.equals(person.ssn);
    }





    public static void main(String arg[]){
        // Create an unsorted array of Person objects
        Person[] persons_List = {
                new Person( "6789","913-555-5678",5.4,60),
                new Person("8789", "658-783-9876",5.3, 55),
                new Person("6574", "689-567-3452", 5.5, 57)
        };//object creation

        Person targetPerson = new Person("6789", "913-555-5678", 5.4, 60);


        boolean found = false;
        for (Person person : persons_List) {

            if (person.equals(targetPerson)) {
                found = true;
                break;
            }//end of if cond
        }//end of for loop

        System.out.println("Person with matching SSN found in the unsorted array: " + found);




    }

}

