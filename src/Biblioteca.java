import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println(livro);
    }

    public void listarLivros() {
        livros.toArray();
        System.out.println(livros);
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo() != null && livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }



    public void emprestarLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null && !livro.isEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou já emprestado!");
        }
    }

    int escolher = 0;

    public void devolverLivro(String titulo) {
        Livro livro = buscarLivro(titulo);
        if (livro != null && livro.isEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não encontrado ou já disponível!");
        }
    }
}
