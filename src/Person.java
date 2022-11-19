public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public String getGreetingMessage(String name){
        String message;
        if(name != "Information was not provided..."){
            message = "Let's get acquainted!";
        }else {
            message = "Sorry, I am not know your name!";
        }
        return message;
    }

    public Person(String name, String town, int yearOfBirth, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = 0;
        }
        if (name != null && name != ""){
            this.name = "My name is : " + name + ".";
        }else {
            this.name = "Information was not provided...";
        }
        if (town != null && town != ""){
            this.town = "I am from : " + town + ".";
        }else {
            this.town = "Information was not provided...";
        }
        if (jobTitle != null && jobTitle != ""){
            this.jobTitle = "I am : " + jobTitle + ".";
        }else {
            this.jobTitle = "Information was not provided...";
        }
    }

    @Override
    public String toString() {
        return "Hello!!!\n" + name +
                "\n" + town +
                ". \nI was born in " + yearOfBirth +
                ". \n" + jobTitle +
                ". \n" + getGreetingMessage(name);

    }

}

