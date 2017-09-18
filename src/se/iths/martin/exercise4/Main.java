package se.iths.martin.exercise4;

import se.iths.martin.v4.Program;

public class Main {

    public static void testComputer(Computer computer){
        computer.boot();
        computer.crash();
        computer.reinstall();
    }
    public static void testProgrammer(Programmer programmer)
    {
        programmer.work(4);
        programmer.work(8);
        programmer.work(12);
    }

    public static void main(String[] args) {
        testComputer(new Computer("Generic",2017,1000,1000));
        testComputer(new PC("Lenovo",2016,1000,1000));
        testComputer(new Mac("Air",2015,1000,1000));

        Programmer appProgrammer =  new AppProgrammer("Steve",new String[]{"Java","C++","JavaScript","Swift","Fortran"},new Mac("Air",2015,1000,1000));
        Programmer dotNetProgrammer = new DotNetProgrammer("Martin",new String[]{"Java","C++","JavaScript","C#","Visual Basic"},new PC("Lenovo",2017,1000,1000));

        testProgrammer(appProgrammer);
        testProgrammer(dotNetProgrammer);
    }
}
