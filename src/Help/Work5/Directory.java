package Help.Work5;

class Directory implements Comparable {
    int id;
    String name;
    String address;
    String phoneNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int compareTo(Object ob) throws ClassCastException {
        if (!(ob instanceof Directory))
            throw new ClassCastException("Error");
        int ide = ((Directory) ob).getId();
        return this.id - ide;
    }
}