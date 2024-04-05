package www.experis.wishList;

public class Gift  implements Comparable<Gift> {
    // Attributes
    private String name;
    // Constructor

    public Gift(String name) {
        this.name = name;
    }

    // Getter e Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gift o) {
        return getName().compareTo(o.getName());
    }
}
