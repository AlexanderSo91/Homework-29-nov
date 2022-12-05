public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    private static void task1() {
       System.out.println("\nЗадача1");
        var dog = 8;
     System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);}

    private static void task2() {
        System.out.println("\nЗадача2");
        var dog = 8;
        var result=dog /3.5;
        System.out.println(result);
        var cat = 3.6;
        result = cat + 4;
        System.out.println(result);
        var paper = 763789;
        result=paper+4;
        System.out.println(result);}

    private static void task3() {
        System.out.println("\nЗадача3");
        var dog = 8;
        var result = dog - 3.5;
        System.out.println(result);
        var cat = 3.6;
        result= cat-1.6;
        System.out.println(result);
        var paper = 763789;
        result=paper-7639;
        System.out.println(result);}

    private static void task4() {
        System.out.println("\nЗадача4");
        var friend = 19;
        System.out.println(friend);
        var result = friend + 2;
        System.out.println(result);
        result=friend/7;
        System.out.println(result);}



    private static void task5() {
        System.out.println("\nЗадача5");
        var frog = 3.5;
        System.out.println(frog);
        var result = frog * 10;
        System.out.println(result);
        result=frog/3.5;
        System.out.println(result);
        result= frog+ 1.0;
        System.out.println(result);}



    private static void task6() {
        System.out.println("\nЗадача6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var result=firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов"+ " " +result+ "кг");
        result= secondBoxer-firstBoxer;
        System.out.println("Разница между весами бойцов"+" " +result+ "кг");}

    private static void task7() {
        System.out.println("\nЗадача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var result= secondBoxer-firstBoxer;
        System.out.println("Разница между весами бойцов"+ " " +result+ "кг");
        var overload = secondBoxer % firstBoxer;
        System.out.println("Разница между весами бойцов"+ " "+ overload+ "кг");}


    private static void task8() {
        System.out.println("\nЗадача 8.1");
        var officeHours= 640;
        var hoursEveryDay= 8;
        var result= officeHours/hoursEveryDay;
        System.out.println("Всего работников в компании" + " "+ result + " "+ "человек");

        System.out.println("\nЗадача 8.2");
        var fellowWorker=80;
        var newFellowWorker=94;
        result = fellowWorker + newFellowWorker;
        officeHours = result / hoursEveryDay;
        System.out.println("Если в компании работает " + result + " человека, то всего " + officeHours + " час работы может быть поделено между сотрудниками");}
}

