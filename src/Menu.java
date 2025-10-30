import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;
    private Scanner sc;

    public Menu() {
        this.biblioteca = new Biblioteca();
        this.sc = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\n=== 🏛️ SISTEMA BIBLIOTECA ===");
            System.out.println("1- 📚 CADASTRAR LIVRO");
            System.out.println("2- 📖 LISTAR TODOS OS LIVROS");
            System.out.println("3- 🔍 BUSCAR LIVRO POR TÍTULO");
            System.out.println("4- 📥 EMPRESTAR LIVRO");
            System.out.println("5- 📤 DEVOLVER LIVRO");
            System.out.println("6- ❌ SAIR DO SISTEMA");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // ✅ LIMPAR BUFFER - IMPORTANTE!

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    biblioteca.listarLivros(); // ⚠️ Precisa criar este método
                    break;
                case 3:
                    buscarLivro();
                    break;
                case 4:
                    emprestarLivro();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    System.out.println("👋 Saindo do sistema...");
                    break;
                default:
                    System.out.println("❌ Opção inválida! Use 1-6.");
            }
        } while (opcao != 6);

        sc.close();
    }

    private void cadastrarLivro() {
        System.out.println("\n=== 📚 CADASTRAR NOVO LIVRO ===");

        System.out.print("Título: ");
        String titulo = sc.nextLine(); // ✅ nextLine() para textos completos

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Ano de publicação: ");
        int anoPublicacao = sc.nextInt();
        sc.nextLine(); // ✅ Limpar buffer após nextInt()

        // ✅ Criar livro COM DADOS usando construtor com parâmetros
        Livro novoLivro = new Livro(titulo, autor, anoPublicacao, false);
        biblioteca.cadastrarLivro(novoLivro);

        System.out.println("✅ Livro cadastrado com sucesso!");
    }

    private void buscarLivro() {
        System.out.println("\n=== 🔍 BUSCAR LIVRO ===");
        System.out.print("Digite o Título: ");
        String titulo = sc.nextLine();

        Livro livro = biblioteca.buscarLivro(titulo);
        if (livro != null) {
            System.out.println("✅ Livro encontrado: " + livro.toString());
        } else {
            System.out.println("❌ Livro não encontrado!");
        }
    }

    private void emprestarLivro() {
        System.out.println("\n=== 📥 EMPRESTAR LIVRO ===");
        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        biblioteca.emprestarLivro(titulo);
    }

    private void devolverLivro() {
        System.out.println("\n=== 📤 DEVOLVER LIVRO ===");
        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        biblioteca.devolverLivro(titulo);
    }
}