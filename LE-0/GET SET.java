
class Juet
{
    int age;
    String name;
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Main
{
	public static void main(String[] args) {
		Juet a = new Juet();
		a.setAge(5);
		int age = a.getAge();
		System.out.println(age);
	}
}