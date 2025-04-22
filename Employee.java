class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;

    Employee(int id,String name,String position,double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void setName(String name){
        this.name = name;
    }

    void setId(int id){
        this.id = id;
    }

    void setPosition(String position){
        this.position = position;
    }

    void setSalary(double salary){
        this.salary = salary;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    String getPosition(){
        return position;
    }

    double getSalary(){
        return salary;
    }

    @Override

    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nPosition: " + position + "\nSalary: " + salary;
    }
}
