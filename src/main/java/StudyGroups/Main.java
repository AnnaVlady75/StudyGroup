package StudyGroups;

import StudyGroups.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Ivan",18);
        service.addStudent("Semen",17);
        service.addStudent("Olga",20);
        service.addStudent("Elena",19);
        service.addStudent("Peter",21);
        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
