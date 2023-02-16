public class Main {
    public static void main(String[] args) {

        Java java1 = new Java("Manas",27,'M',"cool.mega007@gmail.com");
        Java java2 = new Java("Abdymomun",17,'M',"abdymomun@gmail.com");
        Java java3 = new Java("Kanykey",16,'F',"knykey@gmail.com");
        Java java4 = new Java("Matmusa",22,'M',"matmusa@gmail.com");
        Java java5 = new Java("Abdumalik",20,'M',"abdumalik@gmail.com");

        Java[] java = {java1,java2,java3};
        Java[] javaa = {java5,java4};

        Android android1 = new Android("Jakshylyk",19,'M',"jakshylyk@gmail.com");
        Android android2 = new Android("Myktybek",39,'M',"myktybek@gmail.com");
        Android android3 = new Android("Ulan",29,'M',"ulan@gmail.com");

        Android[] android = {android1,android2};
        Android[] androids = {android3};

        Go go1 = new Go("Kairat",25,'M',"kairat@gmail.com");
        Go go2 = new Go("Jeengul",21,'F',"jeengul@gmail.com");
        Go[] go = new Go[]{go1};
        Go[] goo = new Go[]{go2};


        Company company = new Company("Peaksoft","Bishkek",java,android,go);
        Company company1 = new Company("Megacom","Bishkek",javaa,androids,goo);
        System.out.println(company);
        System.out.println(company1);
    }
}