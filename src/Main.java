public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 2000, false);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastratLivro(livro1);

        biblioteca.buscarLivro(livro1);

        biblioteca.emprestarLivro(livro1);

        biblioteca.devolverLivro(livro1);


    }
}
