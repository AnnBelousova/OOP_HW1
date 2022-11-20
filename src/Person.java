import java.time.LocalDate;

public class Person {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge(){
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth != 0 || yearOfBirth > 0){
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = 0;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isBlank() || !town.isEmpty()){
            this.town = town;
        }else {
            this.town = "Information was not provided";
        }

    }

    public String getGreetingMessage(String name){
        String message;
        if(name != "Information was not provided..."){
            message = "Let's get acquainted!";
        }else {
            message = "Sorry, I am not know your name!";
        }
        return message;
    }


    public Person(String name, String town, int age, String jobTitle) {
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }else{
            this.yearOfBirth = 0;
        }
        if (name == null || name.isEmpty() || name.isBlank()){
            this.name = "Information was not provided...";
        }else {
            this.name = "My name is " + name;
        }
        if (town != null || !town.isEmpty() || !town.isBlank()){
            this.town = "I am from " + town;
        }else {
            this.town = "Information was not provided...";
        }
        if (jobTitle != null || !jobTitle.isBlank() || !jobTitle.isEmpty()){
            this.jobTitle = "I am a " + jobTitle;
        }else {
            this.jobTitle = "Information was not provided...";
        }
    }

    @Override
    public String toString() {
        return "Hello!!!\n" + name +
                "\n" + town +
                "\nI was born in " + yearOfBirth +
                "\n" + jobTitle +
                "\n" + getGreetingMessage(name);

    }

}