import Celular.ICelular;


public class Cliente {

    public static void main (String [] args) {

        TiendaAbstractFactory appleFactory = new TiendaAppleFactory();

        ICelular celularApple =  appleFactory.createCelular();
        System.out.println(appleFactory.toString());


        TiendaAbstractFactory samsungFactory = new TiendaSamsungFactory();

        ICelular celularSamsung = samsungFactory.createCelular();
        System.out.println(samsungFactory.toString());
    }
}