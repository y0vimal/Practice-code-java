package general.lambdas;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Practice {

//   static class myComparator implements Comparator<Person> {
//        public int compare(Person p1, Person p2){
//            return p1.getLastName().compareTo(p2.getLastName());
//        }
//    }
    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("John", "Wick", 38),
                new Person("Sherlock", "Holmes", 45),
                new Person("John", "Watson", 48),
                new Person("Mycroft", "Holmes", 50)
        );

        // 1. sort the people based on last name

//        Collections.sort(people, new myComparator());

//        Collections.sort(people,
//
//                new Comparator<Person> (){
//
//                    public int compare(Person o1, Person o2){
//                        return o1.getLastName().compareTo(o2.getLastName());
//                    }
//                }
//
//        );

        Collections.sort(people,
                 (o1, o2) -> {
                        return o1.getLastName().compareTo(o2.getLastName());
                }
        );
        //people.forEach(person -> System.out.println(person.toString()));
//        Printable lambdaPrint = personList -> {
//            /*for(Person person : personList){
//                System.out.println(person.getLastName().charAt(0) == 'W' ? person.toString() : "");
//            }*/
//
//            personList.forEach(person -> {
//                String valueToBePrinted = person.getLastName().startsWith("W") ? person.toString() : "";
//                System.out.println(valueToBePrinted);
//            });
//        };
//
//        lambdaPrint.print(people);

//        printAll(people, new Condition() {
//            @Override
//            public Boolean test(Person person) {
//                return person.getLastName().charAt(0) == 'H';
//            }
//        });

        printAll(people, person -> person.getLastName().charAt(0) == 'W');
    }

    static void printAll(List<Person> people, Predicate<Person> predicate){
        people.forEach(
                person -> {
                    System.out.println(
                            predicate.test(person) ? person.toString() : ""
                    );
                }
        );
    }



}
