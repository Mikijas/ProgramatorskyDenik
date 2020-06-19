import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
String gender;
String firstname;
String surname;
String address;
String phoneNumber;
String email;
String language;
public String getGender() {
	return gender;
}
public void setGender(String gender) throws MyLittleError{
	if(this.gender.equalsIgnoreCase("Female") || this.gender.equalsIgnoreCase("Male")  ) {
		this.gender = gender;
	}else {
		throw new MyLittleError("Female/male");
	}
	
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) throws MyLittleError {
	String regex = "[a-zA-Z]*";
	Pattern pattern = Pattern.compile(regex);
	Matcher word = pattern.matcher(firstname);
	if(word.matches()) {
	this.firstname = firstname;
	}else {
		throw new MyLittleError("Invalid Name");
	}
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public Person(String gender, String firstname, String surname, String address, String phoneNumber, String email,
		String language) {
	super();
	this.gender = gender;
	this.firstname = firstname;
	this.surname = surname;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.language = language;
}
public void RegexLanguage(String text){
	String languageRegexCzech = ".[ěščřýáíéúůˇ].";
	String languageRegexEnglish = "\\w";
	String languageRegexDeutch = ".[äöüß].";
	String languageRegexRussia = ".[йцукенгшщздлорпавыфячсмитьюъэхж].";
	
	int numberCZ = 0; int numberENG = 0; int numberRU = 0; int numberDE = 0;
	Pattern patternENG = Pattern.compile(languageRegexEnglish);
	Pattern patternCZ = Pattern.compile(languageRegexCzech);
	Pattern patternRU = Pattern.compile(languageRegexRussia);
	Pattern patternDE = Pattern.compile(languageRegexDeutch);
	
	Matcher Czech = patternCZ.matcher(text);
	Matcher English = patternENG.matcher(text);
	Matcher Deutch = patternDE.matcher(text);
	Matcher Russia = patternRU.matcher(text);
	
	Czech.matches();
	English.matches();
	Deutch.matches();
	Russia.matches();
	
	while(Czech.find()) numberCZ++;
	while(English.find()) numberENG++;
	while(Deutch.find()) numberDE++;
	while(Russia.find()) numberRU++;
	
	if(numberCZ > numberDE && numberCZ > numberRU) {
		this.language = "Czech";
	}else if(numberDE > numberRU) {
		this.language = "Deutch";
	}else {
		this.language = "Russia";
	}
	if(numberDE == 0 && numberCZ == 0 && numberRU == 0) {
		this.language = "English";
	}
	if(numberENG == 0 ) {
		this.language = "????";
	}

	
	
}
public void RegexNameAndSurName(String text) {
	
}
@Override
public String toString() {
	return "Gender:" + gender + ", FirstName: " + firstname + ", SurName: " + surname + ", Address:" + address
			+ ", PhoneNumber:" + phoneNumber + ", Email:" + email + ", Language:" + language;
}




}
