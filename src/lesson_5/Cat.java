package lesson_5;

public class Cat {

        Cat() {
            System.out.println("I was born");
        }

         int age;
         String name;

         void say() {
             System.out.println("Cat " + name + " says 'Meow!' ");
         }

//         void  saySomething(String value) {
//             System.out.println("Cat " + name + " say " + value);
//
//         }
        void say(String value) {
            System.out.println("Cat " + name + " say " + value);
        }

    }

