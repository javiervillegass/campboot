public class App {
    public static void main(String[] args) throws Exception {
    int numeroif=-2;

        if  (numeroif<0){
            System.out.println("numero negativo");
            }
        else if (numeroif>0){
            System.out.println("numero positivo");

        }
        else System.out.println("numero cero");
    
    int numerowhile=0;
    while (numerowhile<3){
        numerowhile++;
        System.out.println(numerowhile);
    }
    int numerodo=0;
    do {
        numerodo++;
        System.out.println(numerodo);
    }while(numerodo<-20);
    for (int numerofor=0;numerofor<3;numerofor++){
        System.out.println(numerofor);
    }
    var estacion = "verano";
    switch(estacion){
        case "verano":
        System.out.println("es verano");
        break;
        case "invierno":
        System.out.println("es invierno");
        break;
        case "primavera":
        System.out.println("es primavera");
        break;
        case "otoño":
        System.out.println("es otoño");
        break;
        default:
        System.out.println("no es estacion");


        }
    }

}


