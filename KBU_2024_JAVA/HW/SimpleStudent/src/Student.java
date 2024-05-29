class Student {
    String name;
    Address homeAddress;
    Address schoolAddress;

    public Student (String name, Address homeAddress, Address schoolAddress){
        this.name = name;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public String getInfo() {
        return "Student Name : " + name + ", \n\t homeAddress : " + homeAddress.getInfo() + ", \n\t schoolAddress : " + schoolAddress.getInfo();
    }
}

