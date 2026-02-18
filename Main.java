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
        march.setMarca( "marcherraty");
        march.setSalida(2025);
        march.setVelocidad("90 caballos de fuerza");
        march.setCaja( true );

        System.out.println(march.getMarca());
        System.out.println(march.getSalida());
        System.out.println(march.getVelocidad());
        System.out.println(march.getCaja());

        Carros civic = new Carros();
        civic.setMarca( "civic del terror");
        civic.setSalida(2001);
        civic.setVelocidad("50,000 caballos de fuerza");
        civic.setCaja( true );

        System.out.println(civic.getMarca());
        System.out.println(civic.getSalida());
        System.out.println(civic.getVelocidad());
        System.out.println(civic.getCaja());

    }
}