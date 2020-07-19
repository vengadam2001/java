interface LG{
    String CompanyName="LG",CEOName="stv",Companytype="Tech" ;
    long Noofbranch = 30000 ;
}
interface company{
    String CompanyName="Info Tech",CEOName="Tvs",Companytype="Tech";
	long NoofEmployee=1000;

}
class  InfoTech implements company {
	void disp(){
            System.out.println("Company Name:"+CompanyName);
            System.out.println("CEO Name:"+CEOName);
            System.out.println("Company type:"+Companytype);
            System.out.println("No of Employees:"+NoofEmployee);   
    	}
}
public class company_survey {
    public static void main(String[] args){
        InfoTech a=new InfoTech();
        a.disp();
    }
}

