public class OperacionesMatematicas {
    public int num1;
    public int num2;
    public int num3;
    public double numd;
    public double numd2;
    public double R;
    public double E;

    public OperacionesMatematicas(int num1, int num3, double R) {
        this.num1 = num1;
        this.num3 = num3;
        this.R=R;
    }

    public OperacionesMatematicas(int num1, int num2, int num3, double R, double E) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.R=R;
        this.E=E;
        
    }


    public OperacionesMatematicas(double numd, double numd2,double R, double E) {
        this.numd = numd;
        this.numd2 = numd2;
        this.R=R;
        this.E=E;
    }
    
    
    
    public void Resultado(int num1,int num3){
        R=num1+num3;
        System.out.print("La suma de "+ num1+ " y "+num3+" es: "+R);
    }
    
    public void Resultado(int num1,int num2, int num3){
        R=num1+num2+num3;
        E=R+5;
        System.out.print("La suma de "+ num1+ " , "+ num2+" y "+num3+" es: "+R+" + 5 es: "+E);
        
    }
    
    public void Resultado(double numd, double numd2){
        R=numd+numd2;
        E=R+2;
        System.out.print("La suma de "+numd+" y "+numd2+" es: "+R+" + 2 es: "+E);
    }
    
    public static void main(String[]args){
        OperacionesMatematicas Om1=new OperacionesMatematicas(5,4,0);
        Om1.Resultado(5,4);
        
        OperacionesMatematicas Om2=new OperacionesMatematicas(1,2,3,0,0);
        Om2.Resultado(1,2,3);
        
        OperacionesMatematicas Om3=new OperacionesMatematicas(1.5,2.5,0,0);
        Om3.Resultado(1.5,2.5);
    }

}
