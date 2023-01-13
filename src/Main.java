public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var first = 78.2;
        var second = 82.7;
        System.out.println(first + second);
        System.out.println(second - first);

        //Задача 7
        System.out.println(second - first);
        System.out.println(second % first);
        
        //Задача 8
        var time = 640;
        var unit_time = 8;
        var personal = time / unit_time;
        System.out.println("Всего работников в компании - " + personal + " человек");
        personal = personal + 94;
        time = personal * unit_time;
        System.out.println("Если в компании работает " + personal +" человек, то всего "+ time + " часов работы может быть поделено между сотрудниками");
    }
}