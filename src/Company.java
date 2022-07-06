public class Company implements Comparable<Company> {
    String name;
    String owner;
    Integer factory; // How many factories

    public Company(String name, String owner, Integer factory) {
        this.name = name;
        this.owner = owner;
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getFactory() {
        return factory;
    }

    // interface Comparable implementation
    @Override
    public int compareTo(Company otherCompany) {
        return this.getName().compareTo(otherCompany.getName());
    }

    @Override
    public String toString() {
        return String.format("|Name: %20s |Owner: %10s |Number of factories %d |", this.name, this.owner, this.factory);
    }
}
