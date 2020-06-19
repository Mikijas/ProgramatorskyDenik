import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Person Person = new Person("not found","not found","not found","not found","not found", "not found", "not found");
		String genderRegex = "(( Female | Male )|(pani|PANI)|((pan|PAN)|(muz|Muz)|(zena|Zena)))";
		String firstnameRegex = " ([A-Z̊��������]{1}[a-z�������������]*)";
		String surnameRegex = " [A-Z̊��������]{1}[a-z�������������]*";
		String addressRegex = "[A-Z̊��������z�������������]{1}[a-z�������������z�������������]* [0-9]* ";
		String phoneNumberRegex = "( [0-9]{9} | [0-9]{3}\\\\s+[0-9]{3}\\\\s[0-9]{3}\\\\s+)"; //( [0-9]{9} | [0-9]{3}\\s+[0-9]{3}\\s[0-9]{3}\\s+) (\\d\\d\\d[.- ]\\d\\d\\d[.- ]\\d\\d\\d)
		String emailRegex = " [^\\@\\ ]*@[a-z]*((\\.com)|\\.\\w*) ";
	
		String letter1 = "Ing. Viktor Kaplan\n"
				+"�editel\n"
				+"Kubova 13\n"
				+"363 01 OSTROV NAD OH��\n"
				+"Vojkovice 8. z��� 2011\n"
				+"��dost o p�eru�en� studia ze zdravotn�ch d�vod�\n"
				+"V�en� pane �editeli,\n"
				+"��d�m o p�eru�en� studia m�ho syna Jana Medka, ��ka 3. ro�n�ku t��dy 3. A. D�vodem m� ��dosti je v�n� zdravotn� stav m�ho syna.\n"
				+"Syn trp� del�� dobu v�n�m ledvinov�m onemocn�n�m, kv�li n�mu� v pr�b�hu b�n�ho �koln�ho roku m�l n�kolik kr�tkodob�ch a dv� dlouhodob� absence. Krom� toho nastupuje 14. ��jna 2011 na m�s��n� l�ze�skou l��bu, je� bude m�t za n�sledek dal�� dlouhodobou nep��tomnost ve �kole.\n"
				+"Podle progn�zy l�ka�e, kter� je sou��st� p�ilo�en� l�ka�sk� zpr�vy, by se v�ak syn�v stav m�l zlep�it natolik, �e by od za��tku p��t�ho �koln�ho roku m�l b�t schopen opakov�n�m t�et�ho ro�n�ku ve studiu pokra�ovat. Vzhledem k dosavadn�mu dobr�mu prosp�chu m�ho syna\n"
				+"i k jeho z�jmu studium zd�rn� dokon�it v���m, �e m� ��dosti vyhov�te.\n"
				+"S pozdravem Franti�ek Medka\n";
		String letter2 = "V�en� pan\n" + 
				"MVDr. Daniel Tr�vn��ek\n" + 
				"travnicek@gmail.com\n" + 
				"F�gnerova 269/56\n" + 
				"400 04 TRMICE\n" + 
				"\n" + 
				"V�en� pane doktore,\n" + 
				"p�ipom�nam V�m z�t�ej�� konferenci veterin��� v Opav�\n" + 
				"\n" + 
				"T��me se na V�s,\n" + 
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
