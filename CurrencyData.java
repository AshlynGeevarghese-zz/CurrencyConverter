import java.util.Scanner;
public class CurrencyData extends Currency {
	private double usDollar = 0.00;
	private double hkDollar = 0.00;
	private double cDollar = 0.00;
	private double aDollar = 0.00;
	private double euros = 0.00;
	private double britishPound = 0.00;
	private double yen = 0.00;
	private double rupee = 0.00;
	private double franc = 0.00;
	private double peso = 0.00;
	private double ruble = 0.00;
	
	
	
	
	
	public CurrencyData (){
		String name = "";
		double currentAmount = 0.00;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which of the following currencies are you currently usuing?");
		System.out.println("1.United States Dollar" + "\n" +"2.Hong Kong Dollar" + "\n" + "3.Canadian Dollar" + "\n" + "4.Australian Dollar" + "5.Euros" + "\n" + "6.British Pound" + "\n"+ "7.Japanese Yen" + "\n"+"8.Indian Rupee" + "\n" + "9.Swiss Franc" +  "\n"+ "10.Mexican Peso" + "\n" + "11.Russian Ruble");
		int current = scan.nextInt();
		
		while (current>12||current<1||current == 12){
			System.out.println("You have entered an invalid currency assignment number. Please try again");
			System.out.println("Which of the following currencies are you currently usuing?");
			System.out.println("1.United States Dollar" + "\n" +"2.Hong Kong Dollar" + "\n" + "3.Canadian Dollar" + "\n" + "4.Australian Dollar" + "5.Euros" + "\n" + "6.British Pound" + "\n"+ "7.Japanese Yen" +"\n"+ "8.Indian Rupee" + "\n" + "9.Swiss Franc" +  "\n"+ "10.Mexican Peso" + "\n" + "11.Russian Ruble");
			current = scan.nextInt();
		}
		if (current  == 1|| current == 2|| current == 3|| current ==4|| current ==5|| current == 6|| current ==7 || current == 8|| current ==9|| current == 10||current ==11){
			if (current == 1){
				name = "US Dollars";
			}else if (current == 2 ){
				name = "Hong Kong Dollars";
			}else if (current == 3){
				name = "Canadian Dollars";
			}else if (current == 4){
				name = "Australian Dollars";
			}else if (current == 5){
				name = "Euros";
			}else if (current == 6){
				name = "British Pounds";
			}else if (current == 7){
				name = "Yens";
			}else if (current ==8){
				name = "Indian Rupee";
			}else if (current == 9){
				name ="Swiss Franc";
			}else if (current == 10){
				name = "Mexican Pesos";
			}else {
				name = "Russian Ruble";
			}//end of number to currency assignment
		}//end of if statment
		System.out.println("How many " + name +" would you like to convert?" );
		currentAmount = scan.nextDouble();
		
		System.out.println("Which of the folling currencies would you like to convert to??");
		System.out.println("1.United States Dollar" + "\n" +"2.Hong Kong Dollar" + "\n" + "3.Canadian Dollar" + "\n" + "4.Australian Dollar" + "5.Euros" + "\n" + "6.British Pound" + "\n"+ "7.Japanese Yen" +"\n"+ "8.Indian Rupee" + "\n" + "9.Swiss Franc" +  "\n"+ "10.Mexican Peso" + "\n" + "11.Russian Ruble");
		int convert = scan.nextInt();
		
		while (convert>12||convert<1||convert == 12){
			System.out.println("Which of the following currencies are you currently usuing?");
			System.out.println("1.United States Dollar" + "\n" +"2.Hong Kong Dollar" + "\n" + "3.Canadian Dollar" + "\n" + "4.Australian Dollar" + "5.Euros" + "\n" + "6.British Pound" + "\n"+ "7.Japanese Yen" +"\n"+ "8.Indian Rupee" + "\n" + "9.Swiss Franc" +  "\n"+ "10.Mexican Peso" + "\n" + "11.Russian Ruble");
			current = scan.nextInt();
		}
		if (convert  == 1|| convert == 2|| convert == 3|| convert ==4|| convert ==5|| convert == 6|| convert ==7 || convert == 8|| convert ==9|| convert == 10||convert ==11){
			if (convert == 1){
				name = "US Dollars";
			}else if (convert == 2 ){
				name = "Hong Kong Dollars";
			}else if (convert == 3){
				name = "Canadian Dollars";
			}else if (convert == 4){
				name = "Australian Dollars";
			}else if (convert == 5){
				name = "Euros";
			}else if (convert == 6){
				name = "British Pounds";
			}else if (convert == 7){
				name = "Yens";
			}else if (convert ==8){
				name = "Indian Rupee";
			}else if (convert == 9){
				name ="Swiss Franc";
			}else if (convert == 10){
				name = "Mexican Pesos";
			}else {
				name = "Russian Ruble";
			}//end of number to currency assignment
		}//end of if statment
		
		
		if (current == 1){
			setUnitedStatesDollar(current, currentAmount, convert);
		}else if (current == 2){
			setHongKongDollar(current, currentAmount, convert);
		}else if (current == 3){
			setCanadianDollar(current, currentAmount, convert);
		}else if (current == 4){
			setAustralianDollar(current, currentAmount, convert);
		}else if (current == 5){
			setEuros(current, currentAmount, convert);
		}else if (current == 6){
			setBritishPound(current, currentAmount, convert);
		}else if (current == 7){
			setYen(current, currentAmount, convert);
		}else if (current == 8){
			setRupee(current, currentAmount, convert);
		}else if (current == 9) {
			setFranc(current, currentAmount, convert);
		}else if (current == 10){
			setPesos(current, currentAmount, convert);
		}else if (current == 11){
			setRuble(current, currentAmount, convert);
		}else{
			System.out.println("You have entered a currency that cannot currently be converted");
		}
		
	}//end of CurrencyData method



