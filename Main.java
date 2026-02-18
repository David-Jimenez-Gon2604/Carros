public class Main{
    public static void main(String[] args) {
         //creo instancias
        Carros corvette = new Carros();
        corvette.setMarca( "Stingray");
        corvette.setSalida(2025);
        corvette.setVelocidad("1,500 caballos de fuerza");
        corvette.setCaja( true );

        System.out.println(corvette.getMarca());
        System.out.println(corvette.getSalida());
        System.out.println(corvette.getVelocidad());
        System.out.println(corvette.getCaja());

        Carros march = new Carros();
        march.setMarca( "Stingray");
        march.setSalida(2025);
        march.setVelocidad("1,500 caballos de fuerza");
        march.setCaja( true );

        System.out.println(march.getMarca());
        System.out.println(march.getSalida());
        System.out.println(march.getVelocidad());
        System.out.println(march.getCaja());

    }
}