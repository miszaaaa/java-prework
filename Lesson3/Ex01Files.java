import java.io.*;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Ex01Files {
    public static void main(String[] args) {
        // System.out.println("Working Directory = " + System.getProperty("user.dir"));
        printFileInfo();
        int option = 0;
        do
        {
            System.out.println("Wybierz opcje:\n1. Drukuj plik\n2. Dodaj osobe\n3. Drukuj info o pliku \n4. Koniec");
            Scanner scanner = new Scanner(System.in);
            option = Integer.parseInt(scanner.nextLine());
            if(option == 1)
            {
                printPerson2List(getPersonsFromFile());
            }
            else if(option == 2)
            {
                addPersonToFile();
            }
            else if(option == 3)
            {
                printFileInfo();
            }
        } while(option != 4);
    }

    static ArrayList<Person2> getPersonsFromFile()
    {
        ArrayList<Person2> personList = new ArrayList<Person2>();
        try {
            File fileObj = new File(System.getProperty("user.dir"),"Lesson3\\Ex01Files.txt");
            Scanner myReader = new Scanner(fileObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] personArray = data.split(";");
                personList.add(new Person2(personArray[0], personArray[1], Integer.parseInt(personArray[2]), personArray[3], personArray[4], personArray[5]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return personList;
    }

    static void addPersonToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj płeć: ");
        String gender = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj email: ");
        String email = scanner.nextLine();
        System.out.println("Podaj telefon: ");
        String phoneNumber = scanner.nextLine();
        Person2 person = new Person2(firstName, lastName, age, gender, email, phoneNumber);
        File fileObj = new File(System.getProperty("user.dir"),"Lesson3\\Ex01Files.txt");
        try {
        BufferedWriter output = new BufferedWriter(new FileWriter(fileObj, true));
        output.newLine();
        output.append(person.toString());
        output.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    static void printPerson2List(ArrayList<Person2> list)
    {
        for(Person2 p : list)
        {
            System.out.println(p);
        }
    }

    static void printFileInfo()
    {
        File fileObj = new File(System.getProperty("user.dir"),"Lesson3\\Ex01Files.txt");
        if (fileObj.exists()) {
            System.out.println("File name: " + fileObj.getName());
            System.out.println("Absolute path: " + fileObj.getAbsolutePath());
            System.out.println("Writeable: " + fileObj.canWrite());
            System.out.println("Readable " + fileObj.canRead());
            System.out.println("File size in bytes " + fileObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

