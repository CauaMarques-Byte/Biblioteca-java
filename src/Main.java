public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 2000, false);

        Biblioteca biblioteca = new Biblioteca();

        Menu menu = new Menu();

        menu.iniciar();


    }
}
