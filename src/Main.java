public class Main {
    public static void main (String[] args) {
        // Задача1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача4
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var differenceWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println(differenceWeight);

        //Задача7
        var remainsWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(remainsWeight);

        //Задача8
        var allTime = 640;
        var timeForOne = 8;
        var numberOfEmployees = allTime / timeForOne;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек.");

        numberOfEmployees = numberOfEmployees + 94;
        var newAllTime = numberOfEmployees * 8;
        System.out.println("Если в компании работет " + numberOfEmployees + " человек, то всего " + newAllTime + " часов работы может быть поделено между сотрудниками.");


    }

}