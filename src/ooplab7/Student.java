package ooplab7;
//design class
// taking about Student?
// 1. student id
// 2. name
// 3. major
// 4. group
public class Student {
    private String id;
    private String name;
    private String major;
    private String group;

    //getter and setter methods
    //id
    public void setId(String id){
        this.id = id;
    }//setID
    public String getId(){
        return this.id;
    }//getID

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    //constructor
    //default
    public Student(){}
    public Student(String id,String n,String m,String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }// condtructor






}//class
