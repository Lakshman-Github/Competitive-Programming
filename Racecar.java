import java.util.*;
class Racecar
{
public static void main(String[]args)
{
int n=10;
Scanner in=new Scanner(System.in);
Racecar[] R=new Racecar[4];
for(int i=0;i<R.length;i++)
{

int CariD=in.nextInt();in.nextLine();
String Carname = in.nextLine();
String Carbrand = in.nextLine();
int Carprice = in.nextInt();in.nextLine();
}
String inputid = in.nextLine();
String inputbrand = in.nextLine();

Automobile();
CarRacing();

}
public static void  Automobile()
{
System.out.println("Car is available");
}
public static void CarRacing()
{
System.out.println("All cars are ready");
}
}
class car
{
int CariD;
String Carname;
String Carbrand;
int Carprice;

public car(int CariD,String Carname, String Carbrand,int Carprice)
{
this.CariD = CariD;
this.Carname=Carname;
this.Carbrand=Carbrand;
this.Carprice=Carprice;
}}
/*
public int getCarID()
{
return CariD;
}
public static setCarID(int CariD)
{
this.CariD=CariD;
}

public String getCarName()
{
return Carname;
}
public static setCarName(String Carname)
{
this.Carname=Carname;
}

public String getCarBrand()
{
return CarBrand;
}

public static setCarBrand(String Carbrand)
{
this.Carbrand=Carbrand;
}

public int getCarPrice()
{
return Carprice;
}

public static setCarPrice(int Carprice)
{
this.Carprice=Carprice;
}
} */





