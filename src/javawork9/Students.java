package javawork9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
 
class Student implements Comparable<Student> {

	  private Integer stuId;
	  private String name;
	  private Integer age;
	  public Student() {
	  }
	  public Student(Integer stuId, String name, Integer age) {
	    this.stuId = stuId;
	    this.name = name;
	    this.age = age;
	  }
	  public Integer getStuId() {
	    return stuId;
	  }
	  public void setStuId(Integer stuId) {
	    this.stuId = stuId;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public Integer getAge() {
	    return age;
	  }
	  public void setAge(Integer age) {
	    this.age = age;
	  }
	  @Override
	  public int compareTo(Student stu) {
	    return this.age - stu.age;
	  }
	  public String toString(){
	    return "Student [age = " + age + ",name = " + name +",stuId = " + stuId + "]";
	  }
	}
public class Students {
	  public static void main(String[] args) {
	    Set<Student> stuSet = saveStudentInfo();
	    outputInfo(stuSet);
	  }
	  private static Set<Student> saveStudentInfo() {
	    Scanner input = new Scanner(System.in);
	    Set<Student> stuSet = new TreeSet<Student>();
	    while (true){
	      System.out.println("请输入学生信息（学号#姓名#年龄）");
	      String inputData = input.nextLine();

	      if ("exit".equals(inputData)){
	        break;
	      }

	      String [] info = inputData.split("#");

	      Student stu = new Student(Integer.parseInt(info[0]),info[1],
	        Integer.parseInt(info[2]));

	      stuSet.add(stu);
	    }
	    return stuSet;
	  }
	  private static void outputInfo(Set<Student> stuSet){
	    File file = new File("e:/student.txt");

	    FileWriter fw = null;
	    try {
	      fw = new FileWriter(file);
	      Iterator<Student> it = stuSet.iterator();
	      while (it.hasNext()){
	        String info = it.next().toString();

	        fw.write(info);

	        fw.write("\r\n");
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        fw.close();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	}