class Reader
{
    public String Name;
    public String Surname;
    public String Patronymic;
    public int NumberTicket;
    public String Facultet;
    public String Date;
    public String NumberPhone;
    Reader(String name, String surname, String patronymic, int numberticket, String facultet, String date, String numberphone)
    {
        this.Name = name;
        this.Surname = surname;
        this.Patronymic = patronymic;
        this.NumberTicket =  numberticket;
        this.Facultet = facultet;
        this.Date = date;
        this.NumberPhone = numberphone;
    }
    public  void takeBook (int amount)
        {
            if (amount == 1)
        System.out.printf("%s %s %s взял(а) %d книгу\n",Surname,Name,Patronymic,amount);
            else
                System.out.printf("%s %s %s взял(а) %d книг(и)\n",Surname,Name,Patronymic,amount);
        }

    public void takeBook(String ... namesBooks){
        System.out.printf("%s %s %s взял(а) книги:", Surname, Name, Patronymic);
        for(int i = 0; i < namesBooks.length; i++)
            System.out.printf(" %s.", namesBooks[i]);
        System.out.println();
    }
    public void returnBook(int amount){
        {
            if (amount == 1)
                System.out.printf("%s %s %s вернул(а) %d книгу\n",Surname,Name,Patronymic,amount);
            else
                System.out.printf("%s %s %s вернул(а) %d книг(и)\n",Surname,Name,Patronymic,amount);
        }
    }
    public void returnBook(String... namesBooks){
        System.out.printf("%s %s %s вернул(-а) книги:", Surname, Name, Patronymic);
        for(int i = 0; i < namesBooks.length; i++)
            System.out.printf(" %s.", namesBooks[i]);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args)
    {
        Reader reader = new Reader("Алексей", "Уханов", "Александрович", 101, "Педагогический", "25/08/2006", "+79053677326");
        Reader reader1 = new Reader("Даниил", "Лапицкий", "Владимирович", 102, "Барабанный", "26/11/2006", "+79042691369");
        Reader reader2 = new Reader("Ислям", "Дулатов", "Ибрагимович", 103, "Киберспортивный", "18/11/2005", "+79586731643");
        Reader reader3 = new Reader("Елизавета", "Новикова", "Алексеевна", 105, "Художественный", "10/08/2006", "+79048507420");
        Reader[] readers = {reader, reader1, reader2, reader3};

        readers[0].takeBook(1);
        readers[0].returnBook(1);
        readers[1].takeBook(3);
        readers[1].returnBook(3);
        readers[2].takeBook(2);
        readers[2].returnBook(2);
        readers[3].takeBook(2);
        readers[3].returnBook(2);


        readers[0].takeBook("Как правильно пить и не опьянеть?");
        readers[0].returnBook("Как правильно пить и не опьянеть?");
        readers[1].takeBook("Обломов", "Раскольников", "Айвенго");
        readers[1].returnBook("Обломов", "Раскольников", "Айвенго");
        readers[2].takeBook("Все обо всем","Horizon Zero Dawn");
        readers[3].takeBook("Все как оно есть","КСГО");
        readers[3].returnBook("Все как оно есть","КСГО");


    }
}