	public void setUnitedStatesDollar(int a, double b, int c){
		if (c==2){
			hkDollar = b * 7.75;
			System.out.println(b + " United States dollars" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 1.29;
			System.out.println(b + " United States dollars" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 1.32;
			System.out.println(b + " United States dollars" + " is equal to " + aDollar + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.82;
			System.out.println(b + " United States dollars" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.74;
			System.out.println(b + " United States dollars" + " is equal to " + britishPound + " British Pound");
		}else if (c==7){
			yen = b * 103.56;
			System.out.println(b + " United States dollars" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 73.57;
			System.out.println(b + " United States dollars" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*0.89;
			System.out.println(b + " United States dollars" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*19.89;
			System.out.println(b + " United States dollars" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 74.05;
			System.out.println(b + " United States dollars" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " United States dollars" + " is equal to " + b + " United States Dollars");
		}//end of if else statment
	}// end of setUnitedStatesDollar method
	
	
	
	
	
	public void setHongKongDollar(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.13;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==3){
			cDollar = b * 0.17;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 0.17;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + aDollar + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.11;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.095;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + britishPound + " British Pound");
		}else if (c==7){
			yen = b * 13.36;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 9.52;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*0.11;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*2.56;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 9.53;
			System.out.println(b + " Hong Kong dollars" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Hong Kong dollars" + " is equal to " + b + " Hong Kong Dollars");
		}//end of if else statment
	}
	
	
	
	
	
	public void setCanadianDollar(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.78;
			System.out.println(b + " Canadian dollars" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 6.03;
			System.out.println(b + " Canadian dollars" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==4){
			aDollar = b * 1.02;
			System.out.println(b + " Canadian dollars" + " is equal to " + aDollar + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.64;
			System.out.println(b + " Canadian dollars" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.57;
			System.out.println(b + " Canadian dollars" + " is equal to " + britishPound + " British Pound");
		}else if (c==7){
			yen = b * 80.57;
			System.out.println(b + " Canadian dollars" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 57.40;
			System.out.println(b + " Canadian dollars" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*0.69;
			System.out.println(b + " Canadian dollars" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*15.45;
			System.out.println(b + " Canadian dollars" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 57.44;
			System.out.println(b + " Canadian dollars" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Canadian dollars" + " is equal to " + b + " Canadian Dollars");
		}//end of if else statment
	}
	
	
	
	
	public void setAustralianDollar(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.76;
			System.out.println(b + " Australian dollars" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 5.89;
			System.out.println(b + " Australian dollars" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 0.98;
			System.out.println(b + " Australian dollars" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==5){
			euros = b * 0.62;
			System.out.println(b + " Australian dollars" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.56;
			System.out.println(b + " Australian dollars" + " is equal to " + britishPound + " British Pound");
		}else if (c==7){
			yen = b * 78.78;
			System.out.println(b + " Australian dollars" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 55.93;
			System.out.println(b + " Australian dollars" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*0.68;
			System.out.println(b + " Australian dollars" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*15.11;
			System.out.println(b + " Australian dollars" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 56.21;
			System.out.println(b + " Australian dollars" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Australian dollars" + " is equal to " + b + " Australian Dollars");
		}//end of if else statment
	}
	
	
	
	
	public void setEuros(int a, double b, int c){
		if (c==1){
			usDollar = b * 1.22;
			System.out.println(b + " Euros" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 9.46;
			System.out.println(b + " Euros" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 1.57;
			System.out.println(b + " Euros" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 1.61;
			System.out.println(b + " Euros" + " is equal to " + euros + " Australian Dollar");
		}else if (c==6){
			britishPound = b * 0.90;
			System.out.println(b + " Euros" + " is equal to " + britishPound + " British Pound");
		}else if (c==7){
			yen = b * 126.25;
			System.out.println(b + " Euros" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 89.81;
			System.out.println(b + " Euros" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*1.09;
			System.out.println(b + " Euros" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*24.27;
			System.out.println(b + " Euros" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 90.49;
			System.out.println(b + " Euros" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Euros" + " is equal to " + b + " Euros");
		}//end of if else statment
	}
	
	
	
	
	public void setBritishPound(int a, double b, int c){
		if (c==1){
			usDollar = b * 1.33;
			System.out.println(b + " British Pounds" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 10.35;
			System.out.println(b + " British Pounds" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 1.72;
			System.out.println(b + " British Pounds" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 1.76;
			System.out.println(b + " British Pounds" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 1.11;
			System.out.println(b + " British Pounds" + " is equal to " + euros + " Euros");
		}else if (c==7){
			yen = b * 140.88;
			System.out.println(b + " British Pounds" + " is equal to " + yen + " Japanese Yens");
		}else if (c==8){
			rupee = b * 100.17;
			System.out.println(b + " British Pounds" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*1.19;
			System.out.println(b + " British Pounds" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b*26.53;
			System.out.println(b + " British Pounds" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 100.97;
			System.out.println(b + " British Pounds" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " British Pounds" + " is equal to " + b + " British Pounds");
		}//end of if else statment
	}
	
	
	
	public void setYen(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.0097;
			System.out.println(b + " Yen" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 0.075;
			System.out.println(b + " Yen" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 0.012;
			System.out.println(b + " Yen" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 0.013;
			System.out.println(b + " Yen" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.0079;
			System.out.println(b + " Yen" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.0071;
			System.out.println(b + " Yen" + " is equal to " + britishPound + " British Pounds");
		}else if (c==8){
			rupee = b * 0.71;
			System.out.println(b + " Yen" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b*0.0086;
			System.out.println(b + " Yen" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b* 0.19;
			System.out.println(b + " Yen" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 0.72;
			System.out.println(b + " Yen" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Yen" + " is equal to " + b + " Yen");
		}//end of if else statment
	}
	
	
	
	public void setRupee(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.014;
			System.out.println(b + " Indian Rupees" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 0.11;
			System.out.println(b + " Indian Rupees" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 0.018;
			System.out.println(b + " Indian Rupees" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 0.018;
			System.out.println(b + " Indian Rupees" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.011;
			System.out.println(b + " Indian Rupees" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.0100;
			System.out.println(b + " Indian Rupees" + " is equal to " + britishPound + " British Pounds");
		}else if (c==7){
			yen = b * 1.41;
			System.out.println(b + " Indian Rupees" + " is equal to " + yen + " Japanese Yen");
		}else if (c==9){
			franc = b*0.012;
			System.out.println(b + " Indian Rupees" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b* 0.27;
			System.out.println(b + " Indian Rupees" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b* 1.01;
			System.out.println(b + " Indian Rupees" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Indian Rupees" + " is equal to " + b + " Indian Rupees");
		}//end of if else statment
	}
	
	
	
	
	public void setFranc(int a, double b, int c){
		if (c==1){
			usDollar = b * 1.12;
			System.out.println(b + " Swiss Francs" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 8.72;
			System.out.println(b + " Swiss Francs" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 1.45;
			System.out.println(b + " Swiss Francs" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 1.48;
			System.out.println(b + " Swiss Francs" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.92;
			System.out.println(b + " Swiss Francs" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.83;
			System.out.println(b + " Swiss Francs" + " is equal to " + britishPound + " British Pounds");
		}else if (c==7){
			yen = b * 116.38;
			System.out.println(b + " Swiss Francs" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 82.75;
			System.out.println(b + " Swiss Francs" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==10){
			peso = b* 22.36;
			System.out.println(b + " Swiss Francs" + " is equal to " + peso + " Mexican Pesos");
		}else if (c==11){
			ruble = b * 83.42;
			System.out.println(b + " Swiss Francs" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Swiss Francs" + " is equal to " + b + " Swiss Francs");
		}//end of if else statment
	}
	
	
	
	public void setPesos(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.050;
			System.out.println(b + " Mexican Pesos" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 0.39;
			System.out.println(b + " Mexican Pesos" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 0.065;
			System.out.println(b + " Mexican Pesos" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 0.066;
			System.out.println(b + " Mexican Pesos" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.041;
			System.out.println(b + " Mexican Pesos" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.037;
			System.out.println(b + " Mexican Pesos" + " is equal to " + britishPound + " British Pounds");
		}else if (c==7){
			yen = b * 5.21;
			System.out.println(b + " Mexican Pesos" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 3.70;
			System.out.println(b + " Mexican Pesos" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b * 0.045;
			System.out.println(b + " Mexican Pesos" + " is equal to " + franc + " Swiss Francs");
		}else if (c==11){
			ruble = b* 3.73;
			System.out.println(b + " Mexican Pesos" + " is equal to " + ruble + " Rubles");
		}else {
			System.out.println(b + " Mexican Pesos" + " is equal to " + b + " Mexican Pesos");
		}//end of if else statment
	}
	
	
	
	
	public void setRuble(int a, double b, int c){
		if (c==1){
			usDollar = b * 0.013;
			System.out.println(b + " Russian Rubles" + " is equal to " + usDollar + " United States Dollars");
		}else if (c==2){
			hkDollar = b * 0.10;
			System.out.println(b + " Russian Rubles" + " is equal to " + hkDollar + " Hong Kong Dollars");
		}else if (c==3){
			cDollar = b * 0.017;
			System.out.println(b + " Russian Rubles" + " is equal to " + cDollar + " Canadian Dollars");
		}else if (c==4){
			aDollar = b * 0.018;
			System.out.println(b + " Russian Rubles" + " is equal to " + euros + " Australian Dollars");
		}else if (c==5){
			euros = b * 0.011;
			System.out.println(b + " Russian Rubles" + " is equal to " + euros + " Euros");
		}else if (c==6){
			britishPound = b * 0.0099;
			System.out.println(b + " Russian Rubles" + " is equal to " + britishPound + " British Pounds");
		}else if (c==7){
			yen = b * 1.40;
			System.out.println(b + " Russian Rubles" + " is equal to " + yen + " Japanese Yen");
		}else if (c==8){
			rupee = b * 0.99;
			System.out.println(b + " Russian Rubles" + " is equal to " + rupee + " Indian Rupees");
		}else if (c==9){
			franc = b * 0.012;
			System.out.println(b + " Russian Rubles" + " is equal to " + franc + " Swiss Francs");
		}else if (c==10){
			peso = b* 0.27;
			System.out.println(b + " Russian Rubles" + " is equal to " + peso + " Mexican Pesos");
		}else {
			System.out.println(b + " Russian Rubles" + " is equal to " + b + " Russian Rubles");
		}//end of if else statment
	}
	
}// end of class






































