class Emp{
    String pan;
    String name;
    double taxincome;
    double tax;

    void inputinfo(String pan, String name, double taxincome){
        this.pan=pan;
        this.name=name;
        this.taxincome=taxincome;
    }

    void taxcal(){
        if(taxincome<=250000)
            tax=0;
        else if(taxincome<=300000)
            tax=0.1*(taxincome-250000);
        else
            tax=5000+0.2*(taxincome-300000);

    }

    void displayInfo(){
        System.out.println("PAN="+pan);
        System.out.println("Name"+name);
        System.out.println("Taxable income: "+taxincome);
        System.out.println("tax"+tax);

    }

    public static void main(String args[]){
    Emp d=new Emp();
    d.inputinfo(args[0], args[1], Double.parseDouble(args[2]));
    d.taxcal();
    d.displayInfo();
}}