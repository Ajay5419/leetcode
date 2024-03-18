import java.util.Objects;

public class Student  implements Comparable<Student>{
	private String name;
	private String id;
	private String nameId;
	public String getNameId() {
		return nameId;
	}
	public void setNameId(String nameId) {
		this.nameId = this.name+""+this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	/*
	 * @Override public int compareTo(Student o) { // TODO Auto-generated method
	 * stub return (this.name.compareTo(o.getName())); }
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", nameId=" + nameId + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Student o) {
		
		return (this.name.compareTo(o.getName()));
	}
	

}
