/**
 * Created by Madhuranga on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        person.setEmail("djvudsnvc@gmail.vom");
        person.setName("Ksean");
        System.out.println(main.savePerson(person));
    }

    public Person savePerson(Person person){
        if (person==null){
            throw new IllegalArgumentException();
        }else{
            person.setId("adc");
            return person;
        }
    }
}

