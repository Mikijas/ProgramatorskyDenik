import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Person Person = new Person("not found","not found","not found","not found","not found", "not found", "not found");
		String genderRegex = "(( Female | Male )|(pani|PANI)|((pan|PAN)|(muz|Muz)|(zena|Zena)))";
		String firstnameRegex = " ([A-ZÌŠÈØİÁÍÉÚÙ]{1}[a-zìšèøıáíéúùäöüß]*)";
		String surnameRegex = " [A-ZÌŠÈØİÁÍÉÚÙ]{1}[a-zìšèøıáíéúùäöüß]*";
		String addressRegex = "[A-ZÌŠÈØİÁÍÉÚÙzìšèøıáíéúùäöüß]{1}[a-zìšèøıáíéúùäöüßzìšèøıáíéúùäöüß]* [0-9]* ";
		String phoneNumberRegex = "( [0-9]{9} | [0-9]{3}\\\\s+[0-9]{3}\\\\s[0-9]{3}\\\\s+)"; //( [0-9]{9} | [0-9]{3}\\s+[0-9]{3}\\s[0-9]{3}\\s+) (\\d\\d\\d[.- ]\\d\\d\\d[.- ]\\d\\d\\d)
		String emailRegex = " [^\\@\\ ]*@[a-z]*((\\.com)|\\.\\w*) ";
	
		String letter1 = "Ing. Viktor Kaplan\n"
				+"øeditel\n"
				+"Kubova 13\n"
				+"363 01 OSTROV NAD OHØÍ\n"
				+"Vojkovice 8. záøí 2011\n"
				+"ádost o pøerušení studia ze zdravotních dùvodù\n"
				+"Váenı pane øediteli,\n"
				+"ádám o pøerušení studia mého syna Jana Medka, áka 3. roèníku tøídy 3. A. Dùvodem mé ádosti je vánı zdravotní stav mého syna.\n"
				+"Syn trpí delší dobu vánım ledvinovım onemocnìním, kvùli nìmu v prùbìhu bìného školního roku mìl nìkolik krátkodobıch a dvì dlouhodobé absence. Kromì toho nastupuje 14. øíjna 2011 na mìsíèní lázeòskou léèbu, je bude mít za následek další dlouhodobou nepøítomnost ve škole.\n"
				+"Podle prognózy lékaøe, která je souèástí pøiloené lékaøské zprávy, by se však synùv stav mìl zlepšit natolik, e by od zaèátku pøíštího školního roku mìl bıt schopen opakováním tøetího roèníku ve studiu pokraèovat. Vzhledem k dosavadnímu dobrému prospìchu mého syna\n"
				+"i k jeho zájmu studium zdárnì dokonèit vìøím, e mé ádosti vyhovíte.\n"
				+"S pozdravem František Medka\n";
		String letter2 = "Váenı pan\n" + 
				"MVDr. Daniel Trávníèek\n" + 
				"travnicek@gmail.com\n" + 
				"Fügnerova 269/56\n" + 
				"400 04 TRMICE\n" + 
				"\n" + 
				"Váenı pane doktore,\n" + 
				"pøipomínam Vám zítøejší konferenci veterináøù v Opavì\n" + 
				"\n" + 
				"Tìšíme se na Vás,\n" + 
				"HOTEL Opava\n";
		
		Pattern patternGender = Pattern.compile(genderRegex);
		Pattern patternFirstname = Pattern.compile(firstnameRegex);
		Pattern patternSurname = Pattern.compile(surnameRegex);
		Pattern patternAddress = Pattern.compile(addressRegex);
		Pattern patternPhoneNumber = Pattern.compile(phoneNumberRegex);
		Pattern patternEmail = Pattern.compile(emailRegex);
		//Choosing between letter1 & letter2
		//	String dopis = letter1;
		//or
		//	String dopis = letter2;
		
	String dopis = letter2;
		Matcher gender = patternGender.matcher(dopis);
		Matcher firstname = patternFirstname.matcher(dopis);
		Matcher surname = patternSurname.matcher(dopis);
		Matcher address = patternAddress.matcher(dopis);
		Matcher phoneNumber = patternPhoneNumber.matcher(dopis);
		Matcher email = patternEmail.matcher(dopis);
			
		gender.matches();
		firstname.matches();
		surname.matches();
		address.matches();
		phoneNumber.matches();
		email.matches();
		if(gender.find()) {
			Person.gender = gender.group();
		}
		if(firstname.find()) {
			Person.firstname = firstname.group();
		}
		while(surname.find()) {
			Person.surname = surname.group();
			if(Person.surname.equals(Person.firstname) == false) {
				break;
			}
		}
		if(address.find()) {
			Person.address = address.group();
		}
		if(phoneNumber.find()) {
			Person.phoneNumber = phoneNumber.group();
		}
		if(email.find()) {
			Person.email = email.group();
		}
		Person.RegexLanguage(dopis);
		System.out.println(Person);
	}
	

}
