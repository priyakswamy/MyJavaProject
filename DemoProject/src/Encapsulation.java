
public class Encapsulation {

	public static void main(String[] args) {
	student stud = new student();
	stud.setAge(20);
	stud.setDept("ECE");
	stud.setRollno(34);
	System.out.println(stud.getAge());
	System.out.println(stud.getDept());
	System.out.println(stud.getRollno());
	college col = new college();
	col.attribute();
	}

}

class college {
public void attribute() {
	student stud = new student();
	stud.setAge(25);
	System.out.println(stud.getAge());
}
}

 class student{
private int rollno;
private int age;
private String dept;
private String type;
/**
 * @return the rollno
 */
public int getRollno() {
	return rollno;
}
/**
 * @param rollno the rollno to set
 */
public void setRollno(int rollno) {
	this.rollno = rollno;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the dept
 */
public String getDept() {
	return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
}