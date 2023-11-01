class Person
{
    String name;
    int saving;
    Person(String n, int amount)
    {
        name = n;
        saving = amount;
    }
    
    void introduce_self()
    {
        System.out.println("Hi, My name is " + name);
    }

    @Override
    public String toString() {
        return "I am " + name + ". My savings amount is " + saving;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + saving;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saving != other.saving)
            return false;
        return true;
    }

    boolean isWealthier(Person p)
    {
        if (this.saving > p.saving)
            return true;
        return false;
    }
    
    void reward(Person p, int amount)
    {
        p.saving += amount;
        this.saving -= amount;
    }
}