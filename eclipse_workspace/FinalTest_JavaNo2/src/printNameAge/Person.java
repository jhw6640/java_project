package printNameAge;

//Person 클래스 생성
class Person implements Comparable<Object> {
	//이름과 나이를 private 형태로 변수 선언
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }    

	//Comparable 인터페이스의 compareTo() 메서드
	//인자로 넘어온 같은 타입의 다른 객체와 대소 비교해서, 객체를 정렬하기 위하여 사용한다.
    @Override
    public int compareTo(Object object) {
       Person person = (Person)object;
       return person.age - this.age;
    }
    
    @Override
    public String toString() {
        return name + " : " + age;
    }
}