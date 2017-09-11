import tester.Tester;
// to represent a pet owner
class Person {
    String name;
    IPet pet;
    int age;
 
    Person(String name, IPet pet, int age) {
        this.name = name;
        this.pet = pet;
        this.age = age;
    }

    // TEMPLATE
    /*
      this.age -- int
     
     METHODS:
     this.older(Person that) -- boolean
     
     -> boolean 
     
     returns true if this person is older, false otherwise
     */
    boolean isOlder(Person that){
        if(this.age > that.age){
            return true;
        }
        else{
            return false;
        }
    }
}
// to represent a pet
interface IPet { }
 
// to represent a pet cat
class Cat implements IPet {
    String name;
    String kind;
    boolean longhaired;
 
    Cat(String name, String kind, boolean longhaired) {
        this.name = name;
        this.kind = kind;
        this.longhaired = longhaired;
    }
}
 
// to represent a pet dog
class Dog implements IPet {
    String name;
    String kind;
    boolean male;
 
    Dog(String name, String kind, boolean male) {
        this.name = name;
        this.kind = kind;
        this.male = male;
    }
}

class ExamplesIPet{
    ExamplesIPet(){}

            IPet raprap = new Dog ("Raprap", "Bulldog", false);
            IPet mitzi = new Cat ("Mitzi", "Shi Tzu", false);
            IPet aya = new Dog ("Aya", "Chihuahua", true);
            IPet tim = new Cat ("Tim", "Husky", true);

            Person dionne = new Person ("Dionne", raprap, 15); 
            Person kristine = new Person ("Kristine", mitzi, 16); 
            Person jazzryn = new Person ("Jazzryn", aya, 17);
            Person timothy = new Person ("Timothy", tim, 18);

            boolean testOlder(Tester t) {
            return
                    t.checkExpect(dionne.isOlder(kristine), false) &&
                    t.checkExpect(jazzryn.isOlder(dionne), true) &&
                    t.checkExpect(timothy.isOlder(jazzryn), true) &&
                    t.checkExpect(timothy.isOlder(dionne), true) &&
                    t.checkExpect(timothy.isOlder(jezza), true) &&
                    t.checkExpect(dionne.isOlder(jazzryn), false) &&
                    t.checkExpect(dionne.isOlder(timothy), false);
        }
}