package Exercise;
public class Name{
    private String firstName;
    private char mi;
    private String lastName;
  
    /** Construct a name with firstName, mi, and lastName */
    public Name(String firstName, char mi, String lastName) {
      this.firstName = firstName;
      this.mi = mi;
      this.lastName = lastName;
    }
  
    /** Return firstName */
    public String getFirstName() {
      return firstName;
    }
  
    /** Return middle name initial */
    public char getMi() {
      return mi;
    }
      /** Return lastName */
  public String getLastname() {
    return lastName;
  }

  /** Obtain full name */
  public String getFullName() {
    return firstName + ' ' + mi + ' ' + lastName;
  }
}
