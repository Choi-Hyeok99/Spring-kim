package hello.core;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {

        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(12);
        helloLombok.setName("ooo");

        System.out.println("helloLombok = " + helloLombok);
    }
}
