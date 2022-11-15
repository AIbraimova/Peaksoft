import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
    /*Company{
     * String name;
     * String address;
     * Course[]courses;
     * String languageOfInstruction;
     * } деген класс тузунуз
     * 2.Company классын мурастаган 2 класс тузунуз алар:
     * PeaksoftHouse, ItAcademy.
     * Course деген класс тузунуз(String programming  ,Group []groups ,
     * Instructor instructor,Mentor[] mentors )
     * Group деген класс тузунуз(Group name,Students[]students,LocalDate dateOfStart,LocalDate dateOfFinish)
     * Person деген абстрактный класс тузунуз(Long id,String fullName,int age, char gender).
     * Person классын мурастаган Instructor(double salary),Student (double contract )тузунуз.
     * Instructor классыны мурастаган Mentor деген класс тузунуз.
     * ~~~~~~~~~~~~~~~Methods~~~~~~~~~~
     * 1-Company классынын ичинде статичный  double income(Student[]students)деген метод  тузунуз,
     * ал метод бардык студенттердин контрагынын  суммасын кайтарсын.
     * 2-Person классынын ичинде abstract double period(Group group) бул методду Student,
     * Instructor жана Mentor классы реализация кылсын.Жалпы окутуу убактысына Instructor ,
     * Mentor канча зарплата алат,Student канча контракт толоосун ошону кайтарсын.
     */
        Student student1 = new Student(1200,34567890,"Aiperi Ibraimova",20,'F');
        Student student2 = new Student(8000,345678,"Akylbekov Sanzharbek",27,'M');
        Student student3 = new Student(10000,345678,"Baktybekov Eldar",22,'M');
        Student student4 = new Student(12000,345678,"Duisheeva Aiganysh",19,'F');
        Student student5 = new Student(5000,345678,"Beishekeev Jumadil",25,'M');
        Student [] students ={student1,student2,student3,student4,student5};

        Instructor instructor= new Instructor(30000, 345678, "Beisheev Dastan", 31, 'M');
        Instructor instructor1= new Instructor(35000, 345667, "Barpieva Jumagul", 25, 'F');
        Instructor instructor2= new Instructor(40000, 345668, "Korchubekova Aizada", 34, 'F');
        Instructor instructor3= new Instructor(38000, 345669, "Jeenbekov Asyl", 27, 'M');
        Instructor [] instructors ={instructor,instructor1,instructor2,instructor3};


        Mentor mentor=new Mentor(40000, 345671, "Junusov Jumadil", 23, 'M');
        Mentor mentor1=new Mentor(42000, 345672, "Jumagulova Kanykei", 25, 'F');
        Mentor mentor2=new Mentor(43000, 345673, "Bekkuliev BAktybek", 29, 'M');
        Mentor mentor3=new Mentor(44000, 345674, "Kozubaeva Gulnura", 31, 'F');
        Mentor [] mentors = {mentor,mentor1,mentor2,mentor3};

        Group group = new Group("Java 8",students,LocalDate.of(2022,10,1),LocalDate.of(2023,12,10));
        Group group1 = new Group("Java 7",students,LocalDate.of(2019,12,3),LocalDate.of(2020,9,20));
        Group group2 = new Group("JS",students,LocalDate.of(2008,10,2),LocalDate.of(2009,12,10));
        Group group3 = new Group("Phyton",students,LocalDate.of(2020,10,1),LocalDate.of(2021,10,3));
        Group [] groups ={group,group1,group2,group3};

        Course course = new Course("Phyton",groups,instructor1,mentors);
        Course course1 = new Course("C#",groups,instructor2,mentors);
        Course course2 = new Course("Js",groups,instructor3,mentors);
        Course [] courses = {course,course1,course2};

        Company company = new Company("Peaksofthouse","Grajdanskaya 119",courses,"Kyrgyz");
        Company company1 = new Company("Cybertek","Chicago",courses,"English");
        Company company2 = new Company("It Academy","Bishkek",courses,"Russian");
        Company [] companies = {company,company1,company2};

        System.out.println("Income Company:    "+Company.income(students));
        System.out.println("Instructor salary:   "+instructor2.getFullName() +"   "+instructor2.period(group));
        System.out.println("Mentor salary:    "+mentor3.getFullName()+"  "+ mentor3.getSalary());

    }
